# ChainApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChain**](ChainApi.md#createChain) | **POST** blockchain/proof/0.1.0/existence | Create a new entity chain


<a name="createChain"></a>
# **createChain**
> CreateChainResponse createChain(request)

Create a new entity chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.proof.handler.ApiClient;
//import com.sphereon.sdk.blockchain.proof.handler.ApiException;
//import com.sphereon.sdk.blockchain.proof.handler.Configuration;
//import com.sphereon.sdk.blockchain.proof.handler.auth.*;
//import com.sphereon.sdk.blockchain.proof.api.ChainApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

ChainApi apiInstance = new ChainApi();
CreateChainRequest request = new CreateChainRequest(); // CreateChainRequest | Create a new Proof of Existence chain using the provided entity settings
try {
    CreateChainResponse result = apiInstance.createChain(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainApi#createChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateChainRequest**](CreateChainRequest.md)| Create a new Proof of Existence chain using the provided entity settings |

### Return type

[**CreateChainResponse**](CreateChainResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

