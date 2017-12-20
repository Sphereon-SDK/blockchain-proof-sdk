
# VerifyContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registrationTime** | [**OffsetDateTime**](OffsetDateTime.md) | This is the first registration time from the singleProofChain or the perHashProofChain |  [optional]
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) |  [optional]
**contentRegistrationChainTypes** | [**List&lt;ContentRegistrationChainTypesEnum&gt;**](#List&lt;ContentRegistrationChainTypesEnum&gt;) | A set of content registration targets |  [optional]
**requestId** | **String** |  |  [optional]
**perHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) |  [optional]
**registrationState** | [**RegistrationStateEnum**](#RegistrationStateEnum) | This is the registration state from the singleProofChain or the perHashProofChain. If one of the chains has a registration this will return REGISTERED |  [optional]


<a name="List<ContentRegistrationChainTypesEnum>"></a>
## Enum: List&lt;ContentRegistrationChainTypesEnum&gt;
Name | Value
---- | -----
PER_HASH_PROOF_CHAIN | &quot;PER_HASH_PROOF_CHAIN&quot;
SINGLE_PROOF_CHAIN | &quot;SINGLE_PROOF_CHAIN&quot;


<a name="RegistrationStateEnum"></a>
## Enum: RegistrationStateEnum
Name | Value
---- | -----
NOT_REGISTERED | &quot;NOT_REGISTERED&quot;
PENDING | &quot;PENDING&quot;
REGISTERED | &quot;REGISTERED&quot;



