# Sphereon.SDK.Blockchain.Proof.Api.AllApi

All URIs are relative to *https://gw-dev.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateConfiguration**](AllApi.md#createconfiguration) | **POST** /blockchain/proof/0.9/existence/config | Create a new configuration
[**GetConfiguration**](AllApi.md#getconfiguration) | **GET** /blockchain/proof/0.9/existence/config/{configName} | Get the settings for registration/verification
[**RegisterUsingContent**](AllApi.md#registerusingcontent) | **PUT** /blockchain/proof/0.9/existence/{configName}/content | Register content
[**RegisterUsingLocation**](AllApi.md#registerusinglocation) | **PUT** /blockchain/proof/0.9/existence/{configName}/streams/location | Register content using a Stream Location from Storage API
[**RegisterUsingStream**](AllApi.md#registerusingstream) | **PUT** /blockchain/proof/0.9/existence/{configName}/streams/multipart | Register content using a bytestream/file
[**VerifyUsingContent**](AllApi.md#verifyusingcontent) | **POST** /blockchain/proof/0.9/existence/{configName}/content | Verify content
[**VerifyUsingLocation**](AllApi.md#verifyusinglocation) | **POST** /blockchain/proof/0.9/existence/{configName}/streams/location | Verify content using Stream Locations from the Storage API
[**VerifyUsingStream**](AllApi.md#verifyusingstream) | **POST** /blockchain/proof/0.9/existence/{configName}/streams/multipart | Verify content using a bytestream/file


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

<a name="getconfiguration"></a>
# **GetConfiguration**
> ConfigurationResponse GetConfiguration (string configName)

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
    public class GetConfigurationExample
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
                ConfigurationResponse result = apiInstance.GetConfiguration(configName);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.GetConfiguration: " + e.Message );
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

<a name="registerusingcontent"></a>
# **RegisterUsingContent**
> RegisterContentResponse RegisterUsingContent (string configName, ContentRequest existence)

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
    public class RegisterUsingContentExample
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
                RegisterContentResponse result = apiInstance.RegisterUsingContent(configName, existence);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.RegisterUsingContent: " + e.Message );
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

<a name="registerusinglocation"></a>
# **RegisterUsingLocation**
> RegisterContentResponse RegisterUsingLocation (string configName, List<StreamLocation> streamLocations)

Register content using a Stream Location from Storage API

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
    public class RegisterUsingLocationExample
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
                // Register content using a Stream Location from Storage API
                RegisterContentResponse result = apiInstance.RegisterUsingLocation(configName, streamLocations);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.RegisterUsingLocation: " + e.Message );
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

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="registerusingstream"></a>
# **RegisterUsingStream**
> RegisterContentResponse RegisterUsingStream (string configName, System.IO.Stream stream)

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
    public class RegisterUsingStreamExample
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
                RegisterContentResponse result = apiInstance.RegisterUsingStream(configName, stream);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AllApi.RegisterUsingStream: " + e.Message );
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

            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.VerifyUsingContent: " + e.Message );
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

            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.VerifyUsingLocation: " + e.Message );
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

            var apiInstance = new AllApi();
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
                Debug.Print("Exception when calling AllApi.VerifyUsingStream: " + e.Message );
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

