let obj = {
    x: 5,

    run: function ustThis() {
        let x = 10;

        return () => {
            console.log(`x: ${this.x}`)
        }
    }
}

let func = obj.run();

func();