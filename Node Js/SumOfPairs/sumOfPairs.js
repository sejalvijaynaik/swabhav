"use strict";
let numArray = [4, 6, 5, -10, 8, 5, 20];
let sum = 10;
for (let i = 0; i < numArray.length; i++) {
    for (let j = i + 1; j < numArray.length; j++) {
        if ((numArray[i] + numArray[j]) == sum) {
            console.log(numArray[i] + " + " + numArray[j] + " = " + sum);
        }
    }
}
