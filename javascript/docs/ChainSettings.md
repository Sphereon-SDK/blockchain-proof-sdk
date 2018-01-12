# BlockchainProof.ChainSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**singleProofChain** | **String** | The proof chain Id linked to the current configuration. This is a shared proof chain for all registrations/hashes. Only when the single proof chain type has been configured. | [optional] 
**contentRegistrationChainTypes** | **[String]** | A set of content registration chain types. This can be a single proof chain for all hashes, a more powerful chain per hash, or both | 
**signatureType** | **String** | The signature type to use for every registration/validation. Important: Do not change, this concept is important to make sure the registration/validation if being done by your organization. AUTO: We create a signature based on your configuration. SECRET: We use the secret you provided. NONE: No signature is being used. A signature is useful the prove you are the owner of the entry. The signature is created from your configuration or secret by concatenating it with the hash and creating a new hash (SHA256) and storing that value in the content of the entry. For the single proof chain case, this means that the secret influences the entry Id resulting in validation errors. For the chain per hash case the chain Id will remain the same, sou you could still look it up. The first entry Id will change however. You could check validity yourself using this information. | [optional] 
**secret** | **Blob** | A secret that is used as a seed during hashing when the signatureType is set to SECRET. Please note that this value us being used to sign the content. Changing this value currently invalidates previous registration/validations. So do not change without contacting us for solutions! | [optional] 
**version** | **Number** | The settings version (only 1 for now) | 
**hashAlgorithm** | **String** | The hashing method used for the content. We always return and expect the hash in HEX form | [optional] 


<a name="[ContentRegistrationChainTypesEnum]"></a>
## Enum: [ContentRegistrationChainTypesEnum]


* `PER_HASH_PROOF_CHAIN` (value: `"PER_HASH_PROOF_CHAIN"`)

* `SINGLE_PROOF_CHAIN` (value: `"SINGLE_PROOF_CHAIN"`)




<a name="SignatureTypeEnum"></a>
## Enum: SignatureTypeEnum


* `AUTO` (value: `"AUTO"`)

* `SECRET` (value: `"SECRET"`)

* `NONE` (value: `"NONE"`)




<a name="VersionEnum"></a>
## Enum: VersionEnum


* `1` (value: `1`)




<a name="HashAlgorithmEnum"></a>
## Enum: HashAlgorithmEnum


* `256` (value: `"SHA_256"`)

* `512` (value: `"SHA_512"`)




