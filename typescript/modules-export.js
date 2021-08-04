"use strict";
exports.__esModule = true;
exports.exportClass2 = exports.exportClass = void 0;
var exportClass = /** @class */ (function () {
    function exportClass() {
    }
    exportClass.prototype.print = function () {
        console.log('this is pring method works');
    };
    return exportClass;
}());
exports.exportClass = exportClass;
var exportClass2 = /** @class */ (function () {
    function exportClass2() {
    }
    exportClass2.prototype.print = function () {
        console.log('This is prnting also 222');
    };
    return exportClass2;
}());
exports.exportClass2 = exportClass2;
