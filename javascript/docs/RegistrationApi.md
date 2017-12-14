# BlockchainProof.RegistrationApi

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
> RegisterContentResponse registerUsingLocation(configName, streamLocations)

Register content using a Stream Location from Storage API

Register content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.RegistrationApi();

var configName = "configName_example"; // String | The configuration name this operation

var streamLocations = [new BlockchainProof.StreamLocation()]; // [StreamLocation] | The stream locations on storage


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerUsingLocation(configName, streamLocations, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation | 
 **streamLocations** | [**[StreamLocation]**](StreamLocation.md)| The stream locations on storage | 

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
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.RegistrationApi();

var configName = "configName_example"; // String | The configuration name this operation

var stream = "/path/to/file.txt"; // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerUsingStream(configName, stream, callback);
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

