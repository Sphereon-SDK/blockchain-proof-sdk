# BlockchainProof.ChainSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**singleProofChain** | **String** | The proof chain Id linked to the current configuration. This is a shared proof chain for all registrations/hashes. Only when the single proof chain type has been configured. | [optional] 
**contentRegistrationChainTypes** | **[String]** | A set of content registration chain types. This can be a single proof chain for all hashes, a more powerful chain per hash, or both | 
**signatureSettings** | [**SignatureSettings**](SignatureSettings.md) | Settings that determine how the signature should be registered/verified | 
**version** | **Number** | The settings version (only 1 for now) | 
**hashAlgorithm** | **String** | The hashing method used for the content. We always return and expect the hash in base64 form | [optional] 


<a name="[ContentRegistrationChainTypesEnum]"></a>
## Enum: [ContentRegistrationChainTypesEnum]


* `PER_HASH_PROOF_CHAIN` (value: `"PER_HASH_PROOF_CHAIN"`)

* `SINGLE_PROOF_CHAIN` (value: `"SINGLE_PROOF_CHAIN"`)




<a name="VersionEnum"></a>
## Enum: VersionEnum


* `1` (value: `1`)




<a name="HashAlgorithmEnum"></a>
## Enum: HashAlgorithmEnum


* `256` (value: `"SHA_256"`)

* `512` (value: `"SHA_512"`)




