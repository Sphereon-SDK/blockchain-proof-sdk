# Sphereon.SDK.Blockchain.Proof.Model.ChainSettings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SingleProofChain** | **string** | The proof chain Id linked to the current configuration. This is a shared proof chain for all registrations/hashes. Only when the single proof chain type has been configured. | [optional] 
**ContentRegistrationChainTypes** | **List&lt;string&gt;** | A set of content registration chain types. This can be a single proof chain for all hashes, a more powerful chain per hash, or both | 
**SignatureSettings** | [**SignatureSettings**](SignatureSettings.md) | Settings that determine how the signature should be registered/verified | 
**Version** | **int?** | The settings version (only 1 for now) | 
**HashAlgorithm** | **string** | The hashing method used for the content. We always return and expect the hash in base64 form | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

