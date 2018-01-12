
# CommittedEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registrationTime** | [**OffsetDateTime**](OffsetDateTime.md) | The registration time of the entry. Only when registration has occurred ofcourse |  [optional]
**chainId** | **String** | Chain Id |  [optional]
**context** | **String** | The context |  [optional]
**registrationState** | [**RegistrationStateEnum**](#RegistrationStateEnum) | The registration state of the entry | 
**signatureState** | [**SignatureStateEnum**](#SignatureStateEnum) | This is the signature state. |  [optional]
**signatureStateMessage** | **String** | This is a message describing the signature state. |  [optional]
**entryId** | **String** | The entry Id for the registration | 


<a name="RegistrationStateEnum"></a>
## Enum: RegistrationStateEnum
Name | Value
---- | -----
NOT_REGISTERED | &quot;NOT_REGISTERED&quot;
PENDING | &quot;PENDING&quot;
REGISTERED | &quot;REGISTERED&quot;


<a name="SignatureStateEnum"></a>
## Enum: SignatureStateEnum
Name | Value
---- | -----
NOT_FOUND | &quot;not found&quot;
UNSIGNED | &quot;unsigned&quot;
INVALID | &quot;invalid&quot;
VERIFIED | &quot;verified&quot;



