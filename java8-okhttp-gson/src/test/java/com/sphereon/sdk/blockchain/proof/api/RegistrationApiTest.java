/*
 * Blockchain Proof
 * With the Blockchain Proof API it is easy to prove or disprove existence of data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not    Full API Documentation: https://docs.sphereon.com/api/blockchain-proof/0.9/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiException;
import com.sphereon.sdk.blockchain.proof.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * API tests for RegistrationApi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegistrationApiTest extends AbstractApiTest {

    private static final String ANY_REQUEST_ID = "any";

    private final RegistrationApi registrationApi = new RegistrationApi();
    private final VerificationApi verificationApi = new VerificationApi();


    @Before
    public void init() {
        configureApi(registrationApi.getApiClient());
        configureApi(verificationApi.getApiClient());
    }


    @Test
    public void _010_createConfigurationTest() throws ApiException {
        createProofAndSettingsChain();
    }


    @Test
    public void _020_getConfigurationTest() throws ApiException {
        ConfigurationResponse configurationResponse = configurationApi.getConfiguration(unitTestConfigName);
        Assert.assertNotNull(configurationResponse);
        ModelConfiguration configuration = configurationResponse.getConfiguration();
        Assert.assertNotNull(configuration);
        Assert.assertNotNull(configuration.getContext());
        Assert.assertNotNull(configuration.getChainSettings());
        Assert.assertNotNull(configuration.getSingleProofChain());
        Assert.assertNotNull(configuration.getChainSettings().getSingleProofChain());
        Assert.assertNotNull(configuration.getChainSettings().getHashAlgorithm());
        Assert.assertNotNull(configuration.getId(), configId);
        Assert.assertEquals(configuration.getSingleProofChain().getChainId(), proofChainId);
    }


    @Test
    public void _030_RegisterUsingContentTest() throws ApiException {
        String requestId = UUID.randomUUID().toString();
        registeredContent = ("test-" + requestId).getBytes();
        ContentRequest contentRequest = new ContentRequest();
        contentRequest.setContent(registeredContent);
        contentRequest.setHashProvider(ContentRequest.HashProviderEnum.SERVER);
        RegisterContentResponse response = registrationApi.registerUsingContent(unitTestConfigName, contentRequest, requestId,
            hashingSecret, null, null);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getSingleProofChain());
        Assert.assertNotNull(response.getPerHashProofChain());
        Assert.assertEquals(requestId, response.getRequestId());
    }


    @Test
    public void _040_registerUsingLocationTest() {

    }


    @Test
    public void _050_RegisterUsingStreamTest() throws IOException, ApiException {
        String requestId = UUID.randomUUID().toString();
        registeredContentFileForStream = File.createTempFile("random", ".tmp");
        registeredContentFileForStream.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(registeredContentFileForStream)) {
            out.write(("test-" + requestId).getBytes());
        }
        RegisterContentResponse response = registrationApi.registerUsingStream(unitTestConfigName, registeredContentFileForStream,
            registeredContentFileForStream.getName(), "RandomFile", hashingSecret, null, null);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getSingleProofChain());
        Assert.assertNotNull(response.getSingleProofChain());
        Assert.assertEquals("RandomFile", response.getRequestId());
    }


    @Test
    public void _060_verifyUsingContentTest() throws InterruptedException, ApiException {
        Thread.sleep(15000); // Should be enough for multichain registration
        ContentRequest contentRequest = new ContentRequest();
        contentRequest.setHashProvider(ContentRequest.HashProviderEnum.SERVER);
        contentRequest.setContent(registeredContent);
        VerifyContentResponse response = verificationApi.verifyUsingContent(unitTestConfigName, contentRequest, ANY_REQUEST_ID, hashingSecret,
            null, null);
        Assert.assertNotNull(response);
        Assert.assertTrue(response.getRegistrationState() == VerifyContentResponse.RegistrationStateEnum.REGISTERED
                              || response.getRegistrationState() == VerifyContentResponse.RegistrationStateEnum.PENDING);
        Assert.assertNotNull(response.getSingleProofChain());
        Assert.assertNotNull(response.getPerHashProofChain());
        Assert.assertEquals(ANY_REQUEST_ID, response.getRequestId());
    }


    @Test
    public void _070_verifyUsingLocationTest() {

    }


    @Test
    public void _080_verifyUsingStreamTest() throws ApiException {
        VerifyContentResponse response = verificationApi.verifyUsingStream(unitTestConfigName, registeredContentFileForStream,
            null, ANY_REQUEST_ID, hashingSecret, null, null);
        Assert.assertNotNull(response);
        Assert.assertTrue(response.getRegistrationState() == VerifyContentResponse.RegistrationStateEnum.REGISTERED
                              || response.getRegistrationState() == VerifyContentResponse.RegistrationStateEnum.PENDING);
        Assert.assertNotNull(response.getSingleProofChain());
        Assert.assertNotNull(response.getPerHashProofChain());
        Assert.assertEquals(ANY_REQUEST_ID, response.getRequestId());
    }
}
