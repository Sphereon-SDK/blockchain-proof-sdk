# ProofOfExistenceApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChain**](ProofOfExistenceApi.md#createChain) | **POST** /blockchain/proof/0.1.0/existence | Create a new existence chain
[**registerContent**](ProofOfExistenceApi.md#registerContent) | **POST** /blockchain/proof/0.1.0/existence/{chainId} | Register content
[**registerStream**](ProofOfExistenceApi.md#registerStream) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/stream | Register content using a bytestream/file
[**verifyContent**](ProofOfExistenceApi.md#verifyContent) | **GET** /blockchain/proof/0.1.0/existence/{chainId} | Verify content
[**verifyContentByHash**](ProofOfExistenceApi.md#verifyContentByHash) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/{hash} | Verify content by hash
[**verifyStream**](ProofOfExistenceApi.md#verifyStream) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/stream | Verify content using a bytestream/file


<a name="createChain"></a>
# **createChain**
> CreateChainResponse createChain(request)

Create a new existence chain

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
CreateChainRequest request = new CreateChainRequest(); // CreateChainRequest | Create a new Proof of Existence chain using the provided existence settings
try {
    CreateChainResponse result = apiInstance.createChain(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofOfExistenceApi#createChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateChainRequest**](CreateChainRequest.md)| Create a new Proof of Existence chain using the provided existence settings |

### Return type

[**CreateChainResponse**](CreateChainResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="registerContent"></a>
# **registerContent**
> RegisterContentResponse registerContent(chainId, existence)

Register content

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
String chainId = "chainId_example"; // String | The chain where the content will be registered
ContentRequest existence = new ContentRequest(); // ContentRequest | Register content using the current existence settings
try {
    RegisterContentResponse result = apiInstance.registerContent(chainId, existence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofOfExistenceApi#registerContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| The chain where the content will be registered |
 **existence** | [**ContentRequest**](ContentRequest.md)| Register content using the current existence settings |

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="registerStream"></a>
# **registerStream**
> RegisterContentResponse registerStream(chainId, stream, settings)

Register content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

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
String chainId = "chainId_example"; // String | The chain where the content will be registered
File stream = new File("/path/to/file.txt"); // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
File settings = new File("/path/to/file.txt"); // File | settings
try {
    RegisterContentResponse result = apiInstance.registerStream(chainId, stream, settings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofOfExistenceApi#registerStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| The chain where the content will be registered |
 **stream** | **File**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored |
 **settings** | **File**| settings | [optional]

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

<a name="verifyContent"></a>
# **verifyContent**
> VerifyContentResponse verifyContent(chainId, existence)

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
String chainId = "chainId_example"; // String | The chain where the content was registered
ContentRequest existence = new ContentRequest(); // ContentRequest | Verify content using the current existence settings
try {
    VerifyContentResponse result = apiInstance.verifyContent(chainId, existence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofOfExistenceApi#verifyContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| The chain where the content was registered |
 **existence** | [**ContentRequest**](ContentRequest.md)| Verify content using the current existence settings |

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="verifyContentByHash"></a>
# **verifyContentByHash**
> VerifyContentResponse verifyContentByHash(chainId, hash, existence)

Verify content by hash

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
String chainId = "chainId_example"; // String | The chain where the content was registered
String hash = "hash_example"; // String | The client generated hash
ContentRequest existence = new ContentRequest(); // ContentRequest | Verify content using the current existence settings
try {
    VerifyContentResponse result = apiInstance.verifyContentByHash(chainId, hash, existence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofOfExistenceApi#verifyContentByHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| The chain where the content was registered |
 **hash** | **String**| The client generated hash |
 **existence** | [**ContentRequest**](ContentRequest.md)| Verify content using the current existence settings | [optional]

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="verifyStream"></a>
# **verifyStream**
> VerifyContentResponse verifyStream(chainId, stream, settings)

Verify content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

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
String chainId = "chainId_example"; // String | The chain where the content will be registered
File stream = new File("/path/to/file.txt"); // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
File settings = new File("/path/to/file.txt"); // File | settings
try {
    VerifyContentResponse result = apiInstance.verifyStream(chainId, stream, settings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofOfExistenceApi#verifyStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| The chain where the content will be registered |
 **stream** | **File**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored |
 **settings** | **File**| settings | [optional]

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

