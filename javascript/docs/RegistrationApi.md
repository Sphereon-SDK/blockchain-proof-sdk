# BlockchainProof.RegistrationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.9*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerUsingContent**](RegistrationApi.md#registerUsingContent) | **PUT** /existence/{configName}/content | Register content
[**registerUsingLocation**](RegistrationApi.md#registerUsingLocation) | **PUT** /existence/{configName}/streams/location | Register hash using the Storage API
[**registerUsingStream**](RegistrationApi.md#registerUsingStream) | **PUT** /existence/{configName}/streams/multipart | Register bytestream/file hash


<a name="registerUsingContent"></a>
# **registerUsingContent**
> RegisterContentResponse registerUsingContent(configName, existence)

Register content

Register content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.RegistrationApi();

var configName = "configName_example"; // String | The configuration name this operation

var existence = new BlockchainProof.ContentRequest(); // ContentRequest | Register content using the current settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerUsingContent(configName, existence, callback);
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
> RegisterContentResponse registerUsingLocation(configName, streamLocation, opts)

Register hash using the Storage API

Register a convertInputToHashWhenNeeded of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the convertInputToHashWhenNeeded. Use the registerUsingContent endpoint if you&#39;d like to store content

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.RegistrationApi();

var configName = "configName_example"; // String | The configuration name this operation

var streamLocation = new BlockchainProof.StreamLocation(); // StreamLocation | The stream locations on storage

var opts = { 
  'requestId': "requestId_example" // String | Optional request id
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerUsingLocation(configName, streamLocation, opts, callback);
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
> RegisterContentResponse registerUsingStream(configName, stream, opts)

Register bytestream/file hash

Register a convertInputToHashWhenNeeded of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the convertInputToHashWhenNeeded. Use the registerUsingContent endpoint if you&#39;d like to store content

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.RegistrationApi();

var configName = "configName_example"; // String | The configuration name this operation

var stream = "/path/to/file.txt"; // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored

var opts = { 
  'fileName': "fileName_example" // String | Optional input file name. Needed when using bytestreams instead of filestreams
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerUsingStream(configName, stream, opts, callback);
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

