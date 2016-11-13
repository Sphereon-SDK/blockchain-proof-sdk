# Sphereon.SDK.Blockchain.Proof.Api.AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateChain**](AllApi.md#createchain) | **POST** /blockchain/proof/0.1.0/existence | Create a new existence chain
[**RegisterContent**](AllApi.md#registercontent) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/content | Register content
[**RegisterStream**](AllApi.md#registerstream) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/stream | Register content using a bytestream/file
[**Settings**](AllApi.md#settings) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/settings | Get the settings for registration/verification
[**VerifyContent**](AllApi.md#verifycontent) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/content | Verify content
[**VerifyStream**](AllApi.md#verifystream) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/stream | Verify content using a bytestream/file


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

            var apiInstance = new AllApi();
            var request = new CreateChainRequest(); // CreateChainRequest | Create a new Proof of Existence chain using the provided existence settings

            try
            {
                // Create a new existence chain
                CreateChainResponse result = apiInstance.CreateChain(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateChain: " + e.Message );
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

<a name="registercontent"></a>
# **RegisterContent**
> RegisterContentResponse RegisterContent (string chainId, ContentRequest existence)

Register content

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class RegisterContentExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var chainId = chainId_example;  // string | The chain where the content will be registered
            var existence = new ContentRequest(); // ContentRequest | Register content using the current existence settings

            try
            {
                // Register content
                RegisterContentResponse result = apiInstance.RegisterContent(chainId, existence);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.RegisterContent: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| The chain where the content will be registered | 
 **existence** | [**ContentRequest**](ContentRequest.md)| Register content using the current existence settings | 

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="registerstream"></a>
# **RegisterStream**
> RegisterContentResponse RegisterStream (string chainId, System.IO.Stream stream)

Register content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class RegisterStreamExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var chainId = chainId_example;  // string | The chain where the content will be registered
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored

            try
            {
                // Register content using a bytestream/file
                RegisterContentResponse result = apiInstance.RegisterStream(chainId, stream);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.RegisterStream: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| The chain where the content will be registered | 
 **stream** | **System.IO.Stream**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored | 

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

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

            var apiInstance = new AllApi();
            var chainId = chainId_example;  // string | This is the chain where the content is registered/verified

            try
            {
                // Get the settings for registration/verification
                SettingsResponse result = apiInstance.Settings(chainId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.Settings: " + e.Message );
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

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifycontent"></a>
# **VerifyContent**
> VerifyContentResponse VerifyContent (string chainId, ContentRequest existence)

Verify content

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class VerifyContentExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var chainId = chainId_example;  // string | The chain where the content was registered
            var existence = new ContentRequest(); // ContentRequest | Verify content using the current existence settings

            try
            {
                // Verify content
                VerifyContentResponse result = apiInstance.VerifyContent(chainId, existence);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.VerifyContent: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| The chain where the content was registered | 
 **existence** | [**ContentRequest**](ContentRequest.md)| Verify content using the current existence settings | 

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifystream"></a>
# **VerifyStream**
> VerifyContentResponse VerifyStream (string chainId, System.IO.Stream stream)

Verify content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class VerifyStreamExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var chainId = chainId_example;  // string | The chain where the content will be registered
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored

            try
            {
                // Verify content using a bytestream/file
                VerifyContentResponse result = apiInstance.VerifyStream(chainId, stream);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.VerifyStream: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| The chain where the content will be registered | 
 **stream** | **System.IO.Stream**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored | 

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

