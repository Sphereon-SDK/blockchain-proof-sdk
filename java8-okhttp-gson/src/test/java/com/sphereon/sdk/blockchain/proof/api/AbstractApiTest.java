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
import com.sphereon.sdk.blockchain.proof.model.StoredSettings;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public abstract class AbstractApiTest {
    public static final String APPLICATION_NAME = "tests.blockchain-proof";
    public static final String TEST_CONFIG_BASENAME = "sphereoncstest";
    public static final String TEST_CONTEXT_MULTICHAIN = "multichain";
    public static final long TOKEN_VALIDITY_SECONDS = 5400;
    public static final int CONNECTION_TIMEOUT = 40000;

    private static byte[] hashingSecret = "SphereonTestSecret".getBytes();

    public static String unitTestConfigName;
    public static byte[] registeredContent;
    public static File registeredContentFileForStream;
    public static String settingsChainId;
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


    protected StoredSettings createProofAndSettingsChain() throws ApiException {
        ChainSettings settings = new ChainSettings();
        settings.setVersion(ChainSettings.VersionEnum.NUMBER_1);
        settings.setSecret(hashingSecret);
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
        StoredSettings storedSettings = configurationResponse.getStoredSettings();
        Assert.assertNotNull(storedSettings);
        Assert.assertNotNull(storedSettings.getContext());
        Assert.assertNotNull(storedSettings.getChainSettings());
        Assert.assertNotNull(storedSettings.getSingleProofChain());
        Assert.assertNotNull(storedSettings.getSettingsChain());
        Assert.assertNotNull(storedSettings.getChainConfiguration());
        Assert.assertNotNull(storedSettings.getChainSettings().getSingleProofChain());
        Assert.assertNotNull(storedSettings.getChainSettings().getHashAlgorithm());
        module.log(message, 0);
        settingsChainId = storedSettings.getSettingsChain().getChainId();
        proofChainId = storedSettings.getSingleProofChain().getChainId();
        return storedSettings;
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
        apiClient.setAccessToken(tokenRequest.execute().getAccessToken());
    }
}