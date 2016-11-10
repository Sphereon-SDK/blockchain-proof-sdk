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
 * Supply an existing settings chain. When not supplied a new settings chain will be created automatically.
 * @type {!string}
 * @export
 */
model.CreateChainRequest.prototype.settingsChainId;

/**
 * Unique name for this chain.
 * @type {!string}
 * @export
 */
model.CreateChainRequest.prototype.name;

/**
 * When this chain is a continuation of another chain you need to supply the previous chainId here.
 * @type {!string}
 * @export
 */
model.CreateChainRequest.prototype.previousChainId;

/**
 * @type {!api.Settings}
 * @export
 */
model.CreateChainRequest.prototype.defaultSettings;

