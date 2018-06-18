# VerifyContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registration_time** | [**\DateTime**](\DateTime.md) | This is the first registration time from the singleProofChain or the perHashProofChain | [optional] 
**context_name** | **string** |  | 
**single_proof_chain** | [**\Sphereon\SDK\Blockchain\Proof\Model\CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored in a single chain (if configured) | [optional] 
**content_registration_chain_types** | **string[]** | A set of content registration targets | 
**signature_type** | **string** | The signature type from the request or the default from the settings | 
**per_hash_proof_chain** | [**\Sphereon\SDK\Blockchain\Proof\Model\CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash, so a chain per hash (if configured) | [optional] 
**request_id** | **string** |  | [optional] 
**base64_signature** | **string** | The calculated signature in base64 form | 
**registration_state** | **string** | This is the registration state from the singleProofChain or the perHashProofChain. If one of the chains has a registration this will return REGISTERED | [optional] 
**signature_state** | **string** | This is the signature state. | [optional] 
**hash** | **string** | The hash in base64 format that you supplied or that was calculated. This is the actual hash for the content | 
**signature_state_message** | **string** | This is a message describing the signature state. | [optional] 
**hex_signature** | **string** | The calculated signature in hex form | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


