goog.provide('model.VndError');

/**
 * @record
 */
model.VndError = function() {}

/**
 * @type {!Object<!string, api.Link>}
 * @export
 */
model.VndError.prototype.links;

/**
 * @type {!string}
 * @export
 */
model.VndError.prototype.logref;

/**
 * @type {!string}
 * @export
 */
model.VndError.prototype.message;

