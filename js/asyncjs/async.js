function foo() {
    console.log("first")
}

function bar() {
    setTimeout(() => console.log("second"), 1000)
}
function baz() {
    console.log("third")
}

function testAsync() {
    foo();
    bar();
    baz();
}

// testAsync();

let promise1 = new Promise((res, rej) => { });

let promise2 = new Promise((res, rej) => {
    const x = 5;
    const y = 1;

    if (x >= y) {
        res({
            name: 'bob',
            age: 25
        })
    } else {
        rej(new Error());
    }
})

// promise2
//     .then(() => console.log("wee reolveed"))
//     .catch(() => console.log("we rejected"))
//     .finally(() => console.log("we finally"))