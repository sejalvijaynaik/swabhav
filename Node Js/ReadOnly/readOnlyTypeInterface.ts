interface IStudentable{
    rollNo : number,
    name:string
}

let myStudent2 : Readonly <IStudentable> = {
    rollNo:10,
    name:"sejal"
}

console.log(myStudent2.rollNo);
console.log(myStudent2.name);

//myStudent2.rollNo = 20;
//myStudent2.name = "sejal naik";

