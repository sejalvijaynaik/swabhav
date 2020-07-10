"use strict";
class Rectangle {
    constructor(width, length) {
        this._width = width;
        this._length = length;
    }
    get length() {
        return this._length;
    }
    set length(value) {
        this._length = value;
    }
    get width() {
        return this._width;
    }
    set width(value) {
        this._width = value;
    }
    calculateArea() {
        return this._width * this._length;
    }
}
let rec1 = new Rectangle(10, 20);
console.log(rec1.width);
console.log(rec1.length);
console.log(rec1.calculateArea());
let rec2 = new Rectangle(20, 30);
console.log(rec2.width);
console.log(rec2.length);
console.log(rec2.calculateArea());
