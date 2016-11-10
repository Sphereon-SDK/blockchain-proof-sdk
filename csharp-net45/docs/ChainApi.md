# Sphereon.SDK.Blockchain.Proof.Api.ChainApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateChain**](ChainApi.md#createchain) | **POST** /blockchain/proof/0.1.0/existence | Create a new existence chain


<a name="createchain"></a>
# **CreateChain**
> CreateChainResponse CreateChain (CreateChainRequest request)

Create a new existence chain

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class CreateChainExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ChainApi();
            var request = new CreateChainRequest(); // CreateChainRequest | Create a new Proof of Existence chain using the provided existence settings

            try
            {
                // Create a new existence chain
                CreateChainResponse result = apiInstance.CreateChain(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ChainApi.CreateChain: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

