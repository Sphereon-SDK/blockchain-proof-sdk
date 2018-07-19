# BlockchainProof.SignatureSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base64Secret** | **String** | An alternate Secret key that overrides the value in your configuration in base64. Used for generating a signature with a base64Secret | [optional] 
**keyConfig** | **String** | Crypto keys config name when KEY_NAME_ONLY is supplied for key qualification | [optional] 
**suppliedSignature** | **String** | Only use this if you calculate your own signature. Otherwise always leave this blank! We will use the signature as is for registration/verification | [optional] 
**signatureType** | **String** | How to calculate the signature during registration and verification. Defaults to the configured value if omitted | 
**keyId** | **String** | Use a symmetric or asymmetric key from the crypto keys API to generate the signature. | [optional] 
**keyQualification** | **String** | This determines whether yoy use fully qualified keyIds of the crypto-keys API in form (config/keys/keyname/version) or that you only use the keyname and provide the configuration here. The later means we will use the latest version by default | [optional] 


<a name="SignatureTypeEnum"></a>
## Enum: SignatureTypeEnum


* `KEY_ID` (value: `"KEY_ID"`)

* `SUPPLIED` (value: `"SUPPLIED"`)

* `SECRET` (value: `"SECRET"`)

* `NONE` (value: `"NONE"`)




<a name="KeyQualificationEnum"></a>
## Enum: KeyQualificationEnum


* `KEY_NAME_ONLY` (value: `"KEY_NAME_ONLY"`)

* `FULLY_QUALIFIED_KEY_ID` (value: `"FULLY_QUALIFIED_KEY_ID"`)




