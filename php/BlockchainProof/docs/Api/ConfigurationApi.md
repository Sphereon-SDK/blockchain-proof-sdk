# Sphereon\SDK\Blockchain\Proof\ConfigurationApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfiguration**](ConfigurationApi.md#createConfiguration) | **POST** /config | Create a new configuration
[**getConfiguration**](ConfigurationApi.md#getConfiguration) | **GET** /config/{configName} | Get configuration


# **createConfiguration**
> \Sphereon\SDK\Blockchain\Proof\Model\ConfigurationResponse createConfiguration($request)

Create a new configuration

Create a new configuration

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
$config = Sphereon\SDK\Blockchain\Proof\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Sphereon\SDK\Blockchain\Proof\Api\ConfigurationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$request = new \Sphereon\SDK\Blockchain\Proof\Model\CreateConfigurationRequest(); // \Sphereon\SDK\Blockchain\Proof\Model\CreateConfigurationRequest | Create a new Proof of Existence configuration using the provided settings. The context points to a context of the Easy Blockchain API. When you have no own context, simply use 'multichain' without the quotes as context. You will be using our multichain ledger then, which is recomended during development/testing

try {
    $result = $apiInstance->createConfiguration($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigurationApi->createConfiguration: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\Sphereon\SDK\Blockchain\Proof\Model\CreateConfigurationRequest**](../Model/CreateConfigurationRequest.md)| Create a new Proof of Existence configuration using the provided settings. The context points to a context of the Easy Blockchain API. When you have no own context, simply use &#39;multichain&#39; without the quotes as context. You will be using our multichain ledger then, which is recomended during development/testing |

### Return type

[**\Sphereon\SDK\Blockchain\Proof\Model\ConfigurationResponse**](../Model/ConfigurationResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getConfiguration**
> \Sphereon\SDK\Blockchain\Proof\Model\ConfigurationResponse getConfiguration($config_name)

Get configuration

Get the configuration for registration/verification

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
$config = Sphereon\SDK\Blockchain\Proof\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

$apiInstance = new Sphereon\SDK\Blockchain\Proof\Api\ConfigurationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$config_name = "config_name_example"; // string | The configuration name for this operation

try {
    $result = $apiInstance->getConfiguration($config_name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigurationApi->getConfiguration: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config_name** | **string**| The configuration name for this operation |

### Return type

[**\Sphereon\SDK\Blockchain\Proof\Model\ConfigurationResponse**](../Model/ConfigurationResponse.md)

### Authorization

[oauth2schema](../../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

