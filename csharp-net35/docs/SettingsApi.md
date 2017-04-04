# Sphereon.SDK.Blockchain.Proof.Api.SettingsApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Settings**](SettingsApi.md#settings) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/settings | Get the settings for registration/verification


<a name="settings"></a>
# **Settings**
> SettingsResponse Settings (string chainId)

Get the settings for registration/verification

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class SettingsExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SettingsApi();
            var chainId = chainId_example;  // string | This is the chain where the content is registered/verified

            try
            {
                // Get the settings for registration/verification
                SettingsResponse result = apiInstance.Settings(chainId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SettingsApi.Settings: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| This is the chain where the content is registered/verified | 

### Return type

[**SettingsResponse**](SettingsResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

