var obj = {
    x: 5,
    run: function ustThis() {
        var _this = this;
        var x = 10;
        return function () {
            console.log("x: " + _this.x);
        };
    }
};
var func = obj.run();
func();
