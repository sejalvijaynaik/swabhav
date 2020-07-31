"use strict";
let myMap = new Map();
myMap.set(0, "red");
myMap.set("sejal", 10);
myMap.set(2, "yellow")
    .set(false, "green")
    .set(4, true);
/*let myMap = new Map([
    [1, "red"],
    [2, "yellow"],
    [3, "green"],
    [4, "blue"],
    [5, "black"]
]);*/
/*console.log(myMap.get(2));
console.log(myMap.has(0));

myMap.delete(4);
console.log(myMap.has(4));

console.log(myMap.size);*/
/*for(let key of myMap.keys()){
    console.log(key);
}*/
/*for(let value of myMap.values()){
    console.log(value);
}*/
for (let entry of myMap.entries()) {
    console.log(entry[0], entry[1]);
}
