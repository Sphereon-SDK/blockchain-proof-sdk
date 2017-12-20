# Sphereon.SDK.Blockchain.Proof.Model.ChainSettings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SingleProofChain** | **string** | The proof chain id linked to the current configuration. This is a shared proof chain for all registrations | [optional] 
**ContentRegistrationChainTypes** | **List&lt;string&gt;** | A set of content registration targets | [optional] 
**MetadataRegistrationChains** | **List&lt;string&gt;** | A set of metadata registration targets (not in use currently) | [optional] 
**Secret** | **byte[]** | A secret that is used as a seed during hashing | 
**Version** | **int?** | The settings version (only 1 for now) | 
**HashAlgorithm** | **string** | The hashing method used for the content. We always return and expect the convertInputToHashWhenNeeded in HEX form | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

