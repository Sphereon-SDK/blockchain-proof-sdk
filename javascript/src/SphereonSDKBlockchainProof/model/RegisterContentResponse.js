/**
 * Blockchain Proof
 * <b>With the Blockchain Proof API it is easy to prove or disprove existence of (binary) data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.</b>    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
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
    // AMD. Register as an anonymous module.
    define(['SphereonSDKBlockchainProof/ApiClient', 'SphereonSDKBlockchainProof/model/CommittedChain'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CommittedChain'));
  } else {
    // Browser globals (root is window)
    if (!root.BlockchainProof) {
      root.BlockchainProof = {};
    }
    root.BlockchainProof.RegisterContentResponse = factory(root.BlockchainProof.ApiClient, root.BlockchainProof.CommittedChain);
  }
}(this, function(ApiClient, CommittedChain) {
  'use strict';




  /**
   * The RegisterContentResponse model module.
   * @module SphereonSDKBlockchainProof/model/RegisterContentResponse
   * @version 0.9
   */

  /**
   * Constructs a new <code>RegisterContentResponse</code>.
   * Committed Content response
   * @alias module:SphereonSDKBlockchainProof/model/RegisterContentResponse
   * @class
   * @param contextName {String} 
   * @param registrationState {module:SphereonSDKBlockchainProof/model/RegisterContentResponse.RegistrationStateEnum} 
   */
  var exports = function(contextName, registrationState) {
    var _this = this;

    _this['contextName'] = contextName;



    _this['registrationState'] = registrationState;
  };

  /**
   * Constructs a <code>RegisterContentResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKBlockchainProof/model/RegisterContentResponse} obj Optional instance to populate.
   * @return {module:SphereonSDKBlockchainProof/model/RegisterContentResponse} The populated <code>RegisterContentResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('contextName')) {
        obj['contextName'] = ApiClient.convertToType(data['contextName'], 'String');
      }
      if (data.hasOwnProperty('singleProofChain')) {
        obj['singleProofChain'] = CommittedChain.constructFromObject(data['singleProofChain']);
      }
      if (data.hasOwnProperty('requestId')) {
        obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
      }
      if (data.hasOwnProperty('perHashProofChain')) {
        obj['perHashProofChain'] = CommittedChain.constructFromObject(data['perHashProofChain']);
      }
      if (data.hasOwnProperty('registrationState')) {
        obj['registrationState'] = ApiClient.convertToType(data['registrationState'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} contextName
   */
  exports.prototype['contextName'] = undefined;
  /**
   * This is the single proof chain where all hashes are stored (if configured)
   * @member {module:SphereonSDKBlockchainProof/model/CommittedChain} singleProofChain
   */
  exports.prototype['singleProofChain'] = undefined;
  /**
   * @member {String} requestId
   */
  exports.prototype['requestId'] = undefined;
  /**
   * This is the proof chain specific for the current hash (if configured)
   * @member {module:SphereonSDKBlockchainProof/model/CommittedChain} perHashProofChain
   */
  exports.prototype['perHashProofChain'] = undefined;
  /**
   * @member {module:SphereonSDKBlockchainProof/model/RegisterContentResponse.RegistrationStateEnum} registrationState
   */
  exports.prototype['registrationState'] = undefined;


  /**
   * Allowed values for the <code>registrationState</code> property.
   * @enum {String}
   * @readonly
   */
  exports.RegistrationStateEnum = {
    /**
     * value: "PENDING"
     * @const
     */
    "PENDING": "PENDING",
    /**
     * value: "REGISTERED"
     * @const
     */
    "REGISTERED": "REGISTERED",
    /**
     * value: "NOT_REGISTERED"
     * @const
     */
    "NOT_REGISTERED": "NOT_REGISTERED"  };


  return exports;
}));


