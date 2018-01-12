# Sphereon.SDK.Blockchain.Proof.Model.RegisterContentResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContextName** | **string** |  | 
**SingleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) | [optional] 
**Signature** | **string** |  | [optional] 
**ContentRegistrationChainTypes** | **List&lt;string&gt;** | A set of content registration targets | [optional] 
**RequestId** | **string** |  | [optional] 
**PerHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) | [optional] 
**Hash** | **string** | The hash in HEX format that you supplied or that was calculated. This is the actual hash for the content | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

