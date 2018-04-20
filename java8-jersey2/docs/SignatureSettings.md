
# SignatureSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base64Secret** | **String** | An alternate base64Secret key that overrides the value in your configuration in base64. Used for generating a signature with a base64Secret |  [optional]
**keyConfig** | **String** | Crypto keys config name when KEY_NAME_ONLY is supplied for key qualification |  [optional]
**suppliedSignature** | **String** | Only use this if you calculate your own signature. Otherwise always leave this blank! We will use the signature as is for registration/verification |  [optional]
**signatureType** | [**SignatureTypeEnum**](#SignatureTypeEnum) | How to calculate the signature during registration and verification. Defaults to the configured value if omitted | 
**keyId** | **String** | Use a symmetric or asymmetric key from the crypto keys API to generate the signature. |  [optional]
**keyQualification** | [**KeyQualificationEnum**](#KeyQualificationEnum) | This determines whether yoy use fully qualified keyIds of the crypto-keys API in form (config/keys/keyname/version) or that you only use the keyname and provide the configuration here. The later means we will use the latest version by default |  [optional]


<a name="SignatureTypeEnum"></a>
## Enum: SignatureTypeEnum
Name | Value
---- | -----
KEY_ID | &quot;KEY_ID&quot;
SUPPLIED | &quot;SUPPLIED&quot;
SECRET | &quot;SECRET&quot;
NONE | &quot;NONE&quot;


<a name="KeyQualificationEnum"></a>
## Enum: KeyQualificationEnum
Name | Value
---- | -----
KEY_NAME_ONLY | &quot;KEY_NAME_ONLY&quot;
FULLY_QUALIFIED_KEY_ID | &quot;FULLY_QUALIFIED_KEY_ID&quot;



