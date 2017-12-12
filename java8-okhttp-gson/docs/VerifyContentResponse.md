
# VerifyContentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registrationTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**contextName** | **String** |  | 
**requestId** | **String** |  |  [optional]
**contentId** | **String** |  | 
**proofChain** | [**CommittedChain**](CommittedChain.md) |  | 
**registrationState** | [**RegistrationStateEnum**](#RegistrationStateEnum) |  | 
**fileChain** | [**CommittedChain**](CommittedChain.md) |  | 


<a name="RegistrationStateEnum"></a>
## Enum: RegistrationStateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
REGISTERED | &quot;REGISTERED&quot;
NOT_REGISTERED | &quot;NOT_REGISTERED&quot;



