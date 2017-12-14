package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.proof.model.ContentRequest;
import com.sphereon.sdk.blockchain.proof.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.blockchain.proof.model.StreamLocation;
import com.sphereon.sdk.blockchain.proof.model.VerifyContentResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface VerificationApi {
  /**
   * Verify content
   * 
   * @param configName The configName for this operation (required)
   * @param existence Verify content using the current settings (required)
   * @return Call&lt;VerifyContentResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @POST("blockchain/proof/0.9/existence/{configName}/content")
  Call<VerifyContentResponse> verifyUsingContent(
    @retrofit2.http.Path("configName") String configName, @retrofit2.http.Body ContentRequest existence
  );

  /**
   * Verify content using Stream Locations from the Storage API
   * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param configName The context for this operation (required)
   * @param streamLocations The stream locations on storage (required)
   * @return Call&lt;VerifyContentResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @POST("blockchain/proof/0.9/existence/{configName}/streams/location")
  Call<VerifyContentResponse> verifyUsingLocation(
    @retrofit2.http.Path("configName") String configName, @retrofit2.http.Body List<StreamLocation> streamLocations
  );

  /**
   * Verify content using a bytestream/file
   * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param configName The configuration name this operation (required)
   * @param stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored (required)
   * @return Call&lt;VerifyContentResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("blockchain/proof/0.9/existence/{configName}/streams/multipart")
  Call<VerifyContentResponse> verifyUsingStream(
    @retrofit2.http.Path("configName") String configName, @retrofit2.http.Part("stream\"; filename=\"stream") RequestBody stream
  );

}
