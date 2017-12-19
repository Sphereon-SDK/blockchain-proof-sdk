# Sphereon.SDK.Blockchain.Proof.Model.ChainSettings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SignatureHash** | **byte[]** |  | 
**SingleProofChain** | **string** | The proof chain id linked to the current configuration. This is a shared proof chain for all registrations | [optional] 
**ContentRegistrationChains** | **List&lt;string&gt;** | A set of content registration targets | [optional] 
**MetadataRegistrationChains** | **List&lt;string&gt;** | A set of metadata registration targets (not in use currently) | [optional] 
**Version** | **int?** | The settings version (only 1 for now) | 
**HashAlgorithm** | **string** | The hashing method used for the content. We always return and expect the hash in HEX form | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

