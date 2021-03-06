/* 
 * Blockchain Proof
 *
 * With the Blockchain Proof API it is easy to prove or disprove existence of data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not    Full API Documentation: https://docs.sphereon.com/api/blockchain-proof/0.9/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Sphereon.SDK.Blockchain.Proof.Test
{
    /// <summary>
    ///  Class for testing VerificationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class VerificationApiTests
    {
        private VerificationApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new VerificationApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of VerificationApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' VerificationApi
            //Assert.IsInstanceOfType(typeof(VerificationApi), instance, "instance is a VerificationApi");
        }

        
        /// <summary>
        /// Test VerifyUsingContent
        /// </summary>
        [Test]
        public void VerifyUsingContentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string configName = null;
            //ContentRequest existence = null;
            //string secret = null;
            //var response = instance.VerifyUsingContent(configName, existence, secret);
            //Assert.IsInstanceOf<VerifyContentResponse> (response, "response is VerifyContentResponse");
        }
        
        /// <summary>
        /// Test VerifyUsingLocation
        /// </summary>
        [Test]
        public void VerifyUsingLocationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string configName = null;
            //StreamLocation streamLocation = null;
            //string requestId = null;
            //string secret = null;
            //var response = instance.VerifyUsingLocation(configName, streamLocation, requestId, secret);
            //Assert.IsInstanceOf<VerifyContentResponse> (response, "response is VerifyContentResponse");
        }
        
        /// <summary>
        /// Test VerifyUsingStream
        /// </summary>
        [Test]
        public void VerifyUsingStreamTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string configName = null;
            //System.IO.Stream stream = null;
            //string fileName = null;
            //string secret = null;
            //var response = instance.VerifyUsingStream(configName, stream, fileName, secret);
            //Assert.IsInstanceOf<VerifyContentResponse> (response, "response is VerifyContentResponse");
        }
        
    }

}
