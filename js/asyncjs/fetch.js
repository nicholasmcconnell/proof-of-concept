//basic syntax
// let request = fetch(url, [options]);

const URL = `https://jsonplaceholder.typicode.com`;

const getPosts = () => {
    fetch(`${URL}/posts`)
        .then((res) => res.json())
        .then((data) => console.log(data))
}

const responseHeader = () => {
    fetch(`${URL}/posts`)
        .then((res) => console.log(res.header))
}

const requestHeader = () => {
    fetch(`${URL}/posts`, {
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then((res) => res.json()
            .then((data) => console.log(data)))
}

const post = () => {
    let title = document.getElementById('title').value;
    let body = document.getElementById('body').value;

    let obj = {
        title,
        body,
        id: 1
    }

    fetch(`${URL}/posts`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(obj)
    })
        .then((res) => res.json())
        .then((data) => console.log(data))
}

const failedRequest = () => {
    fetch(`${URL / posts}`, {
        method: 'GET',
        body: {}
    })
        .then((res) => res.json())
        .then((data) => console.log(data))
        .catch((err) => console.log("there is an error dude."))
}

getPosts();
responseHeader();
requestHeader();