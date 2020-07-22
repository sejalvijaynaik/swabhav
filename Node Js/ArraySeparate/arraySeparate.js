"use strict";
let numArray = [12, -7, 4, -1, 3, -8];
let positiveArray = [];
let negativeArray = [];
for (let i = 0; i < numArray.length; i++) {
    if (numArray[i] < 0) {
        positiveArray.push(numArray[i]);
    }
    else {
        negativeArray.push(numArray[i]);
    }
}
for (let num of positiveArray) {
    console.log(num);
}
for (let num of negativeArray) {
    console.log(num);
}
