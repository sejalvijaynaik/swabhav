class Student{
    readonly _rollNo:number;
    _name:string;

    constructor(rollNo:number, name:string){
        this._rollNo = rollNo;
        this._name = name;
    }
}

let student = new Student(10, "sejal");
console.log(student._rollNo);
console.log(student._name);

//student._rollNo = 20;