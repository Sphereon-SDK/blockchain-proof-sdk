# Sphereon.SDK.Blockchain.Proof.Api.VerificationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.9*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VerifyUsingContent**](VerificationApi.md#verifyusingcontent) | **POST** /existence/{configName}/content | Verify content
[**VerifyUsingLocation**](VerificationApi.md#verifyusinglocation) | **POST** /existence/{configName}/streams/location | Verify hash using the Storage API
[**VerifyUsingStream**](VerificationApi.md#verifyusingstream) | **POST** /existence/{configName}/streams/multipart | Verify bytestream/file hash


<a name="verifyusingcontent"></a>
# **VerifyUsingContent**
> VerifyContentResponse VerifyUsingContent (string configName, ContentRequest existence, string secret = null)

Verify content

Verify content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class VerifyUsingContentExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new VerificationApi();
            var configName = configName_example;  // string | The configName for this operation
            var existence = new ContentRequest(); // ContentRequest | Verify content using the current settings
            var secret = secret_example;  // string | An alternate secret key in base 64 format that overrides the value in your configuration. (optional) 

            try
            {
                // Verify content
                VerifyContentResponse result = apiInstance.VerifyUsingContent(configName, existence, secret);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VerificationApi.VerifyUsingContent: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **string**| The configName for this operation | 
 **existence** | [**ContentRequest**](ContentRequest.md)| Verify content using the current settings | 
 **secret** | **string**| An alternate secret key in base 64 format that overrides the value in your configuration. | [optional] 

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyusinglocation"></a>
# **VerifyUsingLocation**
> VerifyContentResponse VerifyUsingLocation (string configName, StreamLocation streamLocation, string requestId = null, string secret = null)

Verify hash using the Storage API

Verify a hash of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you'd like to store content

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class VerifyUsingLocationExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new VerificationApi();
            var configName = configName_example;  // string | The context for this operation
            var streamLocation = new StreamLocation(); // StreamLocation | The stream location on storage
            var requestId = requestId_example;  // string | Optional request id (optional) 
            var secret = secret_example;  // string | An alternate secret key in base 64 format that overrides the value in your configuration. (optional) 

            try
            {
                // Verify hash using the Storage API
                VerifyContentResponse result = apiInstance.VerifyUsingLocation(configName, streamLocation, requestId, secret);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VerificationApi.VerifyUsingLocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **string**| The context for this operation | 
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| The stream location on storage | 
 **requestId** | **string**| Optional request id | [optional] 
 **secret** | **string**| An alternate secret key in base 64 format that overrides the value in your configuration. | [optional] 

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyusingstream"></a>
# **VerifyUsingStream**
> VerifyContentResponse VerifyUsingStream (string configName, System.IO.Stream stream, string fileName = null, string secret = null)

Verify bytestream/file hash

Verify a hash of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you'd like to store content

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class VerifyUsingStreamExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new VerificationApi();
            var configName = configName_example;  // string | The configuration name this operation
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
            var fileName = fileName_example;  // string | Optional input file name. Needed when using bytestreams instead of filestreams (optional) 
            var secret = secret_example;  // string | An alternate secret key in base 64 format that overrides the value in your configuration. (optional) 

            try
            {
                // Verify bytestream/file hash
                VerifyContentResponse result = apiInstance.VerifyUsingStream(configName, stream, fileName, secret);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VerificationApi.VerifyUsingStream: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **string**| The configuration name this operation | 
 **stream** | **System.IO.Stream**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored | 
 **fileName** | **string**| Optional input file name. Needed when using bytestreams instead of filestreams | [optional] 
 **secret** | **string**| An alternate secret key in base 64 format that overrides the value in your configuration. | [optional] 

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

