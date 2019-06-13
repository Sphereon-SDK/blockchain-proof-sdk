# BlockchainProof.ContentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hashProvider** | **String** | When CLIENT is supplied the content should already have been hashed by you. When SERVER is supplied we will hash the content. Please note that we do not validate the hash when you supply it | 
**signatureSettings** | [**SignatureSettings**](SignatureSettings.md) | Optional signature settings like signature type | [optional] 
**content** | **Blob** | The content to register in base64. | 


<a name="HashProviderEnum"></a>
## Enum: HashProviderEnum


* `SERVER` (value: `"SERVER"`)

* `CLIENT` (value: `"CLIENT"`)




