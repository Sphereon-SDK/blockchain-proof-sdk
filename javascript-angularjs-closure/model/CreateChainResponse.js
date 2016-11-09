goog.provide('model.CreateChainResponse');

/**
 * Committed Chain response
 * @record
 */
model.CreateChainResponse = function() {}

/**
 * @type {!api.CommittedChain}
 * @export
 */
model.CreateChainResponse.prototype.settingsChain;

/**
 * @type {!api.CreateChainRequest}
 * @export
 */
model.CreateChainResponse.prototype.chainRequest;

/**
 * @type {!api.CommittedChain}
 * @export
 */
model.CreateChainResponse.prototype.proofChain;

