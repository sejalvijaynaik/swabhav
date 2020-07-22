"use strict";
/*function noParaFunction(){
    console.log("my name is sejal");
}

noParaFunction();*/
/*function test(x:number, y?:number) {
    console.log("x: " + x);
    console.log("y: " + y);
}

test(1);
test(1, 2);*/
function test(x, y = 3) {
    console.log(`x= ${x}, y=${y}`);
}
test(2);
test(2, 5);
