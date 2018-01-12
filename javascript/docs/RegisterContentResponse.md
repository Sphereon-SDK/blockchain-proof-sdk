# BlockchainProof.RegisterContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) | [optional] 
**signature** | **String** |  | [optional] 
**contentRegistrationChainTypes** | **[String]** | A set of content registration targets | [optional] 
**requestId** | **String** |  | [optional] 
**perHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) | [optional] 
**hash** | **String** | The hash in HEX format that you supplied or that was calculated. This is the actual hash for the content | [optional] 


<a name="[ContentRegistrationChainTypesEnum]"></a>
## Enum: [ContentRegistrationChainTypesEnum]


* `PER_HASH_PROOF_CHAIN` (value: `"PER_HASH_PROOF_CHAIN"`)

* `SINGLE_PROOF_CHAIN` (value: `"SINGLE_PROOF_CHAIN"`)




