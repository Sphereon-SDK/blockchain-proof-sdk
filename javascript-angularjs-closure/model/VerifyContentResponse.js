goog.provide('model.VerifyContentResponse');

/**
 * Verify Content response
 * @record
 */
model.VerifyContentResponse = function() {}

/**
 * @type {!Date}
 * @export
 */
model.VerifyContentResponse.prototype.registrationTime;

/**
 * @type {!string}
 * @export
 */
model.VerifyContentResponse.prototype.contentId;

/**
 * @type {!api.ContentRequest}
 * @export
 */
model.VerifyContentResponse.prototype.contentRequest;

/**
 * @type {!api.CommittedChain}
 * @export
 */
model.VerifyContentResponse.prototype.proofChain;

/**
 * @type {!string}
 * @export
 */
model.VerifyContentResponse.prototype.registrationState;

/** @enum {string} */
model.VerifyContentResponse.RegistrationStateEnum = { 
  PENDING: 'PENDING',
  REGISTERED: 'REGISTERED',
  NOT_REGISTERED: 'NOT_REGISTERED',
}
