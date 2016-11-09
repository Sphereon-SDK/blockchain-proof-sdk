goog.provide('model.ContentRequest');

/**
 * Content existence request
 * @record
 */
model.ContentRequest = function() {}

/**
 * @type {!api.Settings}
 * @export
 */
model.ContentRequest.prototype.settings;

/**
 * When CLIENT is supplied the content should already have been hashed by you. When SERVER is supplied we will hash the content according to the supplied settings
 * @type {!string}
 * @export
 */
model.ContentRequest.prototype.hashProvider;

/**
 * The content to register.
 * @type {!api.ByteArray}
 * @export
 */
model.ContentRequest.prototype.content;

/** @enum {string} */
model.ContentRequest.HashProviderEnum = { 
  SERVER: 'SERVER',
  CLIENT: 'CLIENT',
}
