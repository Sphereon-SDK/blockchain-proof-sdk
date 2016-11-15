package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import com.sphereon.sdk.blockchain.proof.model.ContentRequest;
import com.sphereon.sdk.blockchain.proof.model.RegisterContentResponse;
import com.sphereon.sdk.blockchain.proof.model.VndErrors;
import java.io.File;
import com.sphereon.sdk.blockchain.proof.model.VerifyContentResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProofOfExistenceApi
 */
public class ProofOfExistenceApiTest {

    private ProofOfExistenceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ProofOfExistenceApi.class);
    }

    
    /**
     * Register content
     *
     * 
     */
    @Test
    public void registerContentTest() {
        String chainId = null;
        ContentRequest existence = null;
        // RegisterContentResponse response = api.registerContent(chainId, existence);

        // TODO: test validations
    }
    
    /**
     * Register content using a bytestream/file
     *
     * Register content by supplying a file or some other binary data. Hashing will be done on the server side
     */
    @Test
    public void registerStreamTest() {
        String chainId = null;
        File stream = null;
        // RegisterContentResponse response = api.registerStream(chainId, stream);

        // TODO: test validations
    }
    
    /**
     * Verify content
     *
     * 
     */
    @Test
    public void verifyContentTest() {
        String chainId = null;
        ContentRequest existence = null;
        // VerifyContentResponse response = api.verifyContent(chainId, existence);

        // TODO: test validations
    }
    
    /**
     * Verify content using a bytestream/file
     *
     * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
     */
    @Test
    public void verifyStreamTest() {
        String chainId = null;
        File stream = null;
        // VerifyContentResponse response = api.verifyStream(chainId, stream);

        // TODO: test validations
    }
    
}
