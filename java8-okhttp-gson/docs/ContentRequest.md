
# ContentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** | Optional fileName. Used when content extraction is enabled and SERVER hashing is being used. This allows better content extraction of binary file formats like Office files. Do not use when using CLIENT as hashProvider |  [optional]
**hashProvider** | [**HashProviderEnum**](#HashProviderEnum) | When CLIENT is supplied the content should already have been hashed by you. When SERVER is supplied we will hash the content. Please note that we do not validate the hash when you supply it | 
**signatureSettings** | [**SignatureSettings**](SignatureSettings.md) | Optional signature settings like signature type |  [optional]
**content** | **byte[]** | The content to register in base64. | 


<a name="HashProviderEnum"></a>
## Enum: HashProviderEnum
Name | Value
---- | -----
SERVER | &quot;SERVER&quot;
CLIENT | &quot;CLIENT&quot;



