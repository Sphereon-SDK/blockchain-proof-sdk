# AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfiguration**](AllApi.md#createConfiguration) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/config | Create a new configuration
[**getCurrentConfiguration**](AllApi.md#getCurrentConfiguration) | **GET** /blockchain/proof/0.9.0-SNAPSHOT/existence/config/{configName} | Get the settings for registration/verification
[**registerContent**](AllApi.md#registerContent) | **PUT** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/content | Register content
[**registerStream**](AllApi.md#registerStream) | **PUT** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/multipart | Register content using a bytestream/file
[**registerStreamOnStorage**](AllApi.md#registerStreamOnStorage) | **PUT** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/location | Register content using a bytestream/file
[**verifyContent**](AllApi.md#verifyContent) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/content | Verify content
[**verifyStream**](AllApi.md#verifyStream) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/multipart | Verify content using a bytestream/file
[**verifyStreamsOnStorage**](AllApi.md#verifyStreamsOnStorage) | **POST** /blockchain/proof/0.9.0-SNAPSHOT/existence/{configName}/streams/location | Verify content using a bytestream/file


<a name="createConfiguration"></a>
# **createConfiguration**
> ConfigurationResponse createConfiguration(request)

Create a new configuration

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
CreateConfiguration request = new CreateConfiguration(); // CreateConfiguration | Create a new Proof of Existence context using the provided entity settings
try {
    ConfigurationResponse result = apiInstance.createConfiguration(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createConfiguration");
    e.printStackTrace();
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

<a name="getCurrentConfiguration"></a>
# **getCurrentConfiguration**
> ConfigurationResponse getCurrentConfiguration(configName)

Get the settings for registration/verification

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String configName = "configName_example"; // String | The configuration name this operation
try {
    ConfigurationResponse result = apiInstance.getCurrentConfiguration(configName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#getCurrentConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="registerContent"></a>
# **registerContent**
> RegisterContentResponse registerContent(configName, existence)

Register content

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String configName = "configName_example"; // String | The configuration name this operation
ContentRequest existence = new ContentRequest(); // ContentRequest | Register content using the current settings
try {
    RegisterContentResponse result = apiInstance.registerContent(configName, existence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#registerContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |
 **existence** | [**ContentRequest**](ContentRequest.md)| Register content using the current settings |

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="registerStream"></a>
# **registerStream**
> RegisterContentResponse registerStream(configName, stream)

Register content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String configName = "configName_example"; // String | The configuration name this operation
File stream = new File("/path/to/file.txt"); // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
try {
    RegisterContentResponse result = apiInstance.registerStream(configName, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#registerStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |
 **stream** | **File**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored |

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

<a name="registerStreamOnStorage"></a>
# **registerStreamOnStorage**
> RegisterContentResponse registerStreamOnStorage(configName, streamLocations)

Register content using a bytestream/file

Register content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String configName = "configName_example"; // String | The configuration name this operation
List<StreamLocation> streamLocations = Arrays.asList(new StreamLocation()); // List<StreamLocation> | The stream locations on storage
try {
    RegisterContentResponse result = apiInstance.registerStreamOnStorage(configName, streamLocations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#registerStreamOnStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |
 **streamLocations** | [**List&lt;StreamLocation&gt;**](StreamLocation.md)| The stream locations on storage |

### Return type

[**RegisterContentResponse**](RegisterContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

<a name="verifyContent"></a>
# **verifyContent**
> VerifyContentResponse verifyContent(configName, existence)

Verify content

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String configName = "configName_example"; // String | The configName for this operation
ContentRequest existence = new ContentRequest(); // ContentRequest | Verify content using the current settings
try {
    VerifyContentResponse result = apiInstance.verifyContent(configName, existence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#verifyContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configName for this operation |
 **existence** | [**ContentRequest**](ContentRequest.md)| Verify content using the current settings |

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="verifyStream"></a>
# **verifyStream**
> VerifyContentResponse verifyStream(configName, stream)

Verify content using a bytestream/file

Verify content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String configName = "configName_example"; // String | The configuration name this operation
File stream = new File("/path/to/file.txt"); // File | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
try {
    VerifyContentResponse result = apiInstance.verifyStream(configName, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#verifyStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The configuration name this operation |
 **stream** | **File**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored |

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

<a name="verifyStreamsOnStorage"></a>
# **verifyStreamsOnStorage**
> VerifyContentResponse verifyStreamsOnStorage(configName, streamLocations)

Verify content using a bytestream/file

Verify content by supplying a file or some other binary data. Hashing will be done on the server side

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.AllApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

AllApi apiInstance = new AllApi();
String configName = "configName_example"; // String | The context for this operation
List<StreamLocation> streamLocations = Arrays.asList(new StreamLocation()); // List<StreamLocation> | The stream locations on storage
try {
    VerifyContentResponse result = apiInstance.verifyStreamsOnStorage(configName, streamLocations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#verifyStreamsOnStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configName** | **String**| The context for this operation |
 **streamLocations** | [**List&lt;StreamLocation&gt;**](StreamLocation.md)| The stream locations on storage |

### Return type

[**VerifyContentResponse**](VerifyContentResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

