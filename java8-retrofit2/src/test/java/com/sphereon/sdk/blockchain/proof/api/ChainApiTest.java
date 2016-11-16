package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import com.sphereon.sdk.blockchain.proof.model.CreateChainRequest;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for ChainApi
 */
public class ChainApiTest {

    private ChainApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ChainApi.class);
    }

    
    /**
     * Create a new entity chain
     *
     * 
     */
    @Test
    public void createChainTest() {
        CreateChainRequest request = null;
        // CreateChainResponse response = api.createChain(request);

        // TODO: test validations
    }
    
}
