# Sphereon.SDK.Blockchain.Proof.Api.VerificationApi

All URIs are relative to *https://gw-dev.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VerifyUsingContent**](VerificationApi.md#verifyusingcontent) | **POST** /blockchain/proof/0.9/existence/{configName}/content | Verify content
[**VerifyUsingLocation**](VerificationApi.md#verifyusinglocation) | **POST** /blockchain/proof/0.9/existence/{configName}/streams/location | Verify content using Stream Locations from the Storage API
[**VerifyUsingStream**](VerificationApi.md#verifyusingstream) | **POST** /blockchain/proof/0.9/existence/{configName}/streams/multipart | Verify content using a bytestream/file


<a name="verifyusingcontent"></a>
# **VerifyUsingContent**
> VerifyContentResponse VerifyUsingContent (string configName, ContentRequest existence)

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
    public class VerifyUsingContentExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new VerificationApi();
            var configName = configName_example;  // string | The configName for this operation
            var existence = new ContentRequest(); // ContentRequest | Verify content using the current settings

            try
            {
                // Verify content
                VerifyContentResponse result = apiInstance.VerifyUsingContent(configName, existence);
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
> VerifyContentResponse VerifyUsingLocation (string configName, List<StreamLocation> streamLocations)

Verify content using Stream Locations from the Storage API

Verify content by supplying a file or some other binary data. Hashing will be done on the server side

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
            var streamLocations = new List<StreamLocation>(); // List<StreamLocation> | The stream locations on storage

            try
            {
                // Verify content using Stream Locations from the Storage API
                VerifyContentResponse result = apiInstance.VerifyUsingLocation(configName, streamLocations);
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
 **streamLocations** | [**List&lt;StreamLocation&gt;**](StreamLocation.md)| The stream locations on storage | 

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
> VerifyContentResponse VerifyUsingStream (string configName, System.IO.Stream stream)

Verify content using a bytestream/file

Verify content by supplying a file or some other binary data. Hashing will be done on the server side

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

            try
            {
                // Verify content using a bytestream/file
                VerifyContentResponse result = apiInstance.VerifyUsingStream(configName, stream);
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

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

