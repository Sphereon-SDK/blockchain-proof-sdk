/**
 * Blockchain Proof
 * With the Blockchain Proof API it is easy to prove or disprove existence of data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not    Full API Documentation: https://docs.sphereon.com/api/blockchain-proof/0.10/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.10
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
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BlockchainProof);
  }
}(this, function(expect, BlockchainProof) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BlockchainProof.Configuration();
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

  describe('Configuration', function() {
    it('should create an instance of Configuration', function() {
      // uncomment below and update the code to test Configuration
      //var instane = new BlockchainProof.Configuration();
      //expect(instance).to.be.a(BlockchainProof.Configuration);
    });

    it('should have the property singleProofChain (base name: "singleProofChain")', function() {
      // uncomment below and update the code to test the property singleProofChain
      //var instane = new BlockchainProof.Configuration();
      //expect(instance).to.be();
    });

    it('should have the property chainSettings (base name: "chainSettings")', function() {
      // uncomment below and update the code to test the property chainSettings
      //var instane = new BlockchainProof.Configuration();
      //expect(instance).to.be();
    });

    it('should have the property context (base name: "context")', function() {
      // uncomment below and update the code to test the property context
      //var instane = new BlockchainProof.Configuration();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new BlockchainProof.Configuration();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new BlockchainProof.Configuration();
      //expect(instance).to.be();
    });

    it('should have the property validFrom (base name: "validFrom")', function() {
      // uncomment below and update the code to test the property validFrom
      //var instane = new BlockchainProof.Configuration();
      //expect(instance).to.be();
    });

    it('should have the property accessMode (base name: "accessMode")', function() {
      // uncomment below and update the code to test the property accessMode
      //var instane = new BlockchainProof.Configuration();
      //expect(instance).to.be();
    });

  });

}));