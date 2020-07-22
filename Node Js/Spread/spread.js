"use strict";
let array1 = [1, 2, 3, 4];
let array2 = [5, 6, 7, 8];
let combineArray = [...array1, ...array2];
for (let num in combineArray) {
    console.log(num);
}
