
# CreateConfigurationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initialSettings** | [**ChainSettings**](ChainSettings.md) | The initial context settings. | 
**context** | **String** | The Easy Blockchain API context. This has to be a context you created or a public context | 
**name** | **String** | The configuration name. | 
**contentExtractionSettings** | [**ContentExtractionSettings**](ContentExtractionSettings.md) |  |  [optional]
**accessMode** | [**AccessModeEnum**](#AccessModeEnum) | The access mode for this configuration. Public means accessible to other tenants of the API as well. Currently public is only allowed for Sphereon itself | 


<a name="AccessModeEnum"></a>
## Enum: AccessModeEnum
Name | Value
---- | -----
PUBLIC | &quot;PUBLIC&quot;
PRIVATE | &quot;PRIVATE&quot;



