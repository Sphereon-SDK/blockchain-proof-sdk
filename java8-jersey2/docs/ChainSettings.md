
# ChainSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**signatureHash** | **byte[]** |  | 
**singleProofChain** | **String** | The proof chain id linked to the current configuration. This is a shared proof chain for all registrations |  [optional]
**contentRegistrationChains** | [**List&lt;ContentRegistrationChainsEnum&gt;**](#List&lt;ContentRegistrationChainsEnum&gt;) | A set of content registration targets |  [optional]
**metadataRegistrationChains** | [**List&lt;MetadataRegistrationChainsEnum&gt;**](#List&lt;MetadataRegistrationChainsEnum&gt;) | A set of metadata registration targets (not in use currently) |  [optional]
**version** | [**VersionEnum**](#VersionEnum) | The settings version (only 1 for now) | 
**hashAlgorithm** | [**HashAlgorithmEnum**](#HashAlgorithmEnum) | The hashing method used for the content. We always return and expect the hash in HEX form |  [optional]


<a name="List<ContentRegistrationChainsEnum>"></a>
## Enum: List&lt;ContentRegistrationChainsEnum&gt;
Name | Value
---- | -----
PER_HASH_PROOF_CHAIN | &quot;PER_HASH_PROOF_CHAIN&quot;
SINGLE_PROOF_CHAIN | &quot;SINGLE_PROOF_CHAIN&quot;


<a name="List<MetadataRegistrationChainsEnum>"></a>
## Enum: List&lt;MetadataRegistrationChainsEnum&gt;
Name | Value
---- | -----
FILE_CHAIN | &quot;FILE_CHAIN&quot;
PROOF_CHAIN | &quot;PROOF_CHAIN&quot;
METADATA_CHAIN | &quot;METADATA_CHAIN&quot;


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



