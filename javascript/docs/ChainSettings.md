# BlockchainProof.ChainSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**signatureHash** | **Blob** |  | 
**singleProofChain** | **String** | The proof chain id linked to the current configuration. This is a shared proof chain for all registrations | [optional] 
**contentRegistrationChains** | **[String]** | A set of content registration targets | [optional] 
**metadataRegistrationChains** | **[String]** | A set of metadata registration targets (not in use currently) | [optional] 
**version** | **Number** | The settings version (only 1 for now) | 
**hashAlgorithm** | **String** | The hashing method used for the content. We always return and expect the hash in HEX form | [optional] 


<a name="[ContentRegistrationChainsEnum]"></a>
## Enum: [ContentRegistrationChainsEnum]


* `PER_HASH_PROOF_CHAIN` (value: `"PER_HASH_PROOF_CHAIN"`)

* `SINGLE_PROOF_CHAIN` (value: `"SINGLE_PROOF_CHAIN"`)




<a name="[MetadataRegistrationChainsEnum]"></a>
## Enum: [MetadataRegistrationChainsEnum]


* `FILE_CHAIN` (value: `"FILE_CHAIN"`)

* `PROOF_CHAIN` (value: `"PROOF_CHAIN"`)

* `METADATA_CHAIN` (value: `"METADATA_CHAIN"`)




<a name="VersionEnum"></a>
## Enum: VersionEnum


* `1` (value: `1`)




<a name="HashAlgorithmEnum"></a>
## Enum: HashAlgorithmEnum


* `256` (value: `"SHA_256"`)

* `512` (value: `"SHA_512"`)




