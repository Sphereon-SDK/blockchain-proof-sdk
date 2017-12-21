# Sphereon.SDK.Blockchain.Proof.Api.ConfigurationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.9/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateConfiguration**](ConfigurationApi.md#createconfiguration) | **POST** /config | Create a new configuration
[**GetConfiguration**](ConfigurationApi.md#getconfiguration) | **GET** /config/{configName} | Get configuration


<a name="createconfiguration"></a>
# **CreateConfiguration**
> ConfigurationResponse CreateConfiguration (CreateConfigurationRequest request)

Create a new configuration

Create a new configuration

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class CreateConfigurationExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ConfigurationApi();
            var request = new CreateConfigurationRequest(); // CreateConfigurationRequest | Create a new Proof of Existence configuration using the provided settings. The context points to a context of the Easy Blockchain API. When you have no own context, simply use 'multichain' without the quotes as context. You will be using our multichain ledger then, which is recomended during development/testing

            try
            {
                // Create a new configuration
                ConfigurationResponse result = apiInstance.CreateConfiguration(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConfigurationApi.CreateConfiguration: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getconfiguration"></a>
# **GetConfiguration**
> ConfigurationResponse GetConfiguration (string configName)

Get configuration

Get the configuration for registration/verification

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class GetConfigurationExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ConfigurationApi();
            var configName = configName_example;  // string | The configuration name this operation

            try
            {
                // Get configuration
                ConfigurationResponse result = apiInstance.GetConfiguration(configName);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ConfigurationApi.GetConfiguration: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **string**| The configuration name this operation | 

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

