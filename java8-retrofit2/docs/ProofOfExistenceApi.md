# ProofOfExistenceApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyContent**](ProofOfExistenceApi.md#verifyContent) | **POST** blockchain/proof/0.9/existence/{configName}/content | Verify content
[**verifyStream**](ProofOfExistenceApi.md#verifyStream) | **POST** blockchain/proof/0.9/existence/{configName}/streams/multipart | Verify content using a bytestream/file
[**verifyStreamsOnStorage**](ProofOfExistenceApi.md#verifyStreamsOnStorage) | **POST** blockchain/proof/0.9/existence/{configName}/streams/location | Verify content using a bytestream/file


<a name="verifyContent"></a>
# **verifyContent**
> VerifyContentResponse verifyContent(configName, existence)

Verify content

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.ProofOfExistenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProofOfExistenceApi apiInstance = new ProofOfExistenceApi();
String configName = "configName_example"; // String | The configName for this operation
ContentRequest existence = new ContentRequest(); // ContentRequest | Verify content using the current settings
try {
    VerifyContentResponse result = apiInstance.verifyContent(configName, existence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofOfExistenceApi#verifyContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configName for this operation |
 **existence** | [**ContentRequest**](ContentRequest.md)| Verify content using the current settings |

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="verifyStream"></a>
# **verifyStream**
> VerifyContentResponse verifyStream(configName, stream)

Verify content using a bytestream/file

Verify content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.ProofOfExistenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProofOfExistenceApi apiInstance = new ProofOfExistenceApi();
String configName = "configName_example"; // String | The configuration name this operation
File stream = new File("/path/to/file.txt"); // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
try {
    VerifyContentResponse result = apiInstance.verifyStream(configName, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofOfExistenceApi#verifyStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |
 **stream** | **File**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored |

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

<a name="verifyStreamsOnStorage"></a>
# **verifyStreamsOnStorage**
> VerifyContentResponse verifyStreamsOnStorage(configName, streamLocations)

Verify content using a bytestream/file

Verify content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.ProofOfExistenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ProofOfExistenceApi apiInstance = new ProofOfExistenceApi();
String configName = "configName_example"; // String | The context for this operation
List<StreamLocation> streamLocations = Arrays.asList(new StreamLocation()); // List<StreamLocation> | The stream locations on storage
try {
    VerifyContentResponse result = apiInstance.verifyStreamsOnStorage(configName, streamLocations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofOfExistenceApi#verifyStreamsOnStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The context for this operation |
 **streamLocations** | [**List&lt;StreamLocation&gt;**](StreamLocation.md)| The stream locations on storage |

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

