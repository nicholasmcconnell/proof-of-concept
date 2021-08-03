function sayHello(name: string) {
    return `hello ${name}`;
}

let username = 'person';

document.body.innerHTML = sayHello(username);