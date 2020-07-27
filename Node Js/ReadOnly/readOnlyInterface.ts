interface IStudent{
    readonly rollNo : number,
    name:string
}

let myStudent : IStudent = {
    rollNo:10,
    name:"sejal"
}

console.log(myStudent.rollNo);
console.log(myStudent.name);

//myStudent.rollNo = 20;

