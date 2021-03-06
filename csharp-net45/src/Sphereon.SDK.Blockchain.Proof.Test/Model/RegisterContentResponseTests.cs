/* 
 * Blockchain Proof
 *
 * <b>With the Blockchain Proof API it is easy to prove or disprove existence of (binary) data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.</b>    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
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
    ///  Class for testing RegisterContentResponse
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class RegisterContentResponseTests
    {
        // TODO uncomment below to declare an instance variable for RegisterContentResponse
        //private RegisterContentResponse instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of RegisterContentResponse
            //instance = new RegisterContentResponse();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of RegisterContentResponse
        /// </summary>
        [Test]
        public void RegisterContentResponseInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" RegisterContentResponse
            //Assert.IsInstanceOfType<RegisterContentResponse> (instance, "variable 'instance' is a RegisterContentResponse");
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
        /// Test the property 'RequestId'
        /// </summary>
        [Test]
        public void RequestIdTest()
        {
            // TODO unit test for the property 'RequestId'
        }
        /// <summary>
        /// Test the property 'ProofChain'
        /// </summary>
        [Test]
        public void ProofChainTest()
        {
            // TODO unit test for the property 'ProofChain'
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
        /// Test the property 'FileChain'
        /// </summary>
        [Test]
        public void FileChainTest()
        {
            // TODO unit test for the property 'FileChain'
        }

    }

}
