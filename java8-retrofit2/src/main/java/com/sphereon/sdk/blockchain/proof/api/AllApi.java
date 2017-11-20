package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.proof.model.ContentRequest;
import com.sphereon.sdk.blockchain.proof.model.CreateChainRequest;
import com.sphereon.sdk.blockchain.proof.model.CreateChainResponse;
import java.io.File;
import com.sphereon.sdk.blockchain.proof.model.RegisterContentResponse;
import com.sphereon.sdk.blockchain.proof.model.SettingsResponse;
import com.sphereon.sdk.blockchain.proof.model.VerifyContentResponse;
import com.sphereon.sdk.blockchain.proof.model.VndErrors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AllApi {
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

  /**
   * Register content
   * 
   * @param chainId The chain where the content will be registered (required)
   * @param existence Register content using the current entity settings (required)
   * @return Call&lt;RegisterContentResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @POST("blockchain/proof/0.1.0/existence/{chainId}/register/content")
  Call<RegisterContentResponse> registerContent(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body ContentRequest existence
  );

  /**
   * Register content using a bytestream/file
   * Register content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param chainId The chain where the content will be registered (required)
   * @param stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored (required)
   * @return Call&lt;RegisterContentResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("blockchain/proof/0.1.0/existence/{chainId}/register/stream")
  Call<RegisterContentResponse> registerStream(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Part("stream\"; filename=\"stream") RequestBody stream
  );

  /**
   * Get the settings for registration/verification
   * 
   * @param chainId This is the chain where the content is registered/verified (required)
   * @return Call&lt;SettingsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("blockchain/proof/0.1.0/existence/{chainId}/settings")
  Call<SettingsResponse> settings(
    @retrofit2.http.Path("chainId") String chainId
  );

  /**
   * Verify content
   * 
   * @param chainId The chain where the content was registered (required)
   * @param existence Verify content using the current entity settings (required)
   * @return Call&lt;VerifyContentResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @POST("blockchain/proof/0.1.0/existence/{chainId}/verify/content")
  Call<VerifyContentResponse> verifyContent(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Body ContentRequest existence
  );

  /**
   * Verify content using a bytestream/file
   * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param chainId The chain where the content will be verified (required)
   * @param stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored (required)
   * @return Call&lt;VerifyContentResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("blockchain/proof/0.1.0/existence/{chainId}/verify/stream")
  Call<VerifyContentResponse> verifyStream(
    @retrofit2.http.Path("chainId") String chainId, @retrofit2.http.Part("stream\"; filename=\"stream") RequestBody stream
  );

}
