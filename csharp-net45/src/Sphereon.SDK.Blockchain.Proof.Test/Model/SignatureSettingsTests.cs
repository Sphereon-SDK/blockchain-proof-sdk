/* 
 * Blockchain Proof
 *
 * With the Blockchain Proof API it is easy to prove or disprove existence of data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not    Full API Documentation: https://docs.sphereon.com/api/blockchain-proof/0.10/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.10
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
    ///  Class for testing SignatureSettings
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class SignatureSettingsTests
    {
        // TODO uncomment below to declare an instance variable for SignatureSettings
        //private SignatureSettings instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of SignatureSettings
            //instance = new SignatureSettings();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SignatureSettings
        /// </summary>
        [Test]
        public void SignatureSettingsInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" SignatureSettings
            //Assert.IsInstanceOfType<SignatureSettings> (instance, "variable 'instance' is a SignatureSettings");
        }

        /// <summary>
        /// Test the property 'Base64Secret'
        /// </summary>
        [Test]
        public void Base64SecretTest()
        {
            // TODO unit test for the property 'Base64Secret'
        }
        /// <summary>
        /// Test the property 'SuppliedSignature'
        /// </summary>
        [Test]
        public void SuppliedSignatureTest()
        {
            // TODO unit test for the property 'SuppliedSignature'
        }
        /// <summary>
        /// Test the property 'SignatureType'
        /// </summary>
        [Test]
        public void SignatureTypeTest()
        {
            // TODO unit test for the property 'SignatureType'
        }
        /// <summary>
        /// Test the property 'KeyId'
        /// </summary>
        [Test]
        public void KeyIdTest()
        {
            // TODO unit test for the property 'KeyId'
        }

    }

}
