# BlockchainProof.CommittedEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registrationTime** | **Date** | The registration time of the entry. Only when registration has occurred ofcourse | [optional] 
**chainId** | **String** | Chain Id | [optional] 
**context** | **String** | The context | [optional] 
**registrationState** | **String** | The registration state of the entry | 
**signatureState** | **String** | This is the signature state. | [optional] 
**signatureStateMessage** | **String** | This is a message describing the signature state. | [optional] 
**entryId** | **String** | The entry Id for the registration | 


<a name="RegistrationStateEnum"></a>
## Enum: RegistrationStateEnum


* `NOT_REGISTERED` (value: `"NOT_REGISTERED"`)

* `PENDING` (value: `"PENDING"`)

* `REGISTERED` (value: `"REGISTERED"`)




<a name="SignatureStateEnum"></a>
## Enum: SignatureStateEnum


* `not found` (value: `"not found"`)

* `unsigned` (value: `"unsigned"`)

* `invalid` (value: `"invalid"`)

* `verified` (value: `"verified"`)




