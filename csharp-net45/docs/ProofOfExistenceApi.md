# Sphereon.SDK.Blockchain.Proof.Api.ProofOfExistenceApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RegisterContent**](ProofOfExistenceApi.md#registercontent) | **POST** /blockchain/proof/0.1.0/existence/{chainId} | Register content
[**RegisterStream**](ProofOfExistenceApi.md#registerstream) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/stream | Register content using a bytestream/file
[**VerifyContent**](ProofOfExistenceApi.md#verifycontent) | **GET** /blockchain/proof/0.1.0/existence/{chainId} | Verify content
[**VerifyContentByHash**](ProofOfExistenceApi.md#verifycontentbyhash) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/{hash} | Verify content by hash
[**VerifyStream**](ProofOfExistenceApi.md#verifystream) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/stream | Verify content using a bytestream/file


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

            var apiInstance = new ProofOfExistenceApi();
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
                Debug.Print("Exception when calling ProofOfExistenceApi.RegisterContent: " + e.Message );
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
> RegisterContentResponse RegisterStream (string chainId, System.IO.Stream stream, System.IO.Stream settings = null)

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

            var apiInstance = new ProofOfExistenceApi();
            var chainId = chainId_example;  // string | The chain where the content will be registered
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
            var settings = new System.IO.Stream(); // System.IO.Stream | settings (optional) 

            try
            {
                // Register content using a bytestream/file
                RegisterContentResponse result = apiInstance.RegisterStream(chainId, stream, settings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProofOfExistenceApi.RegisterStream: " + e.Message );
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
 **settings** | **System.IO.Stream**| settings | [optional] 

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

            var apiInstance = new ProofOfExistenceApi();
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
                Debug.Print("Exception when calling ProofOfExistenceApi.VerifyContent: " + e.Message );
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

<a name="verifycontentbyhash"></a>
# **VerifyContentByHash**
> VerifyContentResponse VerifyContentByHash (string chainId, string hash, ContentRequest existence = null)

Verify content by hash

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class VerifyContentByHashExample
    {
        public void main()
        {
            
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProofOfExistenceApi();
            var chainId = chainId_example;  // string | The chain where the content was registered
            var hash = hash_example;  // string | The client generated hash
            var existence = new ContentRequest(); // ContentRequest | Verify content using the current existence settings (optional) 

            try
            {
                // Verify content by hash
                VerifyContentResponse result = apiInstance.VerifyContentByHash(chainId, hash, existence);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProofOfExistenceApi.VerifyContentByHash: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **string**| The chain where the content was registered | 
 **hash** | **string**| The client generated hash | 
 **existence** | [**ContentRequest**](ContentRequest.md)| Verify content using the current existence settings | [optional] 

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
> VerifyContentResponse VerifyStream (string chainId, System.IO.Stream stream, System.IO.Stream settings = null)

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

            var apiInstance = new ProofOfExistenceApi();
            var chainId = chainId_example;  // string | The chain where the content will be registered
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
            var settings = new System.IO.Stream(); // System.IO.Stream | settings (optional) 

            try
            {
                // Verify content using a bytestream/file
                VerifyContentResponse result = apiInstance.VerifyStream(chainId, stream, settings);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProofOfExistenceApi.VerifyStream: " + e.Message );
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
 **settings** | **System.IO.Stream**| settings | [optional] 

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

