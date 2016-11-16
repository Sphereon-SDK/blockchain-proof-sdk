package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.CollectionFormats.*;
import com.sphereon.sdk.blockchain.proof.model.CreateChainRequest;
import com.sphereon.sdk.blockchain.proof.model.CreateChainResponse;
import retrofit2.Call;
import retrofit2.http.*;

public interface ChainApi {
  /**
   * Create a new entity chain
   * 
   * @param request Create a new Proof of Existence chain using the provided entity settings (required)
   * @return Call&lt;CreateChainResponse&gt;
   */
  
  @Headers({
  	"Content-Type:application/json;charset&#x3D;UTF-8" 
  })
  @POST("blockchain/proof/0.1.0/existence")
  Call<CreateChainResponse> createChain(
    @retrofit2.http.Body CreateChainRequest request
  );

}
