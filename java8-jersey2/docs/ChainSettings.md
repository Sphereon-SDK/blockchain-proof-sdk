
# ChainSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**singleProofChain** | **String** | The proof chain Id linked to the current configuration. This is a shared proof chain for all registrations/hashes. Only when the single proof chain type has been configured. |  [optional]
**contentRegistrationChainTypes** | [**List&lt;ContentRegistrationChainTypesEnum&gt;**](#List&lt;ContentRegistrationChainTypesEnum&gt;) | A set of content registration chain types. This can be a single proof chain for all hashes, a more powerful chain per hash, or both | 
**signatureType** | [**SignatureTypeEnum**](#SignatureTypeEnum) | The signature type to use for every registration/validation. Important: Do not change, this concept is important to make sure the registration/validation if being done by your organization. AUTO: We create a signature based on your configuration. SECRET: We use the secret you provided. NONE: No signature is being used. A signature is useful the prove you are the owner of the entry. The signature is created from your configuration or secret by concatenating it with the hash and creating a new hash (SHA256) and storing that value in the content of the entry. For the single proof chain case, this means that the secret influences the entry Id resulting in validation errors. For the chain per hash case the chain Id will remain the same, sou you could still look it up. The first entry Id will change however. You could check validity yourself using this information. |  [optional]
**secret** | **byte[]** | A secret that is used as a seed during hashing when the signatureType is set to SECRET. Please note that this value us being used to sign the content. Changing this value currently invalidates previous registration/validations. So do not change without contacting us for solutions! |  [optional]
**version** | [**VersionEnum**](#VersionEnum) | The settings version (only 1 for now) | 
**hashAlgorithm** | [**HashAlgorithmEnum**](#HashAlgorithmEnum) | The hashing method used for the content. We always return and expect the hash in HEX form |  [optional]


<a name="List<ContentRegistrationChainTypesEnum>"></a>
## Enum: List&lt;ContentRegistrationChainTypesEnum&gt;
Name | Value
---- | -----
PER_HASH_PROOF_CHAIN | &quot;PER_HASH_PROOF_CHAIN&quot;
SINGLE_PROOF_CHAIN | &quot;SINGLE_PROOF_CHAIN&quot;


<a name="SignatureTypeEnum"></a>
## Enum: SignatureTypeEnum
Name | Value
---- | -----
AUTO | &quot;AUTO&quot;
SECRET | &quot;SECRET&quot;
NONE | &quot;NONE&quot;


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



