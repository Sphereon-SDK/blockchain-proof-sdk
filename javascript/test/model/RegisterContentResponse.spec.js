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

(function(root, factory) {
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
}(this, function(expect, BlockchainProof) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BlockchainProof.RegisterContentResponse();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('RegisterContentResponse', function() {
    it('should create an instance of RegisterContentResponse', function() {
      // uncomment below and update the code to test RegisterContentResponse
      //var instane = new BlockchainProof.RegisterContentResponse();
      //expect(instance).to.be.a(BlockchainProof.RegisterContentResponse);
    });

    it('should have the property contextName (base name: "contextName")', function() {
      // uncomment below and update the code to test the property contextName
      //var instane = new BlockchainProof.RegisterContentResponse();
      //expect(instance).to.be();
    });

    it('should have the property singleProofChain (base name: "singleProofChain")', function() {
      // uncomment below and update the code to test the property singleProofChain
      //var instane = new BlockchainProof.RegisterContentResponse();
      //expect(instance).to.be();
    });

    it('should have the property signature (base name: "signature")', function() {
      // uncomment below and update the code to test the property signature
      //var instane = new BlockchainProof.RegisterContentResponse();
      //expect(instance).to.be();
    });

    it('should have the property contentRegistrationChainTypes (base name: "contentRegistrationChainTypes")', function() {
      // uncomment below and update the code to test the property contentRegistrationChainTypes
      //var instane = new BlockchainProof.RegisterContentResponse();
      //expect(instance).to.be();
    });

    it('should have the property requestId (base name: "requestId")', function() {
      // uncomment below and update the code to test the property requestId
      //var instane = new BlockchainProof.RegisterContentResponse();
      //expect(instance).to.be();
    });

    it('should have the property perHashProofChain (base name: "perHashProofChain")', function() {
      // uncomment below and update the code to test the property perHashProofChain
      //var instane = new BlockchainProof.RegisterContentResponse();
      //expect(instance).to.be();
    });

    it('should have the property hash (base name: "hash")', function() {
      // uncomment below and update the code to test the property hash
      //var instane = new BlockchainProof.RegisterContentResponse();
      //expect(instance).to.be();
    });

  });

}));
