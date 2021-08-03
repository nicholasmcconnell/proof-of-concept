let o = {
    fName: 'nicholas',
    age: 45,
    nickname: 'nick'

};

let { fName: fn, ...list } = o;

console.log(fn);
