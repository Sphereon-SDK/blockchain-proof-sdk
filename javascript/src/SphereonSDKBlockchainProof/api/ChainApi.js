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
    define(['SphereonSDKBlockchainProof/ApiClient', 'SphereonSDKBlockchainProof/model/CreateChainRequest', 'SphereonSDKBlockchainProof/model/CreateChainResponse', 'SphereonSDKBlockchainProof/model/VndErrors'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/CreateChainRequest'), require('../model/CreateChainResponse'), require('../model/VndErrors'));
  } else {
    // Browser globals (root is window)
    if (!root.BlockchainProof) {
      root.BlockchainProof = {};
    }
    root.BlockchainProof.ChainApi = factory(root.BlockchainProof.ApiClient, root.BlockchainProof.CreateChainRequest, root.BlockchainProof.CreateChainResponse, root.BlockchainProof.VndErrors);
  }
}(this, function(ApiClient, CreateChainRequest, CreateChainResponse, VndErrors) {
  'use strict';

  /**
   * Chain service.
   * @module SphereonSDKBlockchainProof/api/ChainApi
   * @version 0.1.0
   */

  /**
   * Constructs a new ChainApi. 
   * @alias module:SphereonSDKBlockchainProof/api/ChainApi
   * @class
   * @param {module:SphereonSDKBlockchainProof/ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:SphereonSDKBlockchainProof/ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createChain operation.
     * @callback module:SphereonSDKBlockchainProof/api/ChainApi~createChainCallback
     * @param {String} error Error message, if any.
     * @param {module:SphereonSDKBlockchainProof/model/CreateChainResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a new entity chain
     * @param {module:SphereonSDKBlockchainProof/model/CreateChainRequest} request Create a new Proof of Existence chain using the provided entity settings
     * @param {module:SphereonSDKBlockchainProof/api/ChainApi~createChainCallback} callback The callback function, accepting three arguments: error, data, response
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
  };

  return exports;
}));
