//Person object --------------------------------------------------------------
function Person(name, age, height){
    this.name = name;
    this.age = age;
    this.height = height;
}

Person.prototype.species = "Homo sapiens";
Person.prototype.walk = function(){
    console.log(this.name + " is walking");
}

//Engineer object inheriting from Person Object --------------------------------------------------------------
function Engineer(name, age, height, position){
    Person.call(this, name, age, height)
    this.position = position;
}

Engineer.prototype = new Person();
Engineer.prototype.degree = "Engineering";
Engineer.prototype.work = function(){
    console.log(this.name + " is a coder");
}

//Sejal object inheriting from Engineer Object --------------------------------------------------------------
var sejal = new Engineer("sejal", 25, 152, "developer");

console.log(sejal.name);
console.log(sejal.age);
console.log(sejal.height);
console.log(sejal.species);
console.log(sejal.position);
sejal.walk();
sejal.work();