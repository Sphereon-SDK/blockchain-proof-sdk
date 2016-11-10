# BlockchainProof.CreateChainRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | **String** | Metadata for this chain. | [optional] 
**settingsChainId** | **String** | Supply an existing settings chain. When not supplied a new settings chain will be created automatically. | [optional] 
**name** | **String** | Unique name for this chain. | 
**previousChainId** | **String** | When this chain is a continuation of another chain you need to supply the previous chainId here. | [optional] 
**defaultSettings** | [**Settings**](Settings.md) |  | 


