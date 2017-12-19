# BlockchainProof.RegisterContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedChain**](CommittedChain.md) | This is the single proof chain where all hashes are stored (if configured) | [optional] 
**requestId** | **String** |  | [optional] 
**perHashProofChain** | [**CommittedChain**](CommittedChain.md) | This is the proof chain specific for the current hash (if configured) | [optional] 
**registrationState** | **String** |  | 


<a name="RegistrationStateEnum"></a>
## Enum: RegistrationStateEnum


* `PENDING` (value: `"PENDING"`)

* `REGISTERED` (value: `"REGISTERED"`)

* `NOT_REGISTERED` (value: `"NOT_REGISTERED"`)




