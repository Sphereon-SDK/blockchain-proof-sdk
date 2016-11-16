package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for SettingsApi
 */
public class SettingsApiTest {

    private SettingsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SettingsApi.class);
    }

    
    /**
     * Get the settings for registration/verification
     *
     * 
     */
    @Test
    public void settingsTest() {
        String chainId = null;
        // SettingsResponse response = api.settings(chainId);

        // TODO: test validations
    }
    
}
