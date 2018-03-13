# BlockchainProof.SignatureSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base64Secret** | **Blob** | An alternate base64Secret key that overrides the value in your configuration in base64. Used for generating a signature with a base64Secret | [optional] 
**suppliedSignature** | **Blob** | Only use this if you calculate your own signature. Otherwise always leave this blank! We will use the signature as is for registration/verification | [optional] 
**signatureType** | **String** | How to calculate the signature during registration and verification. Defaults to the configured value if omitted | 
**keyId** | **String** | Use a symmetric or asymmetric key from the crypto keys API to generate the signature. | [optional] 


<a name="SignatureTypeEnum"></a>
## Enum: SignatureTypeEnum


* `KEY_ID` (value: `"KEY_ID"`)

* `SUPPLIED` (value: `"SUPPLIED"`)

* `SECRET` (value: `"SECRET"`)

* `NONE` (value: `"NONE"`)




