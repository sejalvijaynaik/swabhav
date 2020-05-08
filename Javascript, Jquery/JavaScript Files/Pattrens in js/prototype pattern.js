function Employee (id,name) {
    this.id=id
    this.name=name
}

Employee.prototype.getDetails= function () {
    return "Id: "+this.id+" Name: "+this.name
}
var e1 = new Employee(1,"Abc")
console.log(e1)
console.log(e1.getDetails())
console.log(Employee.prototype==e1.__proto__)//true
console.log(e1.__proto__);
console.log(Employee.prototype);

var e2 = new Employee(2,"Def")
console.log(e2)

console.log(Employee.prototype==e2.__proto__) //true

console.log(e1.__proto__==e2.__proto__) //true

console.log(Employee.prototype.__proto__) // object
console.log(Object.prototype.__proto__)//?? null

console.log(Employee.prototype.__proto__==Object.prototype)//??

console.log(Object.prototype);
