package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sphereon.sdk.blockchain.proof.model.SettingsResponse;
import com.sphereon.sdk.blockchain.proof.model.VndErrors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SettingsApi {
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

}
