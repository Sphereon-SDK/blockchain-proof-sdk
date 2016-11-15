package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import com.sphereon.sdk.blockchain.proof.model.SettingsResponse;
import com.sphereon.sdk.blockchain.proof.model.VndErrors;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
