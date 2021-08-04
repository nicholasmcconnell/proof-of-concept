// function returner<T>(sometime: T) {
//     console.log(sometime)
//     return "456";
// }

// returner(456);

interface IReturner {
    <T>(arg: T): T;
}

let result: IReturner = function (arg: number): number {
    return arg;
}

console.log(result(8));