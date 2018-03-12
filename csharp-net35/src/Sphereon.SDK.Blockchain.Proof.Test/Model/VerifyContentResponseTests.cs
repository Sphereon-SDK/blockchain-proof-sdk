/* 
 * Blockchain Proof
 *
 * With the Blockchain Proof API it is easy to prove or disprove existence of data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not    Full API Documentation: https://docs.sphereon.com/api/blockchain-proof/0.9/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Model;
using Sphereon.SDK.Blockchain.Proof.Client;
using System.Reflection;

namespace Sphereon.SDK.Blockchain.Proof.Test
{
    /// <summary>
    ///  Class for testing VerifyContentResponse
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class VerifyContentResponseTests
    {
        // TODO uncomment below to declare an instance variable for VerifyContentResponse
        //private VerifyContentResponse instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of VerifyContentResponse
            //instance = new VerifyContentResponse();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of VerifyContentResponse
        /// </summary>
        [Test]
        public void VerifyContentResponseInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" VerifyContentResponse
            //Assert.IsInstanceOfType<VerifyContentResponse> (instance, "variable 'instance' is a VerifyContentResponse");
        }

        /// <summary>
        /// Test the property 'RegistrationTime'
        /// </summary>
        [Test]
        public void RegistrationTimeTest()
        {
            // TODO unit test for the property 'RegistrationTime'
        }
        /// <summary>
        /// Test the property 'ContextName'
        /// </summary>
        [Test]
        public void ContextNameTest()
        {
            // TODO unit test for the property 'ContextName'
        }
        /// <summary>
        /// Test the property 'SingleProofChain'
        /// </summary>
        [Test]
        public void SingleProofChainTest()
        {
            // TODO unit test for the property 'SingleProofChain'
        }
        /// <summary>
        /// Test the property 'Signature'
        /// </summary>
        [Test]
        public void SignatureTest()
        {
            // TODO unit test for the property 'Signature'
        }
        /// <summary>
        /// Test the property 'ContentRegistrationChainTypes'
        /// </summary>
        [Test]
        public void ContentRegistrationChainTypesTest()
        {
            // TODO unit test for the property 'ContentRegistrationChainTypes'
        }
        /// <summary>
        /// Test the property 'RequestId'
        /// </summary>
        [Test]
        public void RequestIdTest()
        {
            // TODO unit test for the property 'RequestId'
        }
        /// <summary>
        /// Test the property 'PerHashProofChain'
        /// </summary>
        [Test]
        public void PerHashProofChainTest()
        {
            // TODO unit test for the property 'PerHashProofChain'
        }
        /// <summary>
        /// Test the property 'RegistrationState'
        /// </summary>
        [Test]
        public void RegistrationStateTest()
        {
            // TODO unit test for the property 'RegistrationState'
        }
        /// <summary>
        /// Test the property 'SignatureState'
        /// </summary>
        [Test]
        public void SignatureStateTest()
        {
            // TODO unit test for the property 'SignatureState'
        }
        /// <summary>
        /// Test the property 'Hash'
        /// </summary>
        [Test]
        public void HashTest()
        {
            // TODO unit test for the property 'Hash'
        }
        /// <summary>
        /// Test the property 'SignatureStateMessage'
        /// </summary>
        [Test]
        public void SignatureStateMessageTest()
        {
            // TODO unit test for the property 'SignatureStateMessage'
        }

    }

}
