goog.provide('model.RegisterContentResponse');

/**
 * Committed Content response
 * @record
 */
model.RegisterContentResponse = function() {}

/**
 * @type {!api.ContentRequest}
 * @export
 */
model.RegisterContentResponse.prototype.contentRequest;

/**
 * @type {!api.CommittedChain}
 * @export
 */
model.RegisterContentResponse.prototype.proofChain;

/**
 * @type {!string}
 * @export
 */
model.RegisterContentResponse.prototype.registrationState;

/** @enum {string} */
model.RegisterContentResponse.RegistrationStateEnum = { 
  PENDING: 'PENDING',
  REGISTERED: 'REGISTERED',
  NOT_REGISTERED: 'NOT_REGISTERED',
}
