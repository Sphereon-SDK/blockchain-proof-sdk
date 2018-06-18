<?php
/**
 * VerifyContentResponseTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Sphereon\SDK\Blockchain\Proof
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Blockchain Proof
 *
 * With the Blockchain Proof API it is easy to prove or disprove existence of data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not    Full API Documentation: https://docs.sphereon.com/api/blockchain-proof/0.10/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.10
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.3.1
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Please update the test case below to test the model.
 */

namespace Sphereon\SDK\Blockchain\Proof;

/**
 * VerifyContentResponseTest Class Doc Comment
 *
 * @category    Class */
// * @description Verify Content response
/**
 * @package     Sphereon\SDK\Blockchain\Proof
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class VerifyContentResponseTest extends \PHPUnit_Framework_TestCase
{

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test "VerifyContentResponse"
     */
    public function testVerifyContentResponse()
    {
    }

    /**
     * Test attribute "registration_time"
     */
    public function testPropertyRegistrationTime()
    {
    }

    /**
     * Test attribute "context_name"
     */
    public function testPropertyContextName()
    {
    }

    /**
     * Test attribute "single_proof_chain"
     */
    public function testPropertySingleProofChain()
    {
    }

    /**
     * Test attribute "content_registration_chain_types"
     */
    public function testPropertyContentRegistrationChainTypes()
    {
    }

    /**
     * Test attribute "signature_type"
     */
    public function testPropertySignatureType()
    {
    }

    /**
     * Test attribute "per_hash_proof_chain"
     */
    public function testPropertyPerHashProofChain()
    {
    }

    /**
     * Test attribute "request_id"
     */
    public function testPropertyRequestId()
    {
    }

    /**
     * Test attribute "base64_signature"
     */
    public function testPropertyBase64Signature()
    {
    }

    /**
     * Test attribute "registration_state"
     */
    public function testPropertyRegistrationState()
    {
    }

    /**
     * Test attribute "signature_state"
     */
    public function testPropertySignatureState()
    {
    }

    /**
     * Test attribute "hash"
     */
    public function testPropertyHash()
    {
    }

    /**
     * Test attribute "signature_state_message"
     */
    public function testPropertySignatureStateMessage()
    {
    }

    /**
     * Test attribute "hex_signature"
     */
    public function testPropertyHexSignature()
    {
    }
}
