# Sphereon.SDK.Blockchain.Proof.Model.RegisterContentResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContextName** | **string** |  | 
**SingleProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) | [optional] 
**ContentRegistrationChainTypes** | **List&lt;string&gt;** | A set of content registration targets | [optional] 
**RequestId** | **string** |  | [optional] 
**SignatureType** | **string** | The signature type from the request or the default from the settings | 
**PerHashProofChain** | [**CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) | [optional] 
**Base64Signature** | **string** | The calculated signature in base64 form | 
**Hash** | **string** | The hash in base64 format that you supplied or that was calculated. This is the actual hash for the content | 
**HexSignature** | **string** | The calculated signature in hex form | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

