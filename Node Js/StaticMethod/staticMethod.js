"use strict";
class Circle {
    constructor() {
        this.pi = 3;
    }
    static staticMethod() {
        console.log("staticPi :" + this.staticPi);
        console.log("staticPi :" + Circle.staticPi);
    }
    normalMethod() {
        console.log("staticPi :" + this.pi);
        console.log("staticPi :" + Circle.staticPi);
    }
}
Circle.staticPi = 3.14;
Circle.staticMethod();
let circle = new Circle;
circle.normalMethod();
