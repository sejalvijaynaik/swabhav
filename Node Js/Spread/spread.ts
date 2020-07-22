/*let array1 = [1,2,3,4];
let array2 = [5,6,7,8];

let combineArray = [...array1, ...array2];

for(let num in combineArray){
    console.log(num);
}*/

function sum(num1, num2, num3){
    console.log(num1 + num2 + num3);
}

let numbers = [1,2,3];

sum(...numbers);