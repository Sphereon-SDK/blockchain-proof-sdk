# BlockchainProof.ContentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hashProvider** | **String** | When CLIENT is supplied the content should already have been hashed by you. When SERVER is supplied we will hash the content. Please note that we do not validate the hash when you supply it | 
**requestId** | **String** | An id that will be returned in the response. | [optional] 
**secret** | **Blob** | An alternate secret key that overrides the value in your configuration. | [optional] 
**content** | **Blob** | The content to register. | 


<a name="HashProviderEnum"></a>
## Enum: HashProviderEnum


* `SERVER` (value: `"SERVER"`)

* `CLIENT` (value: `"CLIENT"`)




