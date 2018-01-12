# Sphereon.SDK.Blockchain.Proof.Model.ContentRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HashProvider** | **string** | When CLIENT is supplied the content should already have been hashed by you. When SERVER is supplied we will hash the content. Please note that we do not validate the hash when you supply it | 
**RequestId** | **string** | An id that will be returned in the response. | [optional] 
**Secret** | **byte[]** | An alternate secret key that overrides the value in your configuration. | [optional] 
**Content** | **byte[]** | The content to register. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

