
# VerifyContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registrationTime** | [**OffsetDateTime**](OffsetDateTime.md) | This is the first registration time from the singleProofChain or the perHashProofChain |  [optional]
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored in a single chain (if configured) |  [optional]
**signature** | **String** |  |  [optional]
**contentRegistrationChainTypes** | [**List&lt;ContentRegistrationChainTypesEnum&gt;**](#List&lt;ContentRegistrationChainTypesEnum&gt;) | A set of content registration targets | 
**requestId** | **String** |  |  [optional]
**perHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash, so a chain per hash (if configured) |  [optional]
**registrationState** | [**RegistrationStateEnum**](#RegistrationStateEnum) | This is the registration state from the singleProofChain or the perHashProofChain. If one of the chains has a registration this will return REGISTERED |  [optional]
**signatureState** | [**SignatureStateEnum**](#SignatureStateEnum) | This is the signature state. |  [optional]
**hash** | **String** | The hash in HEX format that you supplied or that was calculated. This is the actual hash for the content |  [optional]
**signatureStateMessage** | **String** | This is a message describing the signature state. |  [optional]


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


<a name="SignatureStateEnum"></a>
## Enum: SignatureStateEnum
Name | Value
---- | -----
NOT_FOUND | &quot;not found&quot;
UNSIGNED | &quot;unsigned&quot;
INVALID | &quot;invalid&quot;
VERIFIED | &quot;verified&quot;



