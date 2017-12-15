/*
 * Blockchain Proof
 * <b>With the Blockchain Proof API it is easy to prove existence of (binary) data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin) blockchain by means of our generic blockchain API.</b>    The flow is generally as follows:  1. Make sure a Proof chain has been created using the /chain POST endpoint beforehand. Normally you only need one or a handful of chains, during the entiry lifetime of your proof solution. This is a relative expensive operation in terms of money.  2. Store proof entries on the proof chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9.0-SNAPSHOT
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiException;
import com.sphereon.sdk.blockchain.proof.model.ConfigurationResponse;
import com.sphereon.sdk.blockchain.proof.model.ContentRequest;
import com.sphereon.sdk.blockchain.proof.model.CreateConfiguration;
import com.sphereon.sdk.blockchain.proof.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.blockchain.proof.model.RegisterContentResponse;
import com.sphereon.sdk.blockchain.proof.model.StreamLocation;
import com.sphereon.sdk.blockchain.proof.model.VerifyContentResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllApi
 */
@Ignore
public class AllApiTest {

    private final AllApi api = new AllApi();

    
    /**
     * Create a new configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfigurationTest() throws ApiException {
        CreateConfiguration request = null;
       // ConfigurationResponse response = api.createConfiguration(request);

        // TODO: test validations
    }
    
    /**
     * Get the settings for registration/verification
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentConfigurationTest() throws ApiException {
        String configName = null;
     //   ConfigurationResponse response = api.getCurrentConfiguration(configName);

        // TODO: test validations
    }
    
    /**
     * Register content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerContentTest() throws ApiException {
        String configName = null;
        ContentRequest existence = null;
     //   RegisterContentResponse response = api.registerContent(configName, existence);

        // TODO: test validations
    }
    
    /**
     * Register content using a bytestream/file
     *
     * Register content by supplying a file or some other binary data. Hashing will be done on the server side
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerStreamTest() throws ApiException {
        String configName = null;
        File stream = null;
      //  RegisterContentResponse response = api.registerStream(configName, stream);

        // TODO: test validations
    }
    
    /**
     * Register content using a bytestream/file
     *
     * Register content by supplying a file or some other binary data. Hashing will be done on the server side
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerStreamOnStorageTest() throws ApiException {
        String configName = null;
        List<StreamLocation> streamLocations = null;
      //  RegisterContentResponse response = api.registerStreamOnStorage(configName, streamLocations);

        // TODO: test validations
    }
    
    /**
     * Verify content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyContentTest() throws ApiException {
        String configName = null;
        ContentRequest existence = null;
     //   VerifyContentResponse response = api.verifyContent(configName, existence);

        // TODO: test validations
    }
    
    /**
     * Verify content using a bytestream/file
     *
     * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyStreamTest() throws ApiException {
        String configName = null;
        File stream = null;
     //   VerifyContentResponse response = api.verifyStream(configName, stream);

        // TODO: test validations
    }
    
    /**
     * Verify content using a bytestream/file
     *
     * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyStreamsOnStorageTest() throws ApiException {
        String configName = null;
        List<StreamLocation> streamLocations = null;
    //    VerifyContentResponse response = api.verifyStreamsOnStorage(configName, streamLocations);

        // TODO: test validations
    }
    
}
