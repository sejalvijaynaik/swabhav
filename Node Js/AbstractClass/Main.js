"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Circle_1 = require("./Circle");
var Rectangle_1 = require("./Rectangle");
var circle = new Circle_1.Circle(20, 30, 40);
var rectangle = new Rectangle_1.Rectangle(50, 60, 70, 80);
var shapeArray = [];
shapeArray.push(circle);
shapeArray.push(rectangle);
for (var _i = 0, shapeArray_1 = shapeArray; _i < shapeArray_1.length; _i++) {
    var tempShape = shapeArray_1[_i];
    console.log(tempShape.calculateArea());
}
