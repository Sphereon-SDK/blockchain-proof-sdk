
# RegisterContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextName** | **String** |  | 
**singleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) |  [optional]
**contentRegistrationChainTypes** | [**List&lt;ContentRegistrationChainTypesEnum&gt;**](#List&lt;ContentRegistrationChainTypesEnum&gt;) | A set of content registration targets |  [optional]
**requestId** | **String** |  |  [optional]
**signatureType** | [**SignatureTypeEnum**](#SignatureTypeEnum) | The signature type from the request or the default from the settings | 
**perHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) |  [optional]
**base64Signature** | **String** | The calculated signature in base64 form | 
**hash** | **String** | The hash in base64 format that you supplied or that was calculated. This is the actual hash for the content | 
**hexSignature** | **String** | The calculated signature in hex form | 


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
KEY_ID | &quot;KEY_ID&quot;
SUPPLIED | &quot;SUPPLIED&quot;
SECRET | &quot;SECRET&quot;
NONE | &quot;NONE&quot;



