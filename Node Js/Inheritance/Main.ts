import { Shape } from "./Shape";
import { Circle } from "./Circle";
import { Rectangle } from "./Rectangle";

let shape = new Shape(10, 25);
let circle = new Circle(20, 30, 40);
let rectangle = new Rectangle(50, 60, 70, 80);

let shapeArray : Shape[] = [];
shapeArray.push(shape);
shapeArray.push(circle);
shapeArray.push(rectangle);

for(let tempShape of shapeArray){
    console.log(tempShape.getInfo());
}