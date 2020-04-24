var person ={
    firstName : "sejal",
    lastName : "naik",
    age : 25,
    height : 152,

    walk : function(){
        return this.firstName + this.lastName + "walking";

    }
};

function personDisplay(person){
    console.log(person.firstName);
    console.log(person.lastName);
    console.log(person.age);
    console.log(person.height);
    console.log(person.walk());
    console.log(person["firstName"]);
    var properties = "age";
    person["po" + "sition"] = "aalalalla"
    console.log(person.position);
}

personDisplay(person);
