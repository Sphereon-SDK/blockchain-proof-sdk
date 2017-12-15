package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import com.sphereon.sdk.blockchain.proof.model.ContentRequest;
import com.sphereon.sdk.blockchain.proof.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.blockchain.proof.model.RegisterContentResponse;
import com.sphereon.sdk.blockchain.proof.model.StreamLocation;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegistrationApi
 */
public class RegistrationApiTest {

    private RegistrationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RegistrationApi.class);
    }

    
    /**
     * Register content
     *
     * 
     */
    @Test
    public void registerContentTest() {
        String configName = null;
        ContentRequest existence = null;
        // RegisterContentResponse response = api.registerContent(configName, existence);

        // TODO: test validations
    }
    
    /**
     * Register content using a bytestream/file
     *
     * Register content by supplying a file or some other binary data. Hashing will be done on the server side
     */
    @Test
    public void registerStreamTest() {
        String configName = null;
        File stream = null;
        // RegisterContentResponse response = api.registerStream(configName, stream);

        // TODO: test validations
    }
    
    /**
     * Register content using a bytestream/file
     *
     * Register content by supplying a file or some other binary data. Hashing will be done on the server side
     */
    @Test
    public void registerStreamOnStorageTest() {
        String configName = null;
        List<StreamLocation> streamLocations = null;
        // RegisterContentResponse response = api.registerStreamOnStorage(configName, streamLocations);

        // TODO: test validations
    }
    
}
