
# ChainSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**singleProofChain** | **String** | The proof chain Id linked to the current configuration. This is a shared proof chain for all registrations/hashes. Only when the single proof chain type has been configured. |  [optional]
**contentRegistrationChainTypes** | [**List&lt;ContentRegistrationChainTypesEnum&gt;**](#List&lt;ContentRegistrationChainTypesEnum&gt;) | A set of content registration chain types. This can be a single proof chain for all hashes, a more powerful chain per hash, or both | 
**signatureSettings** | [**SignatureSettings**](SignatureSettings.md) | Settings that determine how the signature should be registered/verified | 
**version** | [**VersionEnum**](#VersionEnum) | The settings version (only 1 for now) | 
**hashAlgorithm** | [**HashAlgorithmEnum**](#HashAlgorithmEnum) | The hashing method used for the content. We always return and expect the hash in base64 form |  [optional]


<a name="List<ContentRegistrationChainTypesEnum>"></a>
## Enum: List&lt;ContentRegistrationChainTypesEnum&gt;
Name | Value
---- | -----
PER_HASH_PROOF_CHAIN | &quot;PER_HASH_PROOF_CHAIN&quot;
SINGLE_PROOF_CHAIN | &quot;SINGLE_PROOF_CHAIN&quot;


<a name="VersionEnum"></a>
## Enum: VersionEnum
Name | Value
---- | -----
NUMBER_1 | 1


<a name="HashAlgorithmEnum"></a>
## Enum: HashAlgorithmEnum
Name | Value
---- | -----
_256 | &quot;SHA_256&quot;
_512 | &quot;SHA_512&quot;



