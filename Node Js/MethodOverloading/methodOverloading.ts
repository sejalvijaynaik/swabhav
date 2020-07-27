/*function addition(num1:number, num2:number):number{
    return num1 + num2;
}

function addition(num1:any, num2:any):any{
    return num1 + num2;
}*/

//case-1-----------------------------------------------------------------------------
/*function add(a:any, b:any):any;

function add(a:number, b:number): number;

function add(a: any, b:any): any {
    return a + b;
}

console.log(add("Hello ", "Sonam")); // returns "Hello Steve" 
console.log(add(10, 20)); // returns 30 */


//case-2------------------------------------------------------------------------
/*function display(a:string, b:string):void //Compiler Error: Duplicate function implementation
{
    console.log(a + b);
}

function display(a:number): void //Compiler Error: Duplicate function implementation
{
    console.log(a);
}*/

function add(num1:number, num2:string):number;

function add(num1:number, num2:number):number;

function add(num1:any, num2:any):any{
    return num1 + num2;
}

console.log(add(20, "0"));





