package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.proof.model.ConfigurationResponse;
import com.sphereon.sdk.blockchain.proof.model.CreateConfiguration;
import com.sphereon.sdk.blockchain.proof.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ConfigurationApi {
  /**
   * Create a new configuration
   * 
   * @param request Create a new Proof of Existence context using the provided entity settings (required)
   * @return Call&lt;ConfigurationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json;charset&#x3D;UTF-8"
  })
  @POST("blockchain/proof/0.9/existence/config")
  Call<ConfigurationResponse> createConfiguration(
    @retrofit2.http.Body CreateConfiguration request
  );

  /**
   * Get the settings for registration/verification
   * 
   * @param configName The configuration name this operation (required)
   * @return Call&lt;ConfigurationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("blockchain/proof/0.9/existence/config/{configName}")
  Call<ConfigurationResponse> getConfiguration(
    @retrofit2.http.Path("configName") String configName
  );

}
