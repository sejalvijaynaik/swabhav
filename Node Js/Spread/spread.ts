/*let array1 = [1,2,3,4];
let array2 = [5,6,7,8];

let combineArray = [...array1, ...array2];

for(let num in combineArray){
    console.log(num);
}*/

/*function sum(num1, num2, num3){
    console.log(num1 + num2 + num3);
}

let numbers = [1,2,3];

sum(...numbers);*/

let displaycolr1 = function (message1:string,...colors:string[]) {
    console.log(message1);
    //console.log(colors);
   // console.log(arguments)
    for (let i in colors) {
        console.log(colors[i]);

    }
}
let message1="list of colors";
let colorarray=['orange','yellow','pink']
displaycolr1(message1,colorarray);