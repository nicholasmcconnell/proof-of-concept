class Gadget {
    description: string = "this is what a gadget is";

    constructor(description: string) {
        this.description = description;
    }

    on() {
        console.log("the gadget is on")
    }
}

class TV extends Gadget {

    on() {
        console.log('the tv is on')
    }
}

let g = new Gadget('gadget description');
let tv = new TV('tv description');

g.on();
tv.on();

console.log(g.description)