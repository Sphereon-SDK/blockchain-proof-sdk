/**
 * @fileoverview AUTOMATICALLY GENERATED service for api.ProofOfExistenceApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * &lt;b&gt;With the Blockchain Proof API it is easy to prove existence of (binary) data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin) blockchain by means of our generic blockchain API.&lt;/b&gt;    The flow is generally as follows:  1. Make sure a Proof chain has been created using the /chain POST endpoint beforehand. Normally you only need one or a handful of chains, during the entiry lifetime of your proof solution. This is a relative expensive operation in terms of money.  2. Store proof entries on the proof chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      &lt;b&gt;Interactive testing: &lt;/b&gt;A web based test console is available in the &lt;a href&#x3D;\&quot;https://store.sphereon.com\&quot;&gt;Sphereon API Store&lt;/a&gt;
 * Version: 0.1.0
 * Generated at: 2016-11-10T02:37:37.168+01:00
 * Generated by: class io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

goog.provide('api.ProofOfExistenceApi');

goog.require('model.ContentRequest');
goog.require('model.RegisterContentResponse');
goog.require('model.VerifyContentResponse');
goog.require('model.VndErrors');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
api.ProofOfExistenceApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('ProofOfExistenceApiBasePath') ?
                   /** @type {!string} */ ($injector.get('ProofOfExistenceApiBasePath')) :
                   'https://gw.api.cloud.sphereon.com/';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('ProofOfExistenceApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('ProofOfExistenceApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
api.ProofOfExistenceApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Register content
 * 
 * @param {!string} chainId The chain where the content will be registered
 * @param {!ContentRequest} existence Register content using the current existence settings
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!api.RegisterContentResponse>}
 */
api.ProofOfExistenceApi.prototype.registerContent = function(chainId, existence, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/blockchain/proof/0.1.0/existence/{chainId}'
      .replace('{' + 'chainId' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling registerContent');
  }
  // verify required parameter 'existence' is set
  if (!existence) {
    throw new Error('Missing required parameter existence when calling registerContent');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: existence,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Register content using a bytestream/file
 * Register content by supplying a file or some other binary data. Hashing will be done on the server side
 * @param {!string} chainId The chain where the content will be registered
 * @param {!Object} stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
 * @param {!Object=} opt_settings settings
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!api.RegisterContentResponse>}
 */
api.ProofOfExistenceApi.prototype.registerStream = function(chainId, stream, opt_settings, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/blockchain/proof/0.1.0/existence/{chainId}/stream'
      .replace('{' + 'chainId' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling registerStream');
  }
  // verify required parameter 'stream' is set
  if (!stream) {
    throw new Error('Missing required parameter stream when calling registerStream');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['settings'] = opt_settings;

  formParams['stream'] = stream;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Verify content
 * 
 * @param {!string} chainId The chain where the content was registered
 * @param {!ContentRequest} existence Verify content using the current existence settings
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!api.VerifyContentResponse>}
 */
api.ProofOfExistenceApi.prototype.verifyContent = function(chainId, existence, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/blockchain/proof/0.1.0/existence/{chainId}'
      .replace('{' + 'chainId' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling verifyContent');
  }
  // verify required parameter 'existence' is set
  if (!existence) {
    throw new Error('Missing required parameter existence when calling verifyContent');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
    data: existence,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Verify content by hash
 * 
 * @param {!string} chainId The chain where the content was registered
 * @param {!string} hash The client generated hash
 * @param {!ContentRequest=} opt_existence Verify content using the current existence settings
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!api.VerifyContentResponse>}
 */
api.ProofOfExistenceApi.prototype.verifyContentByHash = function(chainId, hash, opt_existence, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/blockchain/proof/0.1.0/existence/{chainId}/{hash}'
      .replace('{' + 'chainId' + '}', String(chainId))
      .replace('{' + 'hash' + '}', String(hash));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling verifyContentByHash');
  }
  // verify required parameter 'hash' is set
  if (!hash) {
    throw new Error('Missing required parameter hash when calling verifyContentByHash');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
    data: opt_existence,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Verify content using a bytestream/file
 * Register content by supplying a file or some other binary data. Hashing will be done on the server side
 * @param {!string} chainId The chain where the content will be registered
 * @param {!Object} stream The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored
 * @param {!Object=} opt_settings settings
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!api.VerifyContentResponse>}
 */
api.ProofOfExistenceApi.prototype.verifyStream = function(chainId, stream, opt_settings, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/blockchain/proof/0.1.0/existence/{chainId}/stream'
      .replace('{' + 'chainId' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling verifyStream');
  }
  // verify required parameter 'stream' is set
  if (!stream) {
    throw new Error('Missing required parameter stream when calling verifyStream');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['settings'] = opt_settings;

  formParams['stream'] = stream;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
