interface Person {
    name: string;
    age?: number;
    readonly social: number
}

function displayPerson(p: Person) {
    console.log(p.name)

    if (p.age) {
        console.log(p.age)
    }
}

let person = { "name": "firstName", social: 4567 };
displayPerson(person);