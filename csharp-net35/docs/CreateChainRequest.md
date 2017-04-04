# Sphereon.SDK.Blockchain.Proof.Model.CreateChainRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metadata** | **byte[]** | Metadata for this chain. | [optional] 
**SettingsChainId** | **string** | Supply an existing settings chain. When not supplied a new settings chain will be created automatically. | [optional] 
**Name** | **string** | Unique name for this chain. | 
**PreviousChainId** | **string** | When this chain is a continuation of another chain you need to supply the previous chainId here. | [optional] 
**DefaultSettings** | [**Settings**](Settings.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

