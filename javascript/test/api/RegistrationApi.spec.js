/**
 * Blockchain Proof
 * With the Blockchain Proof API it is easy to prove or disprove existence of data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not    Full API Documentation: https://docs.sphereon.com/api/blockchain-proof/0.9/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function (root, factory) {
    if (typeof define === 'function' && define.amd) {
        // AMD.
        define(['expect.js', '../../src/SphereonSDKBlockchainProof/index'], factory);
    } else if (typeof module === 'object' && module.exports) {
        // CommonJS-like environments that support module.exports, like Node.
        factory(require('expect.js'), require('../../src/SphereonSDKBlockchainProof/index'));
    } else {
        // Browser globals (root is window)
        factory(root.expect, root.BlockchainProof);
    }
}(this, function (expect, BlockchainProof) {
    'use strict';

    const TEST_CONFIG_BASENAME = "sphereoncstest";
    const TEST_CONTEXT_MULTICHAIN = "multichain";
    const MULTICHAIN_WAIT_TIME = 20000;
    const CONNECTION_TIMEOUT = 40000;
    const ACCESS_TOKEN = process.env.TESTS_JS_BCPROOF_ACESSTOKEN;

    const assert = require('assert');
    const uuidv4 = require('uuid/v4');
//        const streams = require('memory-streams');
    const fs = require('fs');
    const os = require('os');
    const path = require('path');

    let unitTestConfigName;
    const hashingSecret = new Buffer("SphereonTestSecret", "utf-8").toString('base64');

    let configurationApi;
    let registrationApi;
    let verificationApi;

    let settingsChainId;
    let proofChainId;
    let registeredContent;
    let registeredContentTempFile;


    before(function () {
        configurationApi = new BlockchainProof.ConfigurationApi();
        registrationApi = new BlockchainProof.RegistrationApi();
        verificationApi = new BlockchainProof.VerificationApi();
        unitTestConfigName = TEST_CONFIG_BASENAME + (new Date).getTime();

        const defaultClient = BlockchainProof.ApiClient.instance;
        const oauth2schema = defaultClient.authentications['oauth2schema'];
        oauth2schema.accessToken = ACCESS_TOKEN;
        defaultClient.timeout = CONNECTION_TIMEOUT;
    });

    describe('RegistrationApi', function () {

        describe('createProofAndSettingsChain', function () {
            it('should call createProofAndSettingsChain successfully', function (done) {
                this.timeout(CONNECTION_TIMEOUT * 2);
                const settings = new BlockchainProof.ChainSettings();
                settings.version = BlockchainProof.ChainSettings.VersionEnum["1"];
                settings.secret = hashingSecret;
                settings.hashAlgorithm = BlockchainProof.ChainSettings.HashAlgorithmEnum["256"];
                settings.contentRegistrationChainTypes = [
                    BlockchainProof.ChainSettings.ContentRegistrationChainTypesEnum.PER_HASH_PROOF_CHAIN,
                    BlockchainProof.ChainSettings.ContentRegistrationChainTypesEnum.SINGLE_PROOF_CHAIN
                ];

                const createConfiguration = new BlockchainProof.CreateConfigurationRequest();
                createConfiguration.name = unitTestConfigName;
                createConfiguration.initialSettings = settings;
                createConfiguration.context = TEST_CONTEXT_MULTICHAIN;
                createConfiguration.accessMode = BlockchainProof.CreateConfigurationRequest.AccessModeEnum.PRIVATE;
                configurationApi.createConfiguration(createConfiguration, (error, configurationResponse, response) => {
                        handleError(error, response);
                        assert(configurationResponse);
                        const storedSettings = configurationResponse.storedSettings;
                        assert(storedSettings);
                        assert(storedSettings.context);
                        assert(storedSettings.chainSettings);
                        assert(storedSettings.singleProofChain);
                        assert(storedSettings.settingsChain);
                        assert(storedSettings.chainConfiguration);
                        assert(storedSettings.chainSettings.singleProofChain);
                        assert(storedSettings.chainSettings.hashAlgorithm);
                        settingsChainId = storedSettings.settingsChain.chainId;
                        proofChainId = storedSettings.singleProofChain.chainId;
                        done();
                    }
                );
            });
        });

        describe('getConfiguration', function () {
            it('should call getConfiguration successfully', function (done) {
                this.timeout(CONNECTION_TIMEOUT * 2);
                configurationApi.getConfiguration(unitTestConfigName, (error, configurationResponse, response) => {
                    handleError(error, response);
                    assert(configurationResponse);
                    const storedSettings = configurationResponse.storedSettings;
                    assert(storedSettings);
                    assert(storedSettings.context);
                    assert(storedSettings.chainSettings);
                    assert(storedSettings.singleProofChain);
                    assert(storedSettings.settingsChain);
                    assert(storedSettings.chainConfiguration);
                    assert(storedSettings.chainSettings.singleProofChain);
                    assert(storedSettings.chainSettings.hashAlgorithm);
                    expect(storedSettings.settingsChain.chainId).to.be(settingsChainId);
                    expect(storedSettings.singleProofChain.chainId).to.be(proofChainId);
                    done();
                });
            });
        });

        describe('registerUsingContent', function () {
            it('should call registerUsingContent successfully', function (done) {
                this.timeout(CONNECTION_TIMEOUT * 2);
                const requestId = uuidv4();
                registeredContent = new Buffer("test-" + requestId, "utf-8").toString('base64');
                const contentRequest = new BlockchainProof.ContentRequest();
                contentRequest.requestId = requestId;
                contentRequest.content = registeredContent;
                contentRequest.hashProvider = BlockchainProof.ContentRequest.HashProviderEnum.SERVER;
                registrationApi.registerUsingContent(unitTestConfigName, contentRequest, (error, registerResponse, response) => {
                    handleError(error, response);
                    assert(registerResponse);
                    assert(registerResponse.singleProofChain);
                    assert(registerResponse.perHashProofChain);
                    expect(registerResponse.requestId).to.be(contentRequest.requestId);
                    done();
                });
            });
        });

        describe('registerUsingLocation', function () {
            it('should call registerUsingLocation successfully', function (done) {
                done();
            });
        });

        describe('registerUsingStream', function () {
            it('should call registerUsingStream successfully', function (done) {
                this.timeout(CONNECTION_TIMEOUT * 2);
                const requestId = uuidv4();
                const randomBuffer = new Buffer("test-" + requestId, "utf-8").toString('base64');
                registeredContentTempFile = path.join(os.tmpdir(), `test-stream-${unitTestConfigName}`);
                const writeStream = fs.createWriteStream(registeredContentTempFile);
                writeStream.write(randomBuffer);
                writeStream.end(function () {
                    const readStream = fs.createReadStream(registeredContentTempFile);
                    const opts = {fileName: "RandomFile"};
                    registrationApi.registerUsingStream(unitTestConfigName, readStream, opts, (error, registerResponse, response) => {
                        handleError(error, response);
                        assert(registerResponse);
                        assert(registerResponse.singleProofChain);
                        assert(registerResponse.perHashProofChain);
                        expect(registerResponse.requestId).to.be("RandomFile");
                        done();
                    });

                });
            });
        });


        describe('wait', function () {
            this.timeout(CONNECTION_TIMEOUT * 2);
            it('waiting for blockchain....', done => {
                setTimeout(function () {
                    done();
                }, MULTICHAIN_WAIT_TIME);
            });
        });

        describe('verifyUsingContent', function () {
            it('should call verifyUsingContent successfully', done => {
                const contentRequest = new BlockchainProof.ContentRequest();
                contentRequest.requestId = "anything";
                contentRequest.content = registeredContent;
                contentRequest.hashProvider = BlockchainProof.ContentRequest.HashProviderEnum.SERVER;
                const opts = {};
                verificationApi.verifyUsingContent(unitTestConfigName, contentRequest, opts, (error, verifyResponse, response) => {
                    handleError(error, response);
                    assert(verifyResponse);
                    assert(verifyResponse.registrationState === BlockchainProof.VerifyContentResponse.RegistrationStateEnum.REGISTERED
                        || verifyResponse.registrationState === BlockchainProof.VerifyContentResponse.RegistrationStateEnum.PENDING);
                    assert(verifyResponse.singleProofChain);
                    assert(verifyResponse.perHashProofChain);
                    expect(verifyResponse.requestId).to.be(contentRequest.requestId);
                    done();
                });
            });
        });

        describe('verifyUsingLocation', function () {
            it('should call verifyUsingLocation successfully', function (done) {
                done();
            });
        });

        describe('verifyUsingStream', function () {
            it('should call verifyUsingStream successfully', function (done) {
                this.timeout(CONNECTION_TIMEOUT * 2);
                const readStream = fs.createReadStream(registeredContentTempFile);
                const opts = {fileName: "RandomFile"};
                verificationApi.verifyUsingStream(unitTestConfigName, readStream, opts, (error, verifyResponse, response) => {
                    handleError(error, response);
                    assert(verifyResponse);
                    assert(verifyResponse.registrationState === BlockchainProof.VerifyContentResponse.RegistrationStateEnum.REGISTERED
                        || verifyResponse.registrationState === BlockchainProof.VerifyContentResponse.RegistrationStateEnum.PENDING);
                    assert(verifyResponse.singleProofChain);
                    assert(verifyResponse.perHashProofChain);
                    expect(verifyResponse.requestId).to.be("RandomFile");
                    done();
                });
            });
        });

        function handleError(error, response) {
            if (error) {
                let message = error;
                if (response) {
                    message += ", HTTP status code: " + response.statusCode;
                    if (response.text) {
                        message += ", Reponse body: " + response.statusCode;
                    }
                }
                throw message;
            }
        }
    });
}));