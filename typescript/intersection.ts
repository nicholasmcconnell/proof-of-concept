class Person {
    name: string;
    constructor(name: string) {
        this.name = name;
    }

    talk() {
        console.log('Hello my name is: ' + this.name);
    }
}

class Address {
    street: string;
    zipcode: number;

    constructor(street: string, zipcode: number) {
        this.street = street;
        this.zipcode = zipcode;
    }
}

function createIntersection(person: Person, address: Address): Person & Address {
    let result = <Person & Address>{};

    for (let id in person) {
        result[id] = person[id];
    }

    for (let id in address) {
        result[id] = person[id];
    }

    return result;
}

let intersection = createIntersection(new Person('Jackson'), new Address('123 lala Lane', 89785));

intersection.talk();
