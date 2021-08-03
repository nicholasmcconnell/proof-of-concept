interface myFunc {
    (n: number, s: string): boolean;
}

let f: myFunc = function (myNum: number, myStr: string) {
    return myNum > myStr.length;
};

let result = f(5, 'Hi');
console.log(result);