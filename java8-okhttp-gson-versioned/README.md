# blockchain-proof-sdk-java8-okhttp-gson-versioned

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
    <artifactId>blockchain-proof-sdk-java8-okhttp-gson-versioned</artifactId>
    <version>0.10.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sphereon.sdk:blockchain-proof-sdk-java8-okhttp-gson-versioned:0.10.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/blockchain-proof-sdk-java8-okhttp-gson-versioned-0.10.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sphereon.sdk.blockchain.proof.v0_10_0.handler.*;
import com.sphereon.sdk.blockchain.proof.v0_10_0.handler.auth.*;
import com.sphereon.sdk.blockchain.proof.v0_10_0.model.*;
import com.sphereon.sdk.blockchain.proof.v0_10_0.api.ConfigurationApi;

import java.io.File;
import java.util.*;

public class ConfigurationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2schema
        OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
        oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

        ConfigurationApi apiInstance = new ConfigurationApi();
        CreateConfigurationRequest request = new CreateConfigurationRequest(); // CreateConfigurationRequest | Create a new Proof of Existence configuration using the provided settings. The context points to a context of the Easy Blockchain API. When you have no own context, simply use 'multichain' without the quotes as context. You will be using our multichain ledger then, which is recomended during development/testing
        try {
            ConfigurationResponse result = apiInstance.createConfiguration(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationApi#createConfiguration");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gw.api.cloud.sphereon.com/blockchain/proof/0.10*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConfigurationApi* | [**createConfiguration**](docs/ConfigurationApi.md#createConfiguration) | **POST** /config | Create a new configuration
*ConfigurationApi* | [**getConfiguration**](docs/ConfigurationApi.md#getConfiguration) | **GET** /config/{configName} | Get configuration
*RegistrationApi* | [**registerUsingContent**](docs/RegistrationApi.md#registerUsingContent) | **PUT** /existence/{configName}/content | Register content
*RegistrationApi* | [**registerUsingLocation**](docs/RegistrationApi.md#registerUsingLocation) | **PUT** /existence/{configName}/streams/location | Register hash using the Storage API
*RegistrationApi* | [**registerUsingStream**](docs/RegistrationApi.md#registerUsingStream) | **PUT** /existence/{configName}/streams/multipart | Register bytestream/file hash
*VerificationApi* | [**verifyUsingContent**](docs/VerificationApi.md#verifyUsingContent) | **POST** /existence/{configName}/content | Verify content
*VerificationApi* | [**verifyUsingLocation**](docs/VerificationApi.md#verifyUsingLocation) | **POST** /existence/{configName}/streams/location | Verify hash using the Storage API
*VerificationApi* | [**verifyUsingStream**](docs/VerificationApi.md#verifyUsingStream) | **POST** /existence/{configName}/streams/multipart | Verify bytestream/file hash


## Documentation for Models

 - [ChainSettings](docs/ChainSettings.md)
 - [CommittedChain](docs/CommittedChain.md)
 - [CommittedEntry](docs/CommittedEntry.md)
 - [ConfigurationResponse](docs/ConfigurationResponse.md)
 - [ContentRequest](docs/ContentRequest.md)
 - [CreateConfigurationRequest](docs/CreateConfigurationRequest.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ModelConfiguration](docs/ModelConfiguration.md)
 - [RegisterContentResponse](docs/RegisterContentResponse.md)
 - [SignatureSettings](docs/SignatureSettings.md)
 - [StreamLocation](docs/StreamLocation.md)
 - [VerifyContentResponse](docs/VerifyContentResponse.md)


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

