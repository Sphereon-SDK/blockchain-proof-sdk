# Sphereon.SDK.Blockchain.Proof.Api.RegistrationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RegisterUsingContent**](RegistrationApi.md#registerusingcontent) | **PUT** /existence/{configName}/content | Register content
[**RegisterUsingLocation**](RegistrationApi.md#registerusinglocation) | **PUT** /existence/{configName}/streams/location | Register hash using the Storage API
[**RegisterUsingStream**](RegistrationApi.md#registerusingstream) | **PUT** /existence/{configName}/streams/multipart | Register bytestream/file hash


<a name="registerusingcontent"></a>
# **RegisterUsingContent**
> RegisterContentResponse RegisterUsingContent (string configName, ContentRequest existence, string requestId = null, string base64Secret = null, string suppliedSignature = null, string keyId = null)

Register content

Register content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class RegisterUsingContentExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new RegistrationApi();
            var configName = configName_example;  // string | The configuration name this operation
            var existence = new ContentRequest(); // ContentRequest | Register content using the current settings
            var requestId = requestId_example;  // string | Optional request id (optional) 
            var base64Secret = base64Secret_example;  // string | An alternate secret key in base64 format that overrides the value in your configuration. (optional) 
            var suppliedSignature = suppliedSignature_example;  // string | An alternate supplied Signature in base64 format that overrides the signature generation. (optional) 
            var keyId = keyId_example;  // string | An alternate crypto keys API id that will be used for signature generation. (optional) 

            try
            {
                // Register content
                RegisterContentResponse result = apiInstance.RegisterUsingContent(configName, existence, requestId, base64Secret, suppliedSignature, keyId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RegistrationApi.RegisterUsingContent: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **string**| The configuration name this operation | 
 **existence** | [**ContentRequest**](ContentRequest.md)| Register content using the current settings | 
 **requestId** | **string**| Optional request id | [optional] 
 **base64Secret** | **string**| An alternate secret key in base64 format that overrides the value in your configuration. | [optional] 
 **suppliedSignature** | **string**| An alternate supplied Signature in base64 format that overrides the signature generation. | [optional] 
 **keyId** | **string**| An alternate crypto keys API id that will be used for signature generation. | [optional] 

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="registerusinglocation"></a>
# **RegisterUsingLocation**
> RegisterContentResponse RegisterUsingLocation (string configName, StreamLocation streamLocation, string requestId = null, string base64Secret = null, string suppliedSignature = null, string keyId = null)

Register hash using the Storage API

Register a hash of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you'd like to store content

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class RegisterUsingLocationExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new RegistrationApi();
            var configName = configName_example;  // string | The configuration name this operation
            var streamLocation = new StreamLocation(); // StreamLocation | The stream locations on storage
            var requestId = requestId_example;  // string | Optional request id (optional) 
            var base64Secret = base64Secret_example;  // string | An alternate secret key in base64 format that overrides the value in your configuration. (optional) 
            var suppliedSignature = suppliedSignature_example;  // string | An alternate supplied Signature in base64 format that overrides the signature generation. (optional) 
            var keyId = keyId_example;  // string | An alternate crypto keys API id that will be used for signature generation. (optional) 

            try
            {
                // Register hash using the Storage API
                RegisterContentResponse result = apiInstance.RegisterUsingLocation(configName, streamLocation, requestId, base64Secret, suppliedSignature, keyId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RegistrationApi.RegisterUsingLocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **string**| The configuration name this operation | 
 **streamLocation** | [**StreamLocation**](StreamLocation.md)| The stream locations on storage | 
 **requestId** | **string**| Optional request id | [optional] 
 **base64Secret** | **string**| An alternate secret key in base64 format that overrides the value in your configuration. | [optional] 
 **suppliedSignature** | **string**| An alternate supplied Signature in base64 format that overrides the signature generation. | [optional] 
 **keyId** | **string**| An alternate crypto keys API id that will be used for signature generation. | [optional] 

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="registerusingstream"></a>
# **RegisterUsingStream**
> RegisterContentResponse RegisterUsingStream (string configName, System.IO.Stream stream, string fileName = null, string requestId = null, string base64Secret = null, string suppliedSignature = null, string keyId = null)

Register bytestream/file hash

Register a hash of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you'd like to store content

### Example
```csharp
using System;
using System.Diagnostics;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Example
{
    public class RegisterUsingStreamExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new RegistrationApi();
            var configName = configName_example;  // string | The configuration name this operation
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
            var fileName = fileName_example;  // string | Optional input file name. Needed when using bytestreams instead of filestreams (optional) 
            var requestId = requestId_example;  // string | Optional request id (optional) 
            var base64Secret = base64Secret_example;  // string | An alternate secret key in base64 format that overrides the value in your configuration. (optional) 
            var suppliedSignature = suppliedSignature_example;  // string | An alternate supplied Signature in base64 format that overrides the signature generation. (optional) 
            var keyId = keyId_example;  // string | An alternate crypto keys API id that will be used for signature generation. (optional) 

            try
            {
                // Register bytestream/file hash
                RegisterContentResponse result = apiInstance.RegisterUsingStream(configName, stream, fileName, requestId, base64Secret, suppliedSignature, keyId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RegistrationApi.RegisterUsingStream: " + e.Message );
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
 **requestId** | **string**| Optional request id | [optional] 
 **base64Secret** | **string**| An alternate secret key in base64 format that overrides the value in your configuration. | [optional] 
 **suppliedSignature** | **string**| An alternate supplied Signature in base64 format that overrides the signature generation. | [optional] 
 **keyId** | **string**| An alternate crypto keys API id that will be used for signature generation. | [optional] 

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

