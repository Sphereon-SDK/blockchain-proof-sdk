/**
 * Blockchain Proof
 * <b>With the Blockchain Proof API it is easy to prove existence of (binary) data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin) blockchain by means of our generic blockchain API.</b>    The flow is generally as follows:  1. Make sure a Proof chain has been created using the /chain POST endpoint beforehand. Normally you only need one or a handful of chains, during the entiry lifetime of your proof solution. This is a relative expensive operation in terms of money.  2. Store proof entries on the proof chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9.0-SNAPSHOT
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
    // AMD. Register as an anonymous module.
    define(['SphereonSDKBlockchainProof/ApiClient', 'SphereonSDKBlockchainProof/model/ContentRequest', 'SphereonSDKBlockchainProof/model/ErrorResponse', 'SphereonSDKBlockchainProof/model/StreamLocation', 'SphereonSDKBlockchainProof/model/VerifyContentResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/ContentRequest'), require('../model/ErrorResponse'), require('../model/StreamLocation'), require('../model/VerifyContentResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.BlockchainProof) {
      root.BlockchainProof = {};
    }
    root.BlockchainProof.ProofOfExistenceApi = factory(root.BlockchainProof.ApiClient, root.BlockchainProof.ContentRequest, root.BlockchainProof.ErrorResponse, root.BlockchainProof.StreamLocation, root.BlockchainProof.VerifyContentResponse);
  }
}(this, function(ApiClient, ContentRequest, ErrorResponse, StreamLocation, VerifyContentResponse) {
  'use strict';

  /**
   * ProofOfExistence service.
   * @module SphereonSDKBlockchainProof/api/ProofOfExistenceApi
   * @version 0.9.0-SNAPSHOT
   */

  /**
   * Constructs a new ProofOfExistenceApi. 
   * @alias module:SphereonSDKBlockchainProof/api/ProofOfExistenceApi
   * @class
   * @param {module:SphereonSDKBlockchainProof/ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:SphereonSDKBlockchainProof/ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the verifyContent operation.
     * @callback module:SphereonSDKBlockchainProof/api/ProofOfExistenceApi~verifyContentCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/VerifyContentResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify content
     * @param {String} configName The configName for this operation
     * @param {module:SphereonSDKBlockchainProof/model/ContentRequest} existence Verify content using the current settings
     * @param {module:SphereonSDKBlockchainProof/api/ProofOfExistenceApi~verifyContentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainProof/model/VerifyContentResponse}
     */
    this.verifyContent = function(configName, existence, callback) {
      var postBody = existence;

      // verify the required parameter 'configName' is set
      if (configName === undefined || configName === null) {
        throw new Error("Missing the required parameter 'configName' when calling verifyContent");
      }

      // verify the required parameter 'existence' is set
      if (existence === undefined || existence === null) {
        throw new Error("Missing the required parameter 'existence' when calling verifyContent");
      }


      var pathParams = {
        'configName': configName
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2schema'];
      var contentTypes = ['application/json;charset=UTF-8'];
      var accepts = ['application/json;charset=UTF-8'];
      var returnType = VerifyContentResponse;

      return this.apiClient.callApi(
        '/blockchain/proof/0.9/existence/{configName}/content', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the verifyStream operation.
     * @callback module:SphereonSDKBlockchainProof/api/ProofOfExistenceApi~verifyStreamCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/VerifyContentResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify content using a bytestream/file
     * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
     * @param {String} configName The configuration name this operation
     * @param {File} stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
     * @param {module:SphereonSDKBlockchainProof/api/ProofOfExistenceApi~verifyStreamCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainProof/model/VerifyContentResponse}
     */
    this.verifyStream = function(configName, stream, callback) {
      var postBody = null;

      // verify the required parameter 'configName' is set
      if (configName === undefined || configName === null) {
        throw new Error("Missing the required parameter 'configName' when calling verifyStream");
      }

      // verify the required parameter 'stream' is set
      if (stream === undefined || stream === null) {
        throw new Error("Missing the required parameter 'stream' when calling verifyStream");
      }


      var pathParams = {
        'configName': configName
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'stream': stream
      };

      var authNames = ['oauth2schema'];
      var contentTypes = ['multipart/form-data'];
      var accepts = ['application/json;charset=UTF-8'];
      var returnType = VerifyContentResponse;

      return this.apiClient.callApi(
        '/blockchain/proof/0.9/existence/{configName}/streams/multipart', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the verifyStreamsOnStorage operation.
     * @callback module:SphereonSDKBlockchainProof/api/ProofOfExistenceApi~verifyStreamsOnStorageCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/VerifyContentResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify content using a bytestream/file
     * Verify content by supplying a file or some other binary data. Hashing will be done on the server side
     * @param {String} configName The context for this operation
     * @param {Array.<module:SphereonSDKBlockchainProof/model/StreamLocation>} streamLocations The stream locations on storage
     * @param {module:SphereonSDKBlockchainProof/api/ProofOfExistenceApi~verifyStreamsOnStorageCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainProof/model/VerifyContentResponse}
     */
    this.verifyStreamsOnStorage = function(configName, streamLocations, callback) {
      var postBody = streamLocations;

      // verify the required parameter 'configName' is set
      if (configName === undefined || configName === null) {
        throw new Error("Missing the required parameter 'configName' when calling verifyStreamsOnStorage");
      }

      // verify the required parameter 'streamLocations' is set
      if (streamLocations === undefined || streamLocations === null) {
        throw new Error("Missing the required parameter 'streamLocations' when calling verifyStreamsOnStorage");
      }


      var pathParams = {
        'configName': configName
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2schema'];
      var contentTypes = ['multipart/form-data'];
      var accepts = ['application/json;charset=UTF-8'];
      var returnType = VerifyContentResponse;

      return this.apiClient.callApi(
        '/blockchain/proof/0.9/existence/{configName}/streams/location', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
