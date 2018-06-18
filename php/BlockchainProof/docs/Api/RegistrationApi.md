# Sphereon\SDK\Blockchain\Proof\RegistrationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerUsingContent**](RegistrationApi.md#registerUsingContent) | **PUT** /existence/{configName}/content | Register content
[**registerUsingLocation**](RegistrationApi.md#registerUsingLocation) | **PUT** /existence/{configName}/streams/location | Register hash using the Storage API
[**registerUsingStream**](RegistrationApi.md#registerUsingStream) | **PUT** /existence/{configName}/streams/multipart | Register bytestream/file hash


# **registerUsingContent**
> \Sphereon\SDK\Blockchain\Proof\Model\RegisterContentResponse registerUsingContent($config_name, $existence, $request_id, $base64_secret, $supplied_signature, $key_id)

Register content

Register content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
$config = Sphereon\SDK\Blockchain\Proof\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Sphereon\SDK\Blockchain\Proof\Api\RegistrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$config_name = "config_name_example"; // string | The configuration name this operation
$existence = new \Sphereon\SDK\Blockchain\Proof\Model\ContentRequest(); // \Sphereon\SDK\Blockchain\Proof\Model\ContentRequest | Register content using the current settings
$request_id = "request_id_example"; // string | Optional request id
$base64_secret = "base64_secret_example"; // string | An alternate secret key in base64 format that overrides the value in your configuration.
$supplied_signature = "supplied_signature_example"; // string | An alternate supplied Signature in base64 format that overrides the signature generation.
$key_id = "key_id_example"; // string | An alternate crypto keys API id that will be used for signature generation.

try {
    $result = $apiInstance->registerUsingContent($config_name, $existence, $request_id, $base64_secret, $supplied_signature, $key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RegistrationApi->registerUsingContent: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config_name** | **string**| The configuration name this operation |
 **existence** | [**\Sphereon\SDK\Blockchain\Proof\Model\ContentRequest**](../Model/ContentRequest.md)| Register content using the current settings |
 **request_id** | **string**| Optional request id | [optional]
 **base64_secret** | **string**| An alternate secret key in base64 format that overrides the value in your configuration. | [optional]
 **supplied_signature** | **string**| An alternate supplied Signature in base64 format that overrides the signature generation. | [optional]
 **key_id** | **string**| An alternate crypto keys API id that will be used for signature generation. | [optional]

### Return type

[**\Sphereon\SDK\Blockchain\Proof\Model\RegisterContentResponse**](../Model/RegisterContentResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **registerUsingLocation**
> \Sphereon\SDK\Blockchain\Proof\Model\RegisterContentResponse registerUsingLocation($config_name, $stream_location, $request_id, $base64_secret, $supplied_signature, $key_id)

Register hash using the Storage API

Register a hash of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you'd like to store content

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
$config = Sphereon\SDK\Blockchain\Proof\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Sphereon\SDK\Blockchain\Proof\Api\RegistrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$config_name = "config_name_example"; // string | The configuration name this operation
$stream_location = new \Sphereon\SDK\Blockchain\Proof\Model\StreamLocation(); // \Sphereon\SDK\Blockchain\Proof\Model\StreamLocation | The stream locations on storage
$request_id = "request_id_example"; // string | Optional request id
$base64_secret = "base64_secret_example"; // string | An alternate secret key in base64 format that overrides the value in your configuration.
$supplied_signature = "supplied_signature_example"; // string | An alternate supplied Signature in base64 format that overrides the signature generation.
$key_id = "key_id_example"; // string | An alternate crypto keys API id that will be used for signature generation.

try {
    $result = $apiInstance->registerUsingLocation($config_name, $stream_location, $request_id, $base64_secret, $supplied_signature, $key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RegistrationApi->registerUsingLocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config_name** | **string**| The configuration name this operation |
 **stream_location** | [**\Sphereon\SDK\Blockchain\Proof\Model\StreamLocation**](../Model/StreamLocation.md)| The stream locations on storage |
 **request_id** | **string**| Optional request id | [optional]
 **base64_secret** | **string**| An alternate secret key in base64 format that overrides the value in your configuration. | [optional]
 **supplied_signature** | **string**| An alternate supplied Signature in base64 format that overrides the signature generation. | [optional]
 **key_id** | **string**| An alternate crypto keys API id that will be used for signature generation. | [optional]

### Return type

[**\Sphereon\SDK\Blockchain\Proof\Model\RegisterContentResponse**](../Model/RegisterContentResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **registerUsingStream**
> \Sphereon\SDK\Blockchain\Proof\Model\RegisterContentResponse registerUsingStream($config_name, $stream, $file_name, $request_id, $base64_secret, $supplied_signature, $key_id)

Register bytestream/file hash

Register a hash of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you'd like to store content

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
$config = Sphereon\SDK\Blockchain\Proof\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Sphereon\SDK\Blockchain\Proof\Api\RegistrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$config_name = "config_name_example"; // string | The configuration name this operation
$stream = "/path/to/file.txt"; // \SplFileObject | The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
$file_name = "file_name_example"; // string | Optional input file name. Needed when using bytestreams instead of filestreams
$request_id = "request_id_example"; // string | Optional request id
$base64_secret = "base64_secret_example"; // string | An alternate secret key in base64 format that overrides the value in your configuration.
$supplied_signature = "supplied_signature_example"; // string | An alternate supplied Signature in base64 format that overrides the signature generation.
$key_id = "key_id_example"; // string | An alternate crypto keys API id that will be used for signature generation.

try {
    $result = $apiInstance->registerUsingStream($config_name, $stream, $file_name, $request_id, $base64_secret, $supplied_signature, $key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RegistrationApi->registerUsingStream: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config_name** | **string**| The configuration name this operation |
 **stream** | **\SplFileObject**| The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored |
 **file_name** | **string**| Optional input file name. Needed when using bytestreams instead of filestreams | [optional]
 **request_id** | **string**| Optional request id | [optional]
 **base64_secret** | **string**| An alternate secret key in base64 format that overrides the value in your configuration. | [optional]
 **supplied_signature** | **string**| An alternate supplied Signature in base64 format that overrides the signature generation. | [optional]
 **key_id** | **string**| An alternate crypto keys API id that will be used for signature generation. | [optional]

### Return type

[**\Sphereon\SDK\Blockchain\Proof\Model\RegisterContentResponse**](../Model/RegisterContentResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

