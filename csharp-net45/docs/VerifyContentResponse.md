# Sphereon.SDK.Blockchain.Proof.Model.VerifyContentResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RegistrationTime** | **DateTime?** | This is the first registration time from the singleProofChain or the perHashProofChain | [optional] 
**ContextName** | **string** |  | 
**SingleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) | [optional] 
**ContentRegistrationChainTypes** | **List&lt;string&gt;** | A set of content registration targets | [optional] 
**RequestId** | **string** |  | [optional] 
**PerHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) | [optional] 
**RegistrationState** | **string** | This is the registration state from the singleProofChain or the perHashProofChain. If one of the chains has a registration this will return REGISTERED | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

