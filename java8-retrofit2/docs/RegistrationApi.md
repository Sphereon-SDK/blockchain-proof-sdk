# RegistrationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.9*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerUsingContent**](RegistrationApi.md#registerUsingContent) | **PUT** existence/{configName}/content | Register content
[**registerUsingLocation**](RegistrationApi.md#registerUsingLocation) | **PUT** existence/{configName}/streams/location | Register hash using the Storage API
[**registerUsingStream**](RegistrationApi.md#registerUsingStream) | **PUT** existence/{configName}/streams/multipart | Register bytestream/file hash


<a name="registerUsingContent"></a>
# **registerUsingContent**
> RegisterContentResponse registerUsingContent(configName, existence)

Register content

Register content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String configName = "configName_example"; // String | The configuration name this operation
ContentRequest existence = new ContentRequest(); // ContentRequest | Register content using the current settings
try {
    RegisterContentResponse result = apiInstance.registerUsingContent(configName, existence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registerUsingContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |
 **existence** | [**ContentRequest**](ContentRequest.md)| Register content using the current settings |

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="registerUsingLocation"></a>
# **registerUsingLocation**
> RegisterContentResponse registerUsingLocation(configName, streamLocation, requestId)

Register hash using the Storage API

Register a convertInputToHashWhenNeeded of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the convertInputToHashWhenNeeded. Use the registerUsingContent endpoint if you&#39;d like to store content

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String configName = "configName_example"; // String | The configuration name this operation
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | The stream locations on storage
String requestId = "requestId_example"; // String | Optional request id
try {
    RegisterContentResponse result = apiInstance.registerUsingLocation(configName, streamLocation, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registerUsingLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| The stream locations on storage |
 **requestId** | **String**| Optional request id | [optional]

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="registerUsingStream"></a>
# **registerUsingStream**
> RegisterContentResponse registerUsingStream(configName, stream, fileName)

Register bytestream/file hash

Register a convertInputToHashWhenNeeded of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the convertInputToHashWhenNeeded. Use the registerUsingContent endpoint if you&#39;d like to store content

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String configName = "configName_example"; // String | The configuration name this operation
File stream = new File("/path/to/file.txt"); // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
String fileName = "fileName_example"; // String | Optional input file name. Needed when using bytestreams instead of filestreams
try {
    RegisterContentResponse result = apiInstance.registerUsingStream(configName, stream, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registerUsingStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |
 **stream** | **File**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored |
 **fileName** | **String**| Optional input file name. Needed when using bytestreams instead of filestreams | [optional]

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

