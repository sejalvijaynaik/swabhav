"use strict";
class Circle {
    static calculateArea(radius) {
        return Circle.pi * radius * radius;
    }
    static calculatePerimeter(radius) {
        return 2 * Circle.pi * radius;
    }
}
Circle.pi = 3.14;
console.log(Circle.calculateArea(10));
console.log(Circle.calculatePerimeter(10));
