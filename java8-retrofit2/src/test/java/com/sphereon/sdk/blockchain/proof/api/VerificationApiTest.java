package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import com.sphereon.sdk.blockchain.proof.model.ContentRequest;
import com.sphereon.sdk.blockchain.proof.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.blockchain.proof.model.StreamLocation;
import com.sphereon.sdk.blockchain.proof.model.VerifyContentResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerificationApi
 */
public class VerificationApiTest {

    private VerificationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(VerificationApi.class);
    }

    
    /**
     * Verify content
     *
     * 
     */
    @Test
    public void verifyUsingContentTest() {
        String configName = null;
        ContentRequest existence = null;
        // VerifyContentResponse response = api.verifyUsingContent(configName, existence);

        // TODO: test validations
    }
    
    /**
     * Verify content using Stream Locations from the Storage API
     *
     * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
     */
    @Test
    public void verifyUsingLocationTest() {
        String configName = null;
        List<StreamLocation> streamLocations = null;
        // VerifyContentResponse response = api.verifyUsingLocation(configName, streamLocations);

        // TODO: test validations
    }
    
    /**
     * Verify content using a bytestream/file
     *
     * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
     */
    @Test
    public void verifyUsingStreamTest() {
        String configName = null;
        File stream = null;
        // VerifyContentResponse response = api.verifyUsingStream(configName, stream);

        // TODO: test validations
    }
    
}
