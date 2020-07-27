class Circle{
    static staticPi:number = 3.14;
    pi = 3;

    static staticMethod(){
        console.log("staticPi :" + this.staticPi);
        console.log("staticPi :" + Circle.staticPi);
    }

    normalMethod(){
        console.log("staticPi :" + this.pi);
        console.log("staticPi :" + Circle.staticPi);
    }
}

Circle.staticMethod();

let circle = new Circle;
circle.normalMethod();
