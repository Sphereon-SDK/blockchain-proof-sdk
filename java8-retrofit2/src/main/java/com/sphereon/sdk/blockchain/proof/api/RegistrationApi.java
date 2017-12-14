package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.proof.model.ContentRequest;
import com.sphereon.sdk.blockchain.proof.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.blockchain.proof.model.RegisterContentResponse;
import com.sphereon.sdk.blockchain.proof.model.StreamLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface RegistrationApi {
  /**
   * Register content
   * 
   * @param configName The configuration name this operation (required)
   * @param existence Register content using the current settings (required)
   * @return Call&lt;RegisterContentResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @PUT("blockchain/proof/0.9/existence/{configName}/content")
  Call<RegisterContentResponse> registerUsingContent(
    @retrofit2.http.Path("configName") String configName, @retrofit2.http.Body ContentRequest existence
  );

  /**
   * Register content using a Stream Location from Storage API
   * Register content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param configName The configuration name this operation (required)
   * @param streamLocations The stream locations on storage (required)
   * @return Call&lt;RegisterContentResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @PUT("blockchain/proof/0.9/existence/{configName}/streams/location")
  Call<RegisterContentResponse> registerUsingLocation(
    @retrofit2.http.Path("configName") String configName, @retrofit2.http.Body List<StreamLocation> streamLocations
  );

  /**
   * Register content using a bytestream/file
   * Register content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param configName The configuration name this operation (required)
   * @param stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored (required)
   * @return Call&lt;RegisterContentResponse&gt;
   */
  @retrofit2.http.Multipart
  @PUT("blockchain/proof/0.9/existence/{configName}/streams/multipart")
  Call<RegisterContentResponse> registerUsingStream(
    @retrofit2.http.Path("configName") String configName, @retrofit2.http.Part("stream\"; filename=\"stream") RequestBody stream
  );

}
