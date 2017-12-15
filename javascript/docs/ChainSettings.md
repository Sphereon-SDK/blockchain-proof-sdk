# BlockchainProof.ChainSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**signatureHash** | **Blob** |  | 
**contentRegistrationChains** | **[String]** | A set of content registration targets | [optional] 
**proofChainId** | **String** | The proof chain id linked to the current configuration | [optional] 
**metadataRegistrationChains** | **[String]** | A set of metadata registration targets | [optional] 
**version** | **Number** | The settings version (only 1 for now) | 
**hashAlgorithm** | **String** | The hashing method used for the content | [optional] 


<a name="[ContentRegistrationChainsEnum]"></a>
## Enum: [ContentRegistrationChainsEnum]


* `FILE_CHAIN` (value: `"FILE_CHAIN"`)

* `PROOF_CHAIN` (value: `"PROOF_CHAIN"`)




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




