# BlockchainProof.VerifyContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registrationTime** | **Date** | This is the first registration time from the singleProofChain or the perHashProofChain | [optional] 
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) | [optional] 
**contentRegistrationChainTypes** | **[String]** | A set of content registration targets | [optional] 
**requestId** | **String** |  | [optional] 
**perHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) | [optional] 
**registrationState** | **String** | This is the registration state from the singleProofChain or the perHashProofChain. If one of the chains has a registration this will return REGISTERED | [optional] 


<a name="[ContentRegistrationChainTypesEnum]"></a>
## Enum: [ContentRegistrationChainTypesEnum]


* `PER_HASH_PROOF_CHAIN` (value: `"PER_HASH_PROOF_CHAIN"`)

* `SINGLE_PROOF_CHAIN` (value: `"SINGLE_PROOF_CHAIN"`)




<a name="RegistrationStateEnum"></a>
## Enum: RegistrationStateEnum


* `NOT_REGISTERED` (value: `"NOT_REGISTERED"`)

* `PENDING` (value: `"PENDING"`)

* `REGISTERED` (value: `"REGISTERED"`)




