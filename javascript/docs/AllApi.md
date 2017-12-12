# BlockchainProof.AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfiguration**](AllApi.md#createConfiguration) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/config | Create a new configuration
[**getCurrentConfiguration**](AllApi.md#getCurrentConfiguration) | **GET** /blockchain/proof/0.9.0-SNAPSHOT/existence/config/{configName} | Get the settings for registration/verification
[**registerContent**](AllApi.md#registerContent) | **PUT** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/content | Register content
[**registerStream**](AllApi.md#registerStream) | **PUT** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/multipart | Register content using a bytestream/file
[**registerStreamOnStorage**](AllApi.md#registerStreamOnStorage) | **PUT** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/location | Register content using a bytestream/file
[**verifyContent**](AllApi.md#verifyContent) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/content | Verify content
[**verifyStream**](AllApi.md#verifyStream) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/multipart | Verify content using a bytestream/file
[**verifyStreamsOnStorage**](AllApi.md#verifyStreamsOnStorage) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/location | Verify content using a bytestream/file


<a name="createConfiguration"></a>
# **createConfiguration**
> ConfigurationResponse createConfiguration(request)

Create a new configuration

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.AllApi();

var request = new BlockchainProof.CreateConfiguration(); // CreateConfiguration | Create a new Proof of Existence context using the provided entity settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createConfiguration(request, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateConfiguration**](CreateConfiguration.md)| Create a new Proof of Existence context using the provided entity settings | 

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="getCurrentConfiguration"></a>
# **getCurrentConfiguration**
> ConfigurationResponse getCurrentConfiguration(configName)

Get the settings for registration/verification

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.AllApi();

var configName = "configName_example"; // String | The configuration name this operation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCurrentConfiguration(configName, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation | 

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="registerContent"></a>
# **registerContent**
> RegisterContentResponse registerContent(configName, existence)

Register content

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.AllApi();

var configName = "configName_example"; // String | The configuration name this operation

var existence = new BlockchainProof.ContentRequest(); // ContentRequest | Register content using the current settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerContent(configName, existence, callback);
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

<a name="registerStream"></a>
# **registerStream**
> RegisterContentResponse registerStream(configName, stream)

Register content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.AllApi();

var configName = "configName_example"; // String | The configuration name this operation

var stream = "/path/to/file.txt"; // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerStream(configName, stream, callback);
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

<a name="registerStreamOnStorage"></a>
# **registerStreamOnStorage**
> RegisterContentResponse registerStreamOnStorage(configName, streamLocations)

Register content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.AllApi();

var configName = "configName_example"; // String | The configuration name this operation

var streamLocations = [new BlockchainProof.StreamLocation()]; // [StreamLocation] | The stream locations on storage


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerStreamOnStorage(configName, streamLocations, callback);
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

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

<a name="verifyContent"></a>
# **verifyContent**
> VerifyContentResponse verifyContent(configName, existence)

Verify content

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.AllApi();

var configName = "configName_example"; // String | The configName for this operation

var existence = new BlockchainProof.ContentRequest(); // ContentRequest | Verify content using the current settings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyContent(configName, existence, callback);
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
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.AllApi();

var configName = "configName_example"; // String | The configuration name this operation

var stream = "/path/to/file.txt"; // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyStream(configName, stream, callback);
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
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.AllApi();

var configName = "configName_example"; // String | The context for this operation

var streamLocations = [new BlockchainProof.StreamLocation()]; // [StreamLocation] | The stream locations on storage


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyStreamsOnStorage(configName, streamLocations, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The context for this operation | 
 **streamLocations** | [**[StreamLocation]**](StreamLocation.md)| The stream locations on storage | 

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

