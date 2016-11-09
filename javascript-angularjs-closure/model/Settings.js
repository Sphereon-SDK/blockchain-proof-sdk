goog.provide('model.Settings');

/**
 * Existence Settings
 * @record
 */
model.Settings = function() {}

/**
 * Include the content size in the hash calculation.
 * @type {!boolean}
 * @export
 */
model.Settings.prototype.includeContentSize;

/**
 * The settings version (only 1 for now)
 * @type {!api.ByteArray}
 * @export
 */
model.Settings.prototype.version;

/**
 * The hashing method used (CLIENT) or to use (SERVER) for the content
 * @type {!string}
 * @export
 */
model.Settings.prototype.hashAlgorithm;

/** @enum {string} */
model.Settings.HashAlgorithmEnum = { 
  PLAIN: 'PLAIN',
  SHA_256: 'SHA_256',
  SHA_512: 'SHA_512',
}
