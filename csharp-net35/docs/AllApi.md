# Sphereon.SDK.Blockchain.Proof.Api.AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateConfiguration**](AllApi.md#createconfiguration) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/config | Create a new configuration
[**GetCurrentConfiguration**](AllApi.md#getcurrentconfiguration) | **GET** /blockchain/proof/0.9.0-SNAPSHOT/existence/config/{configName} | Get the settings for registration/verification
[**RegisterContent**](AllApi.md#registercontent) | **PUT** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/content | Register content
[**RegisterStream**](AllApi.md#registerstream) | **PUT** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/multipart | Register content using a bytestream/file
[**RegisterStreamOnStorage**](AllApi.md#registerstreamonstorage) | **PUT** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/location | Register content using a bytestream/file
[**VerifyContent**](AllApi.md#verifycontent) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/content | Verify content
[**VerifyStream**](AllApi.md#verifystream) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/multipart | Verify content using a bytestream/file
[**VerifyStreamsOnStorage**](AllApi.md#verifystreamsonstorage) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/location | Verify content using a bytestream/file


<a name="createconfiguration"></a>
# **CreateConfiguration**
> ConfigurationResponse CreateConfiguration (CreateConfiguration request)

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

            var apiInstance = new AllApi();
            var request = new CreateConfiguration(); // CreateConfiguration | Create a new Proof of Existence context using the provided entity settings

            try
            {
                // Create a new configuration
                ConfigurationResponse result = apiInstance.CreateConfiguration(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.CreateConfiguration: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateConfiguration**](CreateConfiguration.md)| Create a new Proof of Existence context using the provided entity settings | 

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcurrentconfiguration"></a>
# **GetCurrentConfiguration**
> ConfigurationResponse GetCurrentConfiguration (string configName)

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
    public class GetCurrentConfigurationExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var configName = configName_example;  // string | The configuration name this operation

            try
            {
                // Get the settings for registration/verification
                ConfigurationResponse result = apiInstance.GetCurrentConfiguration(configName);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetCurrentConfiguration: " + e.Message );
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

<a name="registercontent"></a>
# **RegisterContent**
> RegisterContentResponse RegisterContent (string configName, ContentRequest existence)

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
            var configName = configName_example;  // string | The configuration name this operation
            var existence = new ContentRequest(); // ContentRequest | Register content using the current settings

            try
            {
                // Register content
                RegisterContentResponse result = apiInstance.RegisterContent(configName, existence);
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
 **configName** | **string**| The configuration name this operation | 
 **existence** | [**ContentRequest**](ContentRequest.md)| Register content using the current settings | 

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
> RegisterContentResponse RegisterStream (string configName, System.IO.Stream stream)

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
            var configName = configName_example;  // string | The configuration name this operation
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored

            try
            {
                // Register content using a bytestream/file
                RegisterContentResponse result = apiInstance.RegisterStream(configName, stream);
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
 **configName** | **string**| The configuration name this operation | 
 **stream** | **System.IO.Stream**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored | 

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="registerstreamonstorage"></a>
# **RegisterStreamOnStorage**
> RegisterContentResponse RegisterStreamOnStorage (string configName, List<StreamLocation> streamLocations)

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
    public class RegisterStreamOnStorageExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var configName = configName_example;  // string | The configuration name this operation
            var streamLocations = new List<StreamLocation>(); // List<StreamLocation> | The stream locations on storage

            try
            {
                // Register content using a bytestream/file
                RegisterContentResponse result = apiInstance.RegisterStreamOnStorage(configName, streamLocations);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.RegisterStreamOnStorage: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **string**| The configuration name this operation | 
 **streamLocations** | [**List&lt;StreamLocation&gt;**](StreamLocation.md)| The stream locations on storage | 

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
> VerifyContentResponse VerifyContent (string configName, ContentRequest existence)

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
            var configName = configName_example;  // string | The configName for this operation
            var existence = new ContentRequest(); // ContentRequest | Verify content using the current settings

            try
            {
                // Verify content
                VerifyContentResponse result = apiInstance.VerifyContent(configName, existence);
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

<a name="verifystream"></a>
# **VerifyStream**
> VerifyContentResponse VerifyStream (string configName, System.IO.Stream stream)

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
    public class VerifyStreamExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var configName = configName_example;  // string | The configuration name this operation
            var stream = new System.IO.Stream(); // System.IO.Stream | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored

            try
            {
                // Verify content using a bytestream/file
                VerifyContentResponse result = apiInstance.VerifyStream(configName, stream);
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

<a name="verifystreamsonstorage"></a>
# **VerifyStreamsOnStorage**
> VerifyContentResponse VerifyStreamsOnStorage (string configName, List<StreamLocation> streamLocations)

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
    public class VerifyStreamsOnStorageExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: oauth2schema
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AllApi();
            var configName = configName_example;  // string | The context for this operation
            var streamLocations = new List<StreamLocation>(); // List<StreamLocation> | The stream locations on storage

            try
            {
                // Verify content using a bytestream/file
                VerifyContentResponse result = apiInstance.VerifyStreamsOnStorage(configName, streamLocations);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.VerifyStreamsOnStorage: " + e.Message );
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

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

