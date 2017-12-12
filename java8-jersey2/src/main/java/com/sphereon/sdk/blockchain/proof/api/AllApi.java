package com.sphereon.sdk.blockchain.proof.api;

import com.sphereon.sdk.blockchain.proof.handler.ApiException;
import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
import com.sphereon.sdk.blockchain.proof.handler.Configuration;
import com.sphereon.sdk.blockchain.proof.handler.Pair;

import javax.ws.rs.core.GenericType;

import com.sphereon.sdk.blockchain.proof.model.ConfigurationResponse;
import com.sphereon.sdk.blockchain.proof.model.ContentRequest;
import com.sphereon.sdk.blockchain.proof.model.CreateConfiguration;
import com.sphereon.sdk.blockchain.proof.model.ErrorResponse;
import java.io.File;
import com.sphereon.sdk.blockchain.proof.model.RegisterContentResponse;
import com.sphereon.sdk.blockchain.proof.model.StreamLocation;
import com.sphereon.sdk.blockchain.proof.model.VerifyContentResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-11T17:14:39.149+01:00")
public class AllApi {
  private ApiClient apiClient;

  public AllApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AllApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new configuration
   * 
   * @param request Create a new Proof of Existence context using the provided entity settings (required)
   * @return ConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public ConfigurationResponse createConfiguration(CreateConfiguration request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling createConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/proof/0.9.0-SNAPSHOT/existence/config";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<ConfigurationResponse> localVarReturnType = new GenericType<ConfigurationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the settings for registration/verification
   * 
   * @param configName The configuration name this operation (required)
   * @return ConfigurationResponse
   * @throws ApiException if fails to make API call
   */
  public ConfigurationResponse getCurrentConfiguration(String configName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configName' is set
    if (configName == null) {
      throw new ApiException(400, "Missing the required parameter 'configName' when calling getCurrentConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/proof/0.9.0-SNAPSHOT/existence/config/{configName}"
      .replaceAll("\\{" + "configName" + "\\}", apiClient.escapeString(configName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<ConfigurationResponse> localVarReturnType = new GenericType<ConfigurationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Register content
   * 
   * @param configName The configuration name this operation (required)
   * @param existence Register content using the current settings (required)
   * @return RegisterContentResponse
   * @throws ApiException if fails to make API call
   */
  public RegisterContentResponse registerContent(String configName, ContentRequest existence) throws ApiException {
    Object localVarPostBody = existence;
    
    // verify the required parameter 'configName' is set
    if (configName == null) {
      throw new ApiException(400, "Missing the required parameter 'configName' when calling registerContent");
    }
    
    // verify the required parameter 'existence' is set
    if (existence == null) {
      throw new ApiException(400, "Missing the required parameter 'existence' when calling registerContent");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/content"
      .replaceAll("\\{" + "configName" + "\\}", apiClient.escapeString(configName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<RegisterContentResponse> localVarReturnType = new GenericType<RegisterContentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Register content using a bytestream/file
   * Register content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param configName The configuration name this operation (required)
   * @param stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored (required)
   * @return RegisterContentResponse
   * @throws ApiException if fails to make API call
   */
  public RegisterContentResponse registerStream(String configName, File stream) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configName' is set
    if (configName == null) {
      throw new ApiException(400, "Missing the required parameter 'configName' when calling registerStream");
    }
    
    // verify the required parameter 'stream' is set
    if (stream == null) {
      throw new ApiException(400, "Missing the required parameter 'stream' when calling registerStream");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/multipart"
      .replaceAll("\\{" + "configName" + "\\}", apiClient.escapeString(configName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (stream != null)
      localVarFormParams.put("stream", stream);

    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<RegisterContentResponse> localVarReturnType = new GenericType<RegisterContentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Register content using a bytestream/file
   * Register content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param configName The configuration name this operation (required)
   * @param streamLocations The stream locations on storage (required)
   * @return RegisterContentResponse
   * @throws ApiException if fails to make API call
   */
  public RegisterContentResponse registerStreamOnStorage(String configName, List<StreamLocation> streamLocations) throws ApiException {
    Object localVarPostBody = streamLocations;
    
    // verify the required parameter 'configName' is set
    if (configName == null) {
      throw new ApiException(400, "Missing the required parameter 'configName' when calling registerStreamOnStorage");
    }
    
    // verify the required parameter 'streamLocations' is set
    if (streamLocations == null) {
      throw new ApiException(400, "Missing the required parameter 'streamLocations' when calling registerStreamOnStorage");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/location"
      .replaceAll("\\{" + "configName" + "\\}", apiClient.escapeString(configName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<RegisterContentResponse> localVarReturnType = new GenericType<RegisterContentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verify content
   * 
   * @param configName The configName for this operation (required)
   * @param existence Verify content using the current settings (required)
   * @return VerifyContentResponse
   * @throws ApiException if fails to make API call
   */
  public VerifyContentResponse verifyContent(String configName, ContentRequest existence) throws ApiException {
    Object localVarPostBody = existence;
    
    // verify the required parameter 'configName' is set
    if (configName == null) {
      throw new ApiException(400, "Missing the required parameter 'configName' when calling verifyContent");
    }
    
    // verify the required parameter 'existence' is set
    if (existence == null) {
      throw new ApiException(400, "Missing the required parameter 'existence' when calling verifyContent");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/content"
      .replaceAll("\\{" + "configName" + "\\}", apiClient.escapeString(configName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<VerifyContentResponse> localVarReturnType = new GenericType<VerifyContentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verify content using a bytestream/file
   * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param configName The configuration name this operation (required)
   * @param stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored (required)
   * @return VerifyContentResponse
   * @throws ApiException if fails to make API call
   */
  public VerifyContentResponse verifyStream(String configName, File stream) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configName' is set
    if (configName == null) {
      throw new ApiException(400, "Missing the required parameter 'configName' when calling verifyStream");
    }
    
    // verify the required parameter 'stream' is set
    if (stream == null) {
      throw new ApiException(400, "Missing the required parameter 'stream' when calling verifyStream");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/multipart"
      .replaceAll("\\{" + "configName" + "\\}", apiClient.escapeString(configName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (stream != null)
      localVarFormParams.put("stream", stream);

    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<VerifyContentResponse> localVarReturnType = new GenericType<VerifyContentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verify content using a bytestream/file
   * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
   * @param configName The context for this operation (required)
   * @param streamLocations The stream locations on storage (required)
   * @return VerifyContentResponse
   * @throws ApiException if fails to make API call
   */
  public VerifyContentResponse verifyStreamsOnStorage(String configName, List<StreamLocation> streamLocations) throws ApiException {
    Object localVarPostBody = streamLocations;
    
    // verify the required parameter 'configName' is set
    if (configName == null) {
      throw new ApiException(400, "Missing the required parameter 'configName' when calling verifyStreamsOnStorage");
    }
    
    // verify the required parameter 'streamLocations' is set
    if (streamLocations == null) {
      throw new ApiException(400, "Missing the required parameter 'streamLocations' when calling verifyStreamsOnStorage");
    }
    
    // create path and map variables
    String localVarPath = "/blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/location"
      .replaceAll("\\{" + "configName" + "\\}", apiClient.escapeString(configName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2schema" };

    GenericType<VerifyContentResponse> localVarReturnType = new GenericType<VerifyContentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
