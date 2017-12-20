/*
 * Blockchain Proof
 * <b>With the Blockchain Proof API it is easy to prove existence of (binary) data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin) blockchain by means of our generic blockchain API.</b>    The flow is generally as follows:  1. Make sure a Proof chain has been created using the /chain POST endpoint beforehand. Normally you only need one or a handful of chains, during the entiry lifetime of your proof solution. This is a relative expensive operation in terms of money.  2. Store proof entries on the proof chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9.0
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiException;
import com.sphereon.sdk.blockchain.proof.model.ConfigurationResponse;
import com.sphereon.sdk.blockchain.proof.model.CreateConfiguration;
import com.sphereon.sdk.blockchain.proof.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationApi
 */
@Ignore
public class ConfigurationApiTest {

    private final ConfigurationApi api = new ConfigurationApi();

    
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
        ConfigurationResponse response = api.createConfiguration(request);

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
        ConfigurationResponse response = api.getCurrentConfiguration(configName);

        // TODO: test validations
    }
    
}
