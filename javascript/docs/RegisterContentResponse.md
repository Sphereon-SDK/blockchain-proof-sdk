# BlockchainProof.RegisterContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) | [optional] 
**contentRegistrationChainTypes** | **[String]** | A set of content registration targets | [optional] 
**requestId** | **String** |  | [optional] 
**signatureType** | **String** | The signature type from the request or the default from the settings | 
**perHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) | [optional] 
**base64Signature** | **Blob** | The calculated signature in base64 form | 
**hash** | **Blob** | The hash in base64 format that you supplied or that was calculated. This is the actual hash for the content | 
**hexSignature** | **String** | The calculated signature in hex form | 


<a name="[ContentRegistrationChainTypesEnum]"></a>
## Enum: [ContentRegistrationChainTypesEnum]


* `PER_HASH_PROOF_CHAIN` (value: `"PER_HASH_PROOF_CHAIN"`)

* `SINGLE_PROOF_CHAIN` (value: `"SINGLE_PROOF_CHAIN"`)




<a name="SignatureTypeEnum"></a>
## Enum: SignatureTypeEnum


* `KEY_ID` (value: `"KEY_ID"`)

* `SUPPLIED` (value: `"SUPPLIED"`)

* `SECRET` (value: `"SECRET"`)

* `NONE` (value: `"NONE"`)




