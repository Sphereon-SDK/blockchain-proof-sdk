# Sphereon.SDK.Blockchain.Proof.Model.SignatureSettings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Base64Secret** | **byte[]** | An alternate base64Secret key that overrides the value in your configuration in base64. Used for generating a signature with a base64Secret | [optional] 
**SuppliedSignature** | **byte[]** | Only use this if you calculate your own signature. Otherwise always leave this blank! We will use the signature as is for registration/verification | [optional] 
**SignatureType** | **string** | How to calculate the signature during registration and verification. Defaults to the configured value if omitted | 
**KeyId** | **string** | Use a symmetric or asymmetric key from the crypto keys API to generate the signature. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

