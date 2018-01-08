package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import com.sphereon.sdk.blockchain.proof.handler.ApiException;
import com.sphereon.sdk.blockchain.proof.model.ChainSettings;
import com.sphereon.sdk.blockchain.proof.model.ConfigurationResponse;
import com.sphereon.sdk.blockchain.proof.model.CreateConfigurationRequest;
import com.sphereon.sdk.blockchain.proof.model.StoredSettings;
import org.junit.Assert;
import org.junit.Before;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public abstract class AbstractApiTest {
    protected static final String TEST_CONFIG_BASENAME = "sphereoncstest";
    protected static final String TEST_CONTEXT_MULTICHAIN = "multichain";
    public static final int CONNECTION_TIMEOUT = 40000;

    protected static String fixedAccessToken = System.getenv("tests.dotnet.bcproof.accesstoken");

    private static byte[] hashingSecret = "SphereonTestSecret".getBytes();

    protected static String unitTestConfigName;
    protected static byte[] registeredContent;
    protected static File registeredContentFileForStream;
    protected static String settingsChainId;
    protected static String proofChainId;
    protected static ConfigurationApi configurationApi;

    static {
        unitTestConfigName = TEST_CONFIG_BASENAME + System.currentTimeMillis() / 1000;
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
        settingsChainId = storedSettings.getSettingsChain().getChainId();
        proofChainId = storedSettings.getSingleProofChain().getChainId();
        return storedSettings;
    }


    protected void configureApi(ApiClient apiClient) {
        apiClient.setAccessToken(fixedAccessToken);
        apiClient.setConnectTimeout(CONNECTION_TIMEOUT);
        apiClient.getHttpClient().setReadTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS);
        apiClient.getHttpClient().setWriteTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS);
        String gatewayUrl = System.getenv("tests.dotnet.bcproof.gateway-url");
        if (gatewayUrl != null && gatewayUrl.length() > 0) {
            apiClient.setBasePath(gatewayUrl);
        }
    }
}