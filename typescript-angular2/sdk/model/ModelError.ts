/**
 * Blockchain Proof
 * With the Blockchain Proof API it is easy to prove or disprove existence of data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not    Full API Documentation: https://docs.sphereon.com/api/blockchain-proof/0.10/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.10
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


/**
 * An error
 */
export interface ModelError {
    code: string;
    level: ModelError.LevelEnum;
    cause?: Error;
    message: string;
}
export namespace ModelError {
    export type LevelEnum = 'INFO' | 'WARNING' | 'FATAL';
    export const LevelEnum = {
        INFO: 'INFO' as LevelEnum,
        WARNING: 'WARNING' as LevelEnum,
        FATAL: 'FATAL' as LevelEnum
    }
}
