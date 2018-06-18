# RegisterContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context_name** | **string** |  | 
**single_proof_chain** | [**\Sphereon\SDK\Blockchain\Proof\Model\CommittedEntry**](CommittedEntry.md) | This is the single proof chain where all hashes are stored (if configured) | [optional] 
**content_registration_chain_types** | **string[]** | A set of content registration targets | [optional] 
**request_id** | **string** |  | [optional] 
**signature_type** | **string** | The signature type from the request or the default from the settings | 
**per_hash_proof_chain** | [**\Sphereon\SDK\Blockchain\Proof\Model\CommittedEntry**](CommittedEntry.md) | This is the proof chain specific for the current hash (if configured) | [optional] 
**base64_signature** | **string** | The calculated signature in base64 form | 
**hash** | **string** | The hash in base64 format that you supplied or that was calculated. This is the actual hash for the content | 
**hex_signature** | **string** | The calculated signature in hex form | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


