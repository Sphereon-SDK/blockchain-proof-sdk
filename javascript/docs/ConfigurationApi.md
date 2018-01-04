# BlockchainProof.ConfigurationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.9*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfiguration**](ConfigurationApi.md#createConfiguration) | **POST** /config | Create a new configuration
[**getConfiguration**](ConfigurationApi.md#getConfiguration) | **GET** /config/{configName} | Get configuration


<a name="createConfiguration"></a>
# **createConfiguration**
> ConfigurationResponse createConfiguration(request)

Create a new configuration

Create a new configuration

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.ConfigurationApi();

var request = new BlockchainProof.CreateConfigurationRequest(); // CreateConfigurationRequest | Create a new Proof of Existence configuration using the provided settings. The context points to a context of the Easy Blockchain API. When you have no own context, simply use 'multichain' without the quotes as context. You will be using our multichain ledger then, which is recomended during development/testing


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
 **request** | [**CreateConfigurationRequest**](CreateConfigurationRequest.md)| Create a new Proof of Existence configuration using the provided settings. The context points to a context of the Easy Blockchain API. When you have no own context, simply use &#39;multichain&#39; without the quotes as context. You will be using our multichain ledger then, which is recomended during development/testing | 

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="getConfiguration"></a>
# **getConfiguration**
> ConfigurationResponse getConfiguration(configName)

Get configuration

Get the configuration for registration/verification

### Example
```javascript
var BlockchainProof = require('blockchain_proof');
var defaultClient = BlockchainProof.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2schema
var oauth2schema = defaultClient.authentications['oauth2schema'];
oauth2schema.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new BlockchainProof.ConfigurationApi();

var configName = "configName_example"; // String | The configuration name this operation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getConfiguration(configName, callback);
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

