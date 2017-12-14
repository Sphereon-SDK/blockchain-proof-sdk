# RegistrationApi

All URIs are relative to *https://gw-dev.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerUsingContent**](RegistrationApi.md#registerUsingContent) | **PUT** /blockchain/proof/0.9/existence/{configName}/content | Register content
[**registerUsingLocation**](RegistrationApi.md#registerUsingLocation) | **PUT** /blockchain/proof/0.9/existence/{configName}/streams/location | Register content using a Stream Location from Storage API
[**registerUsingStream**](RegistrationApi.md#registerUsingStream) | **PUT** /blockchain/proof/0.9/existence/{configName}/streams/multipart | Register content using a bytestream/file


<a name="registerUsingContent"></a>
# **registerUsingContent**
> RegisterContentResponse registerUsingContent(configName, existence)

Register content

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
> RegisterContentResponse registerUsingLocation(configName, streamLocations)

Register content using a Stream Location from Storage API

Register content by supplying a file or some other binary data. Hashing will be done on the server side

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
List<StreamLocation> streamLocations = Arrays.asList(new StreamLocation()); // List<StreamLocation> | The stream locations on storage
try {
    RegisterContentResponse result = apiInstance.registerUsingLocation(configName, streamLocations);
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
 **streamLocations** | [**List&lt;StreamLocation&gt;**](StreamLocation.md)| The stream locations on storage |

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="registerUsingStream"></a>
# **registerUsingStream**
> RegisterContentResponse registerUsingStream(configName, stream)

Register content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

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
try {
    RegisterContentResponse result = apiInstance.registerUsingStream(configName, stream);
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

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

