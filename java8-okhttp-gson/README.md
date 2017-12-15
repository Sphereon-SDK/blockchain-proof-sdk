# blockchain-proof-sdk-java8

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sphereon.sdk</groupId>
    <artifactId>blockchain-proof-sdk-java8</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:blockchain-proof-sdk-java8:0.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/blockchain-proof-sdk-java8-0.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.blockchain.proof.handler.*;
import com.sphereon.sdk.blockchain.proof.handler.auth.*;
import com.sphereon.sdk.blockchain.proof.model.*;
import com.sphereon.sdk.blockchain.proof.api.AllApi;

import java.io.File;
import java.util.*;

public class AllApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2schema
        OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
        oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

        AllApi apiInstance = new AllApi();
        CreateChainRequest request = new CreateChainRequest(); // CreateChainRequest | Create a new Proof of Existence chain using the provided entity settings
        try {
            CreateChainResponse result = apiInstance.createChain(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AllApi#createChain");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllApi* | [**createChain**](docs/AllApi.md#createChain) | **POST** /blockchain/proof/0.1.0/existence | Create a new entity chain
*AllApi* | [**registerContent**](docs/AllApi.md#registerContent) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/register/content | Register content
*AllApi* | [**registerStream**](docs/AllApi.md#registerStream) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/register/stream | Register content using a bytestream/file
*AllApi* | [**settings**](docs/AllApi.md#settings) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/settings | Get the settings for registration/verification
*AllApi* | [**verifyContent**](docs/AllApi.md#verifyContent) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/verify/content | Verify content
*AllApi* | [**verifyStream**](docs/AllApi.md#verifyStream) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/verify/stream | Verify content using a bytestream/file
*ChainApi* | [**createChain**](docs/ChainApi.md#createChain) | **POST** /blockchain/proof/0.1.0/existence | Create a new entity chain
*ProofOfExistenceApi* | [**registerContent**](docs/ProofOfExistenceApi.md#registerContent) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/register/content | Register content
*ProofOfExistenceApi* | [**registerStream**](docs/ProofOfExistenceApi.md#registerStream) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/register/stream | Register content using a bytestream/file
*ProofOfExistenceApi* | [**verifyContent**](docs/ProofOfExistenceApi.md#verifyContent) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/verify/content | Verify content
*ProofOfExistenceApi* | [**verifyStream**](docs/ProofOfExistenceApi.md#verifyStream) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/verify/stream | Verify content using a bytestream/file
*SettingsApi* | [**settings**](docs/SettingsApi.md#settings) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/settings | Get the settings for registration/verification


## Documentation for Models

 - [CommittedChain](docs/CommittedChain.md)
 - [ContentRequest](docs/ContentRequest.md)
 - [CreateChainRequest](docs/CreateChainRequest.md)
 - [CreateChainResponse](docs/CreateChainResponse.md)
 - [Link](docs/Link.md)
 - [RegisterContentResponse](docs/RegisterContentResponse.md)
 - [Settings](docs/Settings.md)
 - [SettingsResponse](docs/SettingsResponse.md)
 - [StoredSettings](docs/StoredSettings.md)
 - [VerifyContentResponse](docs/VerifyContentResponse.md)
 - [VndError](docs/VndError.md)
 - [VndErrors](docs/VndErrors.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@sphereon.com

