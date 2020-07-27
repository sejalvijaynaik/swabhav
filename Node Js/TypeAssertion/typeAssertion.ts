/*let variable:any = 10;
console.log(typeof variable);

let varInNumber = <number> variable;
varInNumber = varInNumber + 10;
console.log(varInNumber);
console.log(typeof varInNumber);*/

/*let variable:any = 10;
console.log(typeof variable);

let varInNumber = variable as number;
varInNumber = varInNumber + 10;
console.log(varInNumber);
console.log(typeof varInNumber);*/

/*interface Student{
    name:string,
    rollNo:number
}

let student = <Student> {};
student.name = "sejal";
student.rollNo = 10;

console.log(student.name);
console.log(student.rollNo);*/

let varInString = "10";
let varInNumber:number = <number><any> varInString;
varInNumber = varInNumber + 10;
console.log(varInNumber)
console.log(typeof varInNumber);



