function displayPerson(p) {
    console.log(p.name);
    if (p.age) {
        console.log(p.age);
    }
}
var person = { "name": "firstName" };
displayPerson(person);
