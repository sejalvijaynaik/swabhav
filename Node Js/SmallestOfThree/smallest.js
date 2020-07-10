"use strict";
var inputArray = [20, 30, 10];
function findSmallestNumber(numArray) {
    let smallest = numArray[0];
    if (numArray[1] < smallest) {
        smallest = numArray[1];
    }
    if (numArray[2] < smallest) {
        smallest = numArray[2];
    }
    return smallest;
}
console.log(findSmallestNumber(inputArray));
