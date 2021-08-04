var Person = /** @class */ (function () {
    function Person(name) {
        this.name = name;
    }
    Person.prototype.talk = function () {
        console.log('Hello my name is: ' + this.name);
    };
    return Person;
}());
var Address = /** @class */ (function () {
    function Address(street, zipcode) {
        this.street = street;
        this.zipcode = zipcode;
    }
    return Address;
}());
function createIntersection(person, address) {
    var result = {};
    for (var id in person) {
        result[id] = person[id];
    }
    for (var id in address) {
        result[id] = person[id];
    }
    return result;
}
var intersection = createIntersection(new Person('Jackson'), new Address('123 lala Lane', 89785));
intersection.talk();
