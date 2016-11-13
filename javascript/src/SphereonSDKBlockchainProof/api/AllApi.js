/**
 * Blockchain Proof
 * <b>With the Blockchain Proof API it is easy to prove existence of (binary) data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin) blockchain by means of our generic blockchain API.</b>    The flow is generally as follows:  1. Make sure a Proof chain has been created using the /chain POST endpoint beforehand. Normally you only need one or a handful of chains, during the entiry lifetime of your proof solution. This is a relative expensive operation in terms of money.  2. Store proof entries on the proof chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1.0
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSDKBlockchainProof/ApiClient', 'SphereonSDKBlockchainProof/model/CreateChainRequest', 'SphereonSDKBlockchainProof/model/CreateChainResponse', 'SphereonSDKBlockchainProof/model/VndErrors', 'SphereonSDKBlockchainProof/model/ContentRequest', 'SphereonSDKBlockchainProof/model/RegisterContentResponse', 'SphereonSDKBlockchainProof/model/SettingsResponse', 'SphereonSDKBlockchainProof/model/VerifyContentResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/CreateChainRequest'), require('../model/CreateChainResponse'), require('../model/VndErrors'), require('../model/ContentRequest'), require('../model/RegisterContentResponse'), require('../model/SettingsResponse'), require('../model/VerifyContentResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.BlockchainProof) {
      root.BlockchainProof = {};
    }
    root.BlockchainProof.AllApi = factory(root.BlockchainProof.ApiClient, root.BlockchainProof.CreateChainRequest, root.BlockchainProof.CreateChainResponse, root.BlockchainProof.VndErrors, root.BlockchainProof.ContentRequest, root.BlockchainProof.RegisterContentResponse, root.BlockchainProof.SettingsResponse, root.BlockchainProof.VerifyContentResponse);
  }
}(this, function(ApiClient, CreateChainRequest, CreateChainResponse, VndErrors, ContentRequest, RegisterContentResponse, SettingsResponse, VerifyContentResponse) {
  'use strict';

  /**
   * All service.
   * @module SphereonSDKBlockchainProof/api/AllApi
   * @version 0.1.0
   */

  /**
   * Constructs a new AllApi. 
   * @alias module:SphereonSDKBlockchainProof/api/AllApi
   * @class
   * @param {module:SphereonSDKBlockchainProof/ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:SphereonSDKBlockchainProof/ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createChain operation.
     * @callback module:SphereonSDKBlockchainProof/api/AllApi~createChainCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/CreateChainResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a new existence chain
     * @param {module:SphereonSDKBlockchainProof/model/CreateChainRequest} request Create a new Proof of Existence chain using the provided existence settings
     * @param {module:SphereonSDKBlockchainProof/api/AllApi~createChainCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainProof/model/CreateChainResponse}
     */
    this.createChain = function(request, callback) {
      var postBody = request;

      // verify the required parameter 'request' is set
      if (request == undefined || request == null) {
        throw "Missing the required parameter 'request' when calling createChain";
      }


      var pathParams = {
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
      var returnType = CreateChainResponse;

      return this.apiClient.callApi(
        '/blockchain/proof/0.1.0/existence', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the registerContent operation.
     * @callback module:SphereonSDKBlockchainProof/api/AllApi~registerContentCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/RegisterContentResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Register content
     * @param {String} chainId The chain where the content will be registered
     * @param {module:SphereonSDKBlockchainProof/model/ContentRequest} existence Register content using the current existence settings
     * @param {module:SphereonSDKBlockchainProof/api/AllApi~registerContentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainProof/model/RegisterContentResponse}
     */
    this.registerContent = function(chainId, existence, callback) {
      var postBody = existence;

      // verify the required parameter 'chainId' is set
      if (chainId == undefined || chainId == null) {
        throw "Missing the required parameter 'chainId' when calling registerContent";
      }

      // verify the required parameter 'existence' is set
      if (existence == undefined || existence == null) {
        throw "Missing the required parameter 'existence' when calling registerContent";
      }


      var pathParams = {
        'chainId': chainId
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
      var returnType = RegisterContentResponse;

      return this.apiClient.callApi(
        '/blockchain/proof/0.1.0/existence/{chainId}/content', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the registerStream operation.
     * @callback module:SphereonSDKBlockchainProof/api/AllApi~registerStreamCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/RegisterContentResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Register content using a bytestream/file
     * Register content by supplying a file or some other binary data. Hashing will be done on the server side
     * @param {String} chainId The chain where the content will be registered
     * @param {File} stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
     * @param {module:SphereonSDKBlockchainProof/api/AllApi~registerStreamCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainProof/model/RegisterContentResponse}
     */
    this.registerStream = function(chainId, stream, callback) {
      var postBody = null;

      // verify the required parameter 'chainId' is set
      if (chainId == undefined || chainId == null) {
        throw "Missing the required parameter 'chainId' when calling registerStream";
      }

      // verify the required parameter 'stream' is set
      if (stream == undefined || stream == null) {
        throw "Missing the required parameter 'stream' when calling registerStream";
      }


      var pathParams = {
        'chainId': chainId
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
      var returnType = RegisterContentResponse;

      return this.apiClient.callApi(
        '/blockchain/proof/0.1.0/existence/{chainId}/stream', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the settings operation.
     * @callback module:SphereonSDKBlockchainProof/api/AllApi~settingsCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/SettingsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the settings for registration/verification
     * @param {String} chainId This is the chain where the content is registered/verified
     * @param {module:SphereonSDKBlockchainProof/api/AllApi~settingsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainProof/model/SettingsResponse}
     */
    this.settings = function(chainId, callback) {
      var postBody = null;

      // verify the required parameter 'chainId' is set
      if (chainId == undefined || chainId == null) {
        throw "Missing the required parameter 'chainId' when calling settings";
      }


      var pathParams = {
        'chainId': chainId
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
      var returnType = SettingsResponse;

      return this.apiClient.callApi(
        '/blockchain/proof/0.1.0/existence/{chainId}/settings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the verifyContent operation.
     * @callback module:SphereonSDKBlockchainProof/api/AllApi~verifyContentCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/VerifyContentResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify content
     * @param {String} chainId The chain where the content was registered
     * @param {module:SphereonSDKBlockchainProof/model/ContentRequest} existence Verify content using the current existence settings
     * @param {module:SphereonSDKBlockchainProof/api/AllApi~verifyContentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainProof/model/VerifyContentResponse}
     */
    this.verifyContent = function(chainId, existence, callback) {
      var postBody = existence;

      // verify the required parameter 'chainId' is set
      if (chainId == undefined || chainId == null) {
        throw "Missing the required parameter 'chainId' when calling verifyContent";
      }

      // verify the required parameter 'existence' is set
      if (existence == undefined || existence == null) {
        throw "Missing the required parameter 'existence' when calling verifyContent";
      }


      var pathParams = {
        'chainId': chainId
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
        '/blockchain/proof/0.1.0/existence/{chainId}/content', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the verifyStream operation.
     * @callback module:SphereonSDKBlockchainProof/api/AllApi~verifyStreamCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/VerifyContentResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify content using a bytestream/file
     * Register content by supplying a file or some other binary data. Hashing will be done on the server side
     * @param {String} chainId The chain where the content will be registered
     * @param {File} stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
     * @param {module:SphereonSDKBlockchainProof/api/AllApi~verifyStreamCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:SphereonSDKBlockchainProof/model/VerifyContentResponse}
     */
    this.verifyStream = function(chainId, stream, callback) {
      var postBody = null;

      // verify the required parameter 'chainId' is set
      if (chainId == undefined || chainId == null) {
        throw "Missing the required parameter 'chainId' when calling verifyStream";
      }

      // verify the required parameter 'stream' is set
      if (stream == undefined || stream == null) {
        throw "Missing the required parameter 'stream' when calling verifyStream";
      }


      var pathParams = {
        'chainId': chainId
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
        '/blockchain/proof/0.1.0/existence/{chainId}/stream', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
