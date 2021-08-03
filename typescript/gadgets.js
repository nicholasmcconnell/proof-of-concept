var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Gadget = /** @class */ (function () {
    function Gadget(description) {
        this.description = "this is what a gadget is";
        this.description = description;
    }
    Gadget.prototype.on = function () {
        console.log("the gadget is on");
    };
    return Gadget;
}());
var TV = /** @class */ (function (_super) {
    __extends(TV, _super);
    function TV() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    TV.prototype.on = function () {
        console.log('the tv is on');
    };
    return TV;
}(Gadget));
var g = new Gadget('gadget description');
var tv = new TV('tv description');
g.on();
tv.on();
console.log(g.description);
