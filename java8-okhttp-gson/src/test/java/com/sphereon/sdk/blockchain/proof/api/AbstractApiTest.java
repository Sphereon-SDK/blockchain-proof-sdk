package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.libs.authentication.api.AuthenticationApi;
import com.sphereon.libs.authentication.api.TokenRequest;
import com.sphereon.libs.authentication.api.config.ApiConfiguration;
import com.sphereon.libs.authentication.api.config.PersistenceMode;
import com.sphereon.libs.authentication.api.config.PersistenceType;
import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import com.sphereon.sdk.blockchain.proof.handler.ApiException;
import com.sphereon.sdk.blockchain.proof.model.ChainSettings;
import com.sphereon.sdk.blockchain.proof.model.ConfigurationResponse;
import com.sphereon.sdk.blockchain.proof.model.CreateConfigurationRequest;
import com.sphereon.sdk.blockchain.proof.model.ModelConfiguration;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;

import java.io.File;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

public abstract class AbstractApiTest {
    public static final String APPLICATION_NAME = "test";
    public static final String TEST_CONFIG_BASENAME = "sphereoncstest";
    public static final String TEST_CONTEXT_MULTICHAIN = "multichain";
    public static final long TOKEN_VALIDITY_SECONDS = 5400;
    public static final int CONNECTION_TIMEOUT = 40000;

    protected static String hashingSecret = Base64.getEncoder().encodeToString("SphereonTestSecret".getBytes());

    public static String unitTestConfigName;
    public static byte[] registeredContent;
    public static File registeredContentFileForStream;
    public static String configId;
    public static String proofChainId;
    public static ConfigurationApi configurationApi;

    private static final AuthenticationApi authenticationApi;

    static {
        unitTestConfigName = TEST_CONFIG_BASENAME + System.currentTimeMillis() / 1000;

        ApiConfiguration tokenApiConfig = new ApiConfiguration.Builder()
                                              .withApplication(APPLICATION_NAME)
                                              .withPersistenceType(PersistenceType.SYSTEM_ENVIRONMENT)
                                              .withPersistenceMode(PersistenceMode.READ_WRITE)
                                              .withAutoEncryptSecrets(true)
                                              .build();
        authenticationApi = new AuthenticationApi.Builder().withConfiguration(tokenApiConfig).build();

    }

    @Before
    public void CreateConfigurationApi() {
        configurationApi = new ConfigurationApi();
        configureApi(configurationApi.getApiClient());
    }


    protected ModelConfiguration createProofAndSettingsChain() throws ApiException {
        ChainSettings settings = new ChainSettings();
        settings.setVersion(ChainSettings.VersionEnum.NUMBER_1);
        settings.setHashAlgorithm(ChainSettings.HashAlgorithmEnum._256);
        settings.setContentRegistrationChainTypes(Arrays.asList(
            ChainSettings.ContentRegistrationChainTypesEnum.PER_HASH_PROOF_CHAIN,
            ChainSettings.ContentRegistrationChainTypesEnum.SINGLE_PROOF_CHAIN));

        CreateConfigurationRequest createConfiguration = new CreateConfigurationRequest();
        createConfiguration.setName(unitTestConfigName);
        createConfiguration.setInitialSettings(settings);
        createConfiguration.setContext(TEST_CONTEXT_MULTICHAIN);
        createConfiguration.setAccessMode(CreateConfigurationRequest.AccessModeEnum.PRIVATE);

        ConfigurationResponse configurationResponse = configurationApi.createConfiguration(createConfiguration);
        ModelConfiguration configuration = configurationResponse.getConfiguration();
        Assert.assertNotNull(configuration);
        Assert.assertNotNull(configuration.getContext());
        Assert.assertNotNull(configuration.getChainSettings());
        Assert.assertNotNull(configuration.getSingleProofChain());
        Assert.assertNotNull(configuration.getChainSettings().getSingleProofChain());
        Assert.assertNotNull(configuration.getChainSettings().getHashAlgorithm());
        configId = configuration.getId();
        proofChainId = configuration.getSingleProofChain().getChainId();
        return configuration;
    }


    protected void configureApi(ApiClient apiClient) {
        apiClient.setConnectTimeout(CONNECTION_TIMEOUT);
        apiClient.getHttpClient().setReadTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS);
        apiClient.getHttpClient().setWriteTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS);

        String gatewayUrl = System.getProperty("tests.blockchain-proof.gateway-url");
        if (StringUtils.isNotEmpty(gatewayUrl)) {
            gatewayUrl = System.getenv("tests.blockchain-proof.gateway-url");
        }
        if (StringUtils.isNotEmpty(gatewayUrl)) {
            apiClient.setBasePath(gatewayUrl);
        }

        TokenRequest tokenRequest = authenticationApi.requestToken()
                                        .withValidityPeriod(TOKEN_VALIDITY_SECONDS)
                                        .build();
        final String accessToken = tokenRequest.execute().getAccessToken();
        apiClient.setAccessToken(accessToken);
    }
}