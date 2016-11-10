# BlockchainProof.ContentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settings** | [**Settings**](Settings.md) |  | [optional] 
**hashProvider** | **String** | When CLIENT is supplied the content should already have been hashed by you. When SERVER is supplied we will hash the content according to the supplied settings | 
**content** | **String** | The content to register. | 


<a name="HashProviderEnum"></a>
## Enum: HashProviderEnum


* `SERVER` (value: `"SERVER"`)

* `CLIENT` (value: `"CLIENT"`)




