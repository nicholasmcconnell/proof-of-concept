var Car = /** @class */ (function () {
    function Car() {
    }
    Car.prototype.run = function () {
        console.log('The care is running...');
    };
    return Car;
}());
var jacksonsCar = new Car();
jacksonsCar.make = "red";
console.log(jacksonsCar.run(), jacksonsCar.make);
