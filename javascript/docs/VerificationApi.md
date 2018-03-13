# BlockchainProof.VerificationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyUsingContent**](VerificationApi.md#verifyUsingContent) | **POST** /existence/{configName}/content | Verify content
[**verifyUsingLocation**](VerificationApi.md#verifyUsingLocation) | **POST** /existence/{configName}/streams/location | Verify hash using the Storage API
[**verifyUsingStream**](VerificationApi.md#verifyUsingStream) | **POST** /existence/{configName}/streams/multipart | Verify bytestream/file hash


<a name="verifyUsingContent"></a>
# **verifyUsingContent**
> VerifyContentResponse verifyUsingContent(configName, existence, opts)

Verify content

Verify content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.VerificationApi();

var configName = "configName_example"; // String | The configName for this operation

var existence = new BlockchainProof.ContentRequest(); // ContentRequest | Verify content using the current settings

var opts = { 
  'requestId': "requestId_example", // String | Optional request id
  'base64Secret': "base64Secret_example", // String | An alternate secret key in base64 format that overrides the value in your configuration.
  'suppliedSignature': "suppliedSignature_example", // String | An alternate supplied Signature in base64 format that overrides the signature generation.
  'keyId': "keyId_example" // String | An alternate crypto keys API id that will be used for signature generation.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyUsingContent(configName, existence, opts, callback);
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
> VerifyContentResponse verifyUsingLocation(configName, streamLocation, opts)

Verify hash using the Storage API

Verify a hash of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.VerificationApi();

var configName = "configName_example"; // String | The context for this operation

var streamLocation = new BlockchainProof.StreamLocation(); // StreamLocation | The stream location on storage

var opts = { 
  'requestId': "requestId_example", // String | Optional request id
  'base64Secret': "base64Secret_example", // String | An alternate secret key in base64 format that overrides the value in your configuration.
  'suppliedSignature': "suppliedSignature_example", // String | An alternate supplied Signature in base64 format that overrides the signature generation.
  'keyId': "keyId_example" // String | An alternate crypto keys API id that will be used for signature generation.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyUsingLocation(configName, streamLocation, opts, callback);
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
> VerifyContentResponse verifyUsingStream(configName, stream, opts)

Verify bytestream/file hash

Verify a hash of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.VerificationApi();

var configName = "configName_example"; // String | The configuration name this operation

var stream = "/path/to/file.txt"; // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored

var opts = { 
  'fileName': "fileName_example", // String | Optional input file name. Needed when using bytestreams instead of filestreams
  'requestId': "requestId_example", // String | Optional request id
  'base64Secret': "base64Secret_example", // String | An alternate secret key in base64 format that overrides the value in your configuration.
  'suppliedSignature': "suppliedSignature_example", // String | An alternate supplied Signature in base64 format that overrides the signature generation.
  'keyId': "keyId_example" // String | An alternate crypto keys API id that will be used for signature generation.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyUsingStream(configName, stream, opts, callback);
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

