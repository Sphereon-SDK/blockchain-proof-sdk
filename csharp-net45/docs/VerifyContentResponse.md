# Sphereon.SDK.Blockchain.Proof.Model.VerifyContentResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RegistrationTime** | **DateTime?** | This is the first registration time from the singleProofChain or the perHashProofChain | [optional] 
**ContextName** | **string** |  | 
**SingleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored in a single chain (if configured) | [optional] 
**Signature** | **string** |  | [optional] 
**ContentRegistrationChainTypes** | **List&lt;string&gt;** | A set of content registration targets | 
**RequestId** | **string** |  | [optional] 
**PerHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash, so a chain per hash (if configured) | [optional] 
**RegistrationState** | **string** | This is the registration state from the singleProofChain or the perHashProofChain. If one of the chains has a registration this will return REGISTERED | [optional] 
**SignatureState** | **string** | This is the signature state. | [optional] 
**Hash** | **string** | The hash in HEX format that you supplied or that was calculated. This is the actual hash for the content | [optional] 
**SignatureStateMessage** | **string** | This is a message describing the signature state. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

