"use strict";
function* printGenerator() {
    console.log(0);
    console.log(1, yield);
    console.log(2, yield);
    console.log(3, yield);
}
let printGen = printGenerator();
printGen.next();
printGen.next("red");
printGen.next("blue");
printGen.next("green");
printGen.next();
