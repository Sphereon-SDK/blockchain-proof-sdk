goog.provide('model.CreateChainRequest');

/**
 * Create chain for Proof of Existence request
 * @record
 */
model.CreateChainRequest = function() {}

/**
 * Metadata for this chain.
 * @type {!api.ByteArray}
 * @export
 */
model.CreateChainRequest.prototype.metadata;

/**
 * Unique name for this chain.
 * @type {!string}
 * @export
 */
model.CreateChainRequest.prototype.name;

/**
 * @type {!api.Settings}
 * @export
 */
model.CreateChainRequest.prototype.defaultSettings;

