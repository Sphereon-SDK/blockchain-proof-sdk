# VerificationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyUsingContent**](VerificationApi.md#verifyUsingContent) | **POST** /existence/{configName}/content | Verify content
[**verifyUsingLocation**](VerificationApi.md#verifyUsingLocation) | **POST** /existence/{configName}/streams/location | Verify hash using the Storage API
[**verifyUsingStream**](VerificationApi.md#verifyUsingStream) | **POST** /existence/{configName}/streams/multipart | Verify bytestream/file hash


<a name="verifyUsingContent"></a>
# **verifyUsingContent**
> VerifyContentResponse verifyUsingContent(configName, existence, requestId, base64Secret, suppliedSignature, keyId)

Verify content

Verify content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

VerificationApi apiInstance = new VerificationApi();
String configName = "configName_example"; // String | The configName for this operation
ContentRequest existence = new ContentRequest(); // ContentRequest | Verify content using the current settings
String requestId = "requestId_example"; // String | Optional request id
String base64Secret = "base64Secret_example"; // String | An alternate secret key in base64 format that overrides the value in your configuration.
String suppliedSignature = "suppliedSignature_example"; // String | An alternate supplied Signature in base64 format that overrides the signature generation.
String keyId = "keyId_example"; // String | An alternate crypto keys API id that will be used for signature generation.
try {
    VerifyContentResponse result = apiInstance.verifyUsingContent(configName, existence, requestId, base64Secret, suppliedSignature, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#verifyUsingContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configName for this operation |
 **existence** | [**ContentRequest**](ContentRequest.md)| Verify content using the current settings |
 **requestId** | **String**| Optional request id | [optional]
 **base64Secret** | **String**| An alternate secret key in base64 format that overrides the value in your configuration. | [optional]
 **suppliedSignature** | **String**| An alternate supplied Signature in base64 format that overrides the signature generation. | [optional]
 **keyId** | **String**| An alternate crypto keys API id that will be used for signature generation. | [optional]

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="verifyUsingLocation"></a>
# **verifyUsingLocation**
> VerifyContentResponse verifyUsingLocation(configName, streamLocation, requestId, base64Secret, suppliedSignature, keyId)

Verify hash using the Storage API

Verify a hash of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

VerificationApi apiInstance = new VerificationApi();
String configName = "configName_example"; // String | The context for this operation
StreamLocation streamLocation = new StreamLocation(); // StreamLocation | The stream location on storage
String requestId = "requestId_example"; // String | Optional request id
String base64Secret = "base64Secret_example"; // String | An alternate secret key in base64 format that overrides the value in your configuration.
String suppliedSignature = "suppliedSignature_example"; // String | An alternate supplied Signature in base64 format that overrides the signature generation.
String keyId = "keyId_example"; // String | An alternate crypto keys API id that will be used for signature generation.
try {
    VerifyContentResponse result = apiInstance.verifyUsingLocation(configName, streamLocation, requestId, base64Secret, suppliedSignature, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#verifyUsingLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The context for this operation |
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| The stream location on storage |
 **requestId** | **String**| Optional request id | [optional]
 **base64Secret** | **String**| An alternate secret key in base64 format that overrides the value in your configuration. | [optional]
 **suppliedSignature** | **String**| An alternate supplied Signature in base64 format that overrides the signature generation. | [optional]
 **keyId** | **String**| An alternate crypto keys API id that will be used for signature generation. | [optional]

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="verifyUsingStream"></a>
# **verifyUsingStream**
> VerifyContentResponse verifyUsingStream(configName, stream, fileName, requestId, base64Secret, suppliedSignature, keyId)

Verify bytestream/file hash

Verify a hash of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

VerificationApi apiInstance = new VerificationApi();
String configName = "configName_example"; // String | The configuration name this operation
File stream = new File("/path/to/file.txt"); // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
String fileName = "fileName_example"; // String | Optional input file name. Needed when using bytestreams instead of filestreams
String requestId = "requestId_example"; // String | Optional request id
String base64Secret = "base64Secret_example"; // String | An alternate secret key in base64 format that overrides the value in your configuration.
String suppliedSignature = "suppliedSignature_example"; // String | An alternate supplied Signature in base64 format that overrides the signature generation.
String keyId = "keyId_example"; // String | An alternate crypto keys API id that will be used for signature generation.
try {
    VerifyContentResponse result = apiInstance.verifyUsingStream(configName, stream, fileName, requestId, base64Secret, suppliedSignature, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#verifyUsingStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |
 **stream** | **File**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored |
 **fileName** | **String**| Optional input file name. Needed when using bytestreams instead of filestreams | [optional]
 **requestId** | **String**| Optional request id | [optional]
 **base64Secret** | **String**| An alternate secret key in base64 format that overrides the value in your configuration. | [optional]
 **suppliedSignature** | **String**| An alternate supplied Signature in base64 format that overrides the signature generation. | [optional]
 **keyId** | **String**| An alternate crypto keys API id that will be used for signature generation. | [optional]

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

