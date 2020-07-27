"use strict";
class Student {
    constructor(rollNo, name) {
        this._rollNo = rollNo;
        this._name = name;
    }
}
let student = new Student(10, "sejal");
console.log(student._rollNo);
console.log(student._name);
//student._rollNo = 20;
//# sourceMappingURL=readOnlyClass.js.map