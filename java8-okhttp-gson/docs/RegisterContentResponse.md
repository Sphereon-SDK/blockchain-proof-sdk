
# RegisterContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedChain**](CommittedChain.md) | This is the single proof chain where all hashes are stored (if configured) |  [optional]
**requestId** | **String** |  |  [optional]
**perHashProofChain** | [**CommittedChain**](CommittedChain.md) | This is the proof chain specific for the current hash (if configured) |  [optional]
**registrationState** | [**RegistrationStateEnum**](#RegistrationStateEnum) |  | 


<a name="RegistrationStateEnum"></a>
## Enum: RegistrationStateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
REGISTERED | &quot;REGISTERED&quot;
NOT_REGISTERED | &quot;NOT_REGISTERED&quot;



