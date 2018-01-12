
# RegisterContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) |  [optional]
**signature** | **String** |  |  [optional]
**contentRegistrationChainTypes** | [**List&lt;ContentRegistrationChainTypesEnum&gt;**](#List&lt;ContentRegistrationChainTypesEnum&gt;) | A set of content registration targets |  [optional]
**requestId** | **String** |  |  [optional]
**perHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) |  [optional]
**hash** | **String** | The hash in HEX format that you supplied or that was calculated. This is the actual hash for the content |  [optional]


<a name="List<ContentRegistrationChainTypesEnum>"></a>
## Enum: List&lt;ContentRegistrationChainTypesEnum&gt;
Name | Value
---- | -----
PER_HASH_PROOF_CHAIN | &quot;PER_HASH_PROOF_CHAIN&quot;
SINGLE_PROOF_CHAIN | &quot;SINGLE_PROOF_CHAIN&quot;



