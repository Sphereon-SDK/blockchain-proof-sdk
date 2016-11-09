
# Settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeContentSize** | **Boolean** | Include the content size in the hash calculation. | 
**version** | **byte[]** | The settings version (only 1 for now) | 
**hashAlgorithm** | [**HashAlgorithmEnum**](#HashAlgorithmEnum) | The hashing method used (CLIENT) or to use (SERVER) for the content |  [optional]


<a name="HashAlgorithmEnum"></a>
## Enum: HashAlgorithmEnum
Name | Value
---- | -----
PLAIN | &quot;PLAIN&quot;
SHA_256 | &quot;SHA_256&quot;
SHA_512 | &quot;SHA_512&quot;



