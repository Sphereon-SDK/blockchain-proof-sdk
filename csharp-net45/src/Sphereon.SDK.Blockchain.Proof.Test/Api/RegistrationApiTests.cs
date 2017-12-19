/* 
 * Blockchain Proof
 *
 * <b>With the Blockchain Proof API it is easy to prove or disprove existence of (binary) data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.</b>    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Text;
using System.Threading;
using NUnit.Framework;
using Sphereon.SDK.Blockchain.Proof.Api;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Sphereon.SDK.Blockchain.Proof.Test.Api
{
    /// <summary>
    ///  Class for testing RegistrationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class RegistrationApiTests : AbstractTests
    {
        private RegistrationApi _registrationApi;
        private VerificationApi _verificationApi;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            var apiConfig = new Configuration
            {
                AccessToken = FixedAccessToken,
                Timeout = 40000
            };
            _registrationApi = new RegistrationApi
            {
                Configuration = apiConfig
            };
            _verificationApi = new VerificationApi
            {
                Configuration = apiConfig
            };
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {
        }

        /// <summary>
        /// Test CreateConfiguration
        /// </summary>
        [Test, Order(10)]
        public void CreateConfigurationTest()
        {
            CreateProofAndSettingsChain();
        }

        /// <summary>
        /// Test GetConfiguration
        /// </summary>
        [Test, Order(20)]
        public void GetConfigurationTest()
        {
            var configurationResponse = _configurationApi.GetConfiguration(UnitTestConfigName);
            Assert.NotNull(configurationResponse);
            var storedSettings = configurationResponse.StoredSettings;
            Assert.NotNull(storedSettings);
            Assert.NotNull(storedSettings.Context);
            Assert.NotNull(storedSettings.ChainSettings);
            Assert.NotNull(storedSettings.SingleProofChain);
            Assert.NotNull(storedSettings.SettingsChain);
            Assert.NotNull(storedSettings.ChainConfiguration);
            Assert.NotNull(storedSettings.ChainSettings.SingleProofChain);
            Assert.NotNull(storedSettings.ChainSettings.HashAlgorithm);
            Assert.IsTrue(storedSettings.SettingsChain.Id == SettingsChainId);
            Assert.IsTrue(storedSettings.SingleProofChain.Id == ProofChainId);
        }


        /// <summary>
        /// Test RegisterUsingContent
        /// </summary>
        [Test, Order(30)]
        public void RegisterUsingContentTest()
        {
            var requestId = Guid.NewGuid().ToString();
            RegisteredContent = Encoding.Default.GetBytes("test-" + requestId);
            var contentRequest = new ContentRequest(Content: RegisteredContent,
                HashProvider: ContentRequest.HashProviderEnum.SERVER,
                RequestId: requestId
            );
            var response = _registrationApi.RegisterUsingContent(UnitTestConfigName, contentRequest);
            Assert.IsInstanceOf<RegisterContentResponse>(response, "response is RegisterContentResponse");
            Assert.NotNull(response);
            Assert.True(response.RegistrationState == RegisterContentResponse.RegistrationStateEnum.REGISTERED
                        || response.RegistrationState == RegisterContentResponse.RegistrationStateEnum.PENDING);
            Assert.NotNull(response.SingleProofChain);
            Assert.NotNull(response.PerHashProofChain);
            Assert.AreEqual(contentRequest.RequestId, response.RequestId);
        }

        /// <summary>
        /// Test RegisterUsingLocation
        /// </summary>
        [Test, Order(40)]
        public void RegisterUsingLocationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string configName = null;
            //List<StreamLocation> streamLocations = null;
            //var response = registrationApi.RegisterUsingLocation(configName, streamLocations);
            //Assert.IsInstanceOf<RegisterContentResponse> (response, "response is RegisterContentResponse");
        }

        /// <summary>
        /// Test RegisterUsingStream
        /// </summary>
        [Test, Order(50)]
        public void RegisterUsingStreamTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string configName = null;
            //System.IO.Stream stream = null;
            //var response = registrationApi.RegisterUsingStream(configName, stream);
            //Assert.IsInstanceOf<RegisterContentResponse> (response, "response is RegisterContentResponse");
        }

        /// <summary>
        /// Test VerifyUsingContent
        /// </summary>
        [Test, Order(60)]
        public void VerifyUsingContentTest()
        {
            Thread.Sleep(15000); // Should be enough for multichain registration
            var contentRequest = new ContentRequest(RequestId: "anything",
                HashProvider: ContentRequest.HashProviderEnum.SERVER,
                Content: RegisteredContent);
            var response = _verificationApi.VerifyUsingContent(UnitTestConfigName, contentRequest);
            Assert.IsInstanceOf<VerifyContentResponse>(response, "response is VerifyContentResponse");
            Assert.NotNull(response);
            Assert.True(response.RegistrationState == VerifyContentResponse.RegistrationStateEnum.REGISTERED
                        || response.RegistrationState == VerifyContentResponse.RegistrationStateEnum.PENDING);
            Assert.NotNull(response.ProofChain);
            Assert.NotNull(response.FileChain);
            Assert.AreEqual(contentRequest.RequestId, response.RequestId);
        }

        /// <summary>
        /// Test VerifyUsingLocation
        /// </summary>
        [Test, Order(70)]
        public void VerifyUsingLocationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string configName = null;
            //List<StreamLocation> streamLocations = null;
            //var response = _verificationApi.VerifyUsingLocation(configName, streamLocations);
            //Assert.IsInstanceOf<VerifyContentResponse> (response, "response is VerifyContentResponse");
        }

        /// <summary>
        /// Test VerifyUsingStream
        /// </summary>
        [Test, Order(80)]
        public void VerifyUsingStreamTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string configName = null;
            //System.IO.Stream stream = null;
            //var response = _verificationApi.VerifyUsingStream(configName, stream);
            //Assert.IsInstanceOf<VerifyContentResponse> (response, "response is VerifyContentResponse");
        }
    }
}