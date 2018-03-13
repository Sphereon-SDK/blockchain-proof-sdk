# BlockchainProof.VerifyContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registrationTime** | **Date** | This is the first registration time from the singleProofChain or the perHashProofChain | [optional] 
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored in a single chain (if configured) | [optional] 
**contentRegistrationChainTypes** | **[String]** | A set of content registration targets | 
**signatureType** | **String** | The signature type from the request or the default from the settings | 
**perHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash, so a chain per hash (if configured) | [optional] 
**requestId** | **String** |  | [optional] 
**base64Signature** | **Blob** | The calculated signature in base64 form | 
**registrationState** | **String** | This is the registration state from the singleProofChain or the perHashProofChain. If one of the chains has a registration this will return REGISTERED | [optional] 
**signatureState** | **String** | This is the signature state. | [optional] 
**hash** | **Blob** | The hash in base64 format that you supplied or that was calculated. This is the actual hash for the content | 
**signatureStateMessage** | **String** | This is a message describing the signature state. | [optional] 
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




<a name="RegistrationStateEnum"></a>
## Enum: RegistrationStateEnum


* `NOT_REGISTERED` (value: `"NOT_REGISTERED"`)

* `PENDING` (value: `"PENDING"`)

* `REGISTERED` (value: `"REGISTERED"`)




<a name="SignatureStateEnum"></a>
## Enum: SignatureStateEnum


* `not found` (value: `"not found"`)

* `unsigned` (value: `"unsigned"`)

* `invalid` (value: `"invalid"`)

* `verified` (value: `"verified"`)




