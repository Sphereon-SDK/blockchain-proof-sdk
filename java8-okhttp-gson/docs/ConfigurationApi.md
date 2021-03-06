# ConfigurationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfiguration**](ConfigurationApi.md#createConfiguration) | **POST** /config | Create a new configuration
[**getConfiguration**](ConfigurationApi.md#getConfiguration) | **GET** /config/{configName} | Get configuration
[**updateConfiguration**](ConfigurationApi.md#updateConfiguration) | **POST** /config/{configName} | Partially update a configuration


<a name="createConfiguration"></a>
# **createConfiguration**
> ConfigurationResponse createConfiguration(request)

Create a new configuration

Create a new configuration

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ConfigurationApi apiInstance = new ConfigurationApi();
CreateConfigurationRequest request = new CreateConfigurationRequest(); // CreateConfigurationRequest | Create a new Proof of Existence configuration using the provided settings. The context points to a context of the Easy Blockchain API. When you have no own context, simply use 'multichain' without the quotes as context. You will be using our multichain ledger then, which is recomended during development/testing
try {
    ConfigurationResponse result = apiInstance.createConfiguration(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#createConfiguration");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ConfigurationApi apiInstance = new ConfigurationApi();
String configName = "configName_example"; // String | The configuration name for this operation
try {
    ConfigurationResponse result = apiInstance.getConfiguration(configName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name for this operation |

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateConfiguration"></a>
# **updateConfiguration**
> ConfigurationResponse updateConfiguration(configName, request)

Partially update a configuration

Update a configuration for registration/verification. Does not allow changing the context, access mode or context name. If, and only if, content-extraction-settings are provided, they will be updated. If, and only if, initial-settings are provided, they will be updated.

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ConfigurationApi apiInstance = new ConfigurationApi();
String configName = "configName_example"; // String | The configuration name for this operation
UpdateConfigurationRequest request = new UpdateConfigurationRequest(); // UpdateConfigurationRequest | Update an existing Proof of Existence configuration using the provided settings. The context points to a context of the Easy Blockchain API. When you have no own context, simply use 'multichain' without the quotes as context. You will be using our multichain ledger then, which is recommended during development/testing
try {
    ConfigurationResponse result = apiInstance.updateConfiguration(configName, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#updateConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name for this operation |
 **request** | [**UpdateConfigurationRequest**](UpdateConfigurationRequest.md)| Update an existing Proof of Existence configuration using the provided settings. The context points to a context of the Easy Blockchain API. When you have no own context, simply use &#39;multichain&#39; without the quotes as context. You will be using our multichain ledger then, which is recommended during development/testing |

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

