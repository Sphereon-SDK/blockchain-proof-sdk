
# ContentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hashProvider** | [**HashProviderEnum**](#HashProviderEnum) | When CLIENT is supplied the content should already have been hashed by you. When SERVER is supplied we will hash the content. Please note that we do not validate the hash when you supply it | 
**content** | **byte[]** | The content to register in base64. | 


<a name="HashProviderEnum"></a>
## Enum: HashProviderEnum
Name | Value
---- | -----
SERVER | &quot;SERVER&quot;
CLIENT | &quot;CLIENT&quot;



