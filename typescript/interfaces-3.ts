interface Automobile {
    make: string;
}

class Car implements Automobile {
    make: string;

    run(): void {
        console.log('The care is running...');
    }
}

let jacksonsCar = new Car();
jacksonsCar.make = "red"
console.log(jacksonsCar.run(), jacksonsCar.make);