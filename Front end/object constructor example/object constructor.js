function Person(firstName, lastName, age, height){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;

    this.walk = function(){
        return this.firstName + this.lastName + "walking";
    }
}

var sejal = new Person("sejal", "naik", 25, 152);
sejal.run = function(){
    return this.firstName + this.lastName + "running";
}

console.log(sejal.firstName);
console.log(sejal.lastName);
console.log(sejal.age);
console.log(sejal.height);
console.log(sejal.walk());
console.log(sejal.run());
