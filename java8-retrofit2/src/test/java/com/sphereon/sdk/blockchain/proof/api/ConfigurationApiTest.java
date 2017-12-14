package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import com.sphereon.sdk.blockchain.proof.model.ConfigurationResponse;
import com.sphereon.sdk.blockchain.proof.model.CreateConfiguration;
import com.sphereon.sdk.blockchain.proof.model.ErrorResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationApi
 */
public class ConfigurationApiTest {

    private ConfigurationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConfigurationApi.class);
    }

    
    /**
     * Create a new configuration
     *
     * 
     */
    @Test
    public void createConfigurationTest() {
        CreateConfiguration request = null;
        // ConfigurationResponse response = api.createConfiguration(request);

        // TODO: test validations
    }
    
    /**
     * Get the settings for registration/verification
     *
     * 
     */
    @Test
    public void getCurrentConfigurationTest() {
        String configName = null;
        // ConfigurationResponse response = api.getCurrentConfiguration(configName);

        // TODO: test validations
    }
    
}
