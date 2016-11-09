# SphereonBlockchainProofApi.ProofOfExistenceApi

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
```javascript
var SphereonBlockchainProofApi = require('sphereon__blockchain__proof_api');
var defaultClient = SphereonBlockchainProofApi.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SphereonBlockchainProofApi.ProofOfExistenceApi();

var request = new SphereonBlockchainProofApi.CreateChainRequest(); // CreateChainRequest | Create a new Proof of Existence chain using the provided existence settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createChain(request, callback);
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
```javascript
var SphereonBlockchainProofApi = require('sphereon__blockchain__proof_api');
var defaultClient = SphereonBlockchainProofApi.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SphereonBlockchainProofApi.ProofOfExistenceApi();

var chainId = "chainId_example"; // String | The chain where the content will be registered

var existence = new SphereonBlockchainProofApi.ContentRequest(); // ContentRequest | Register content using the current existence settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerContent(chainId, existence, callback);
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
> RegisterContentResponse registerStream(chainId, stream, opts)

Register content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```javascript
var SphereonBlockchainProofApi = require('sphereon__blockchain__proof_api');
var defaultClient = SphereonBlockchainProofApi.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SphereonBlockchainProofApi.ProofOfExistenceApi();

var chainId = "chainId_example"; // String | The chain where the content will be registered

var stream = "/path/to/file.txt"; // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored

var opts = { 
  'settings': "/path/to/file.txt" // File | settings
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerStream(chainId, stream, opts, callback);
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
```javascript
var SphereonBlockchainProofApi = require('sphereon__blockchain__proof_api');
var defaultClient = SphereonBlockchainProofApi.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SphereonBlockchainProofApi.ProofOfExistenceApi();

var chainId = "chainId_example"; // String | The chain where the content was registered

var existence = new SphereonBlockchainProofApi.ContentRequest(); // ContentRequest | Verify content using the current existence settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyContent(chainId, existence, callback);
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
> VerifyContentResponse verifyContentByHash(chainId, hash, opts)

Verify content by hash

### Example
```javascript
var SphereonBlockchainProofApi = require('sphereon__blockchain__proof_api');
var defaultClient = SphereonBlockchainProofApi.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SphereonBlockchainProofApi.ProofOfExistenceApi();

var chainId = "chainId_example"; // String | The chain where the content was registered

var hash = "hash_example"; // String | The client generated hash

var opts = { 
  'existence': new SphereonBlockchainProofApi.ContentRequest() // ContentRequest | Verify content using the current existence settings
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyContentByHash(chainId, hash, opts, callback);
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
> VerifyContentResponse verifyStream(chainId, stream, opts)

Verify content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```javascript
var SphereonBlockchainProofApi = require('sphereon__blockchain__proof_api');
var defaultClient = SphereonBlockchainProofApi.ApiClient.default;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SphereonBlockchainProofApi.ProofOfExistenceApi();

var chainId = "chainId_example"; // String | The chain where the content will be registered

var stream = "/path/to/file.txt"; // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored

var opts = { 
  'settings': "/path/to/file.txt" // File | settings
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyStream(chainId, stream, opts, callback);
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

