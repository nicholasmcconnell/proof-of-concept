const URL = `https://jsonplaceholder.typicode.com`;

const getPosts = async () => {
    let req = await fetch(`${URL}/posts`);
    let res = await req.json();
    console.log(res);
}

const post = async () => {
    let title = document.getElementById('title').value;
    let body = document.getElementById('body').value;

    let obj = {
        title,
        body,
        id: 1
    }

    let req = await fetch(`${URL}/posts`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(obj)
    })

    let res = await req.json();
    console.log(res)
}