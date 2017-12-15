# BlockchainProof.ContentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hashProvider** | **String** | When CLIENT is supplied the content should already have been hashed by you. When SERVER is supplied we will hash the content | 
**requestId** | **String** | An id that will be returned in the response. | [optional] 
**content** | **Blob** | The content to register. | 


<a name="HashProviderEnum"></a>
## Enum: HashProviderEnum


* `SERVER` (value: `"SERVER"`)

* `CLIENT` (value: `"CLIENT"`)




