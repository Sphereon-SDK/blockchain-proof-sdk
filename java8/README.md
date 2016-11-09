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
    <version>0.1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:blockchain-proof-sdk-java8:0.1.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/blockchain-proof-sdk-java8-0.1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.blockchain.proof.handler.*;
import com.sphereon.blockchain.proof.handler.auth.*;
import com.sphereon.blockchain.proof.handler.model.*;
import com.sphereon.blockchain.proof.api.ProofOfExistenceApi;

import java.io.File;
import java.util.*;

public class ProofOfExistenceApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2schema
        OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
        oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

        ProofOfExistenceApi apiInstance = new ProofOfExistenceApi();
        CreateChainRequest request = new CreateChainRequest(); // CreateChainRequest | Create a new Proof of Existence chain using the provided existence settings
        try {
            CreateChainResponse result = apiInstance.createChain(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProofOfExistenceApi#createChain");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProofOfExistenceApi* | [**createChain**](docs/ProofOfExistenceApi.md#createChain) | **POST** /blockchain/proof/0.1.0/existence | Create a new existence chain
*ProofOfExistenceApi* | [**registerContent**](docs/ProofOfExistenceApi.md#registerContent) | **POST** /blockchain/proof/0.1.0/existence/{chainId} | Register content
*ProofOfExistenceApi* | [**registerStream**](docs/ProofOfExistenceApi.md#registerStream) | **POST** /blockchain/proof/0.1.0/existence/{chainId}/stream | Register content using a bytestream/file
*ProofOfExistenceApi* | [**verifyContent**](docs/ProofOfExistenceApi.md#verifyContent) | **GET** /blockchain/proof/0.1.0/existence/{chainId} | Verify content
*ProofOfExistenceApi* | [**verifyContentByHash**](docs/ProofOfExistenceApi.md#verifyContentByHash) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/{hash} | Verify content by hash
*ProofOfExistenceApi* | [**verifyStream**](docs/ProofOfExistenceApi.md#verifyStream) | **GET** /blockchain/proof/0.1.0/existence/{chainId}/stream | Verify content using a bytestream/file


## Documentation for Models

 - [CommittedChain](docs/CommittedChain.md)
 - [ContentRequest](docs/ContentRequest.md)
 - [CreateChainRequest](docs/CreateChainRequest.md)
 - [CreateChainResponse](docs/CreateChainResponse.md)
 - [Link](docs/Link.md)
 - [RegisterContentResponse](docs/RegisterContentResponse.md)
 - [Settings](docs/Settings.md)
 - [VerifyContentResponse](docs/VerifyContentResponse.md)
 - [VndError](docs/VndError.md)
 - [VndErrors](docs/VndErrors.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - global: accessEverything


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

dev@sphereon.com

