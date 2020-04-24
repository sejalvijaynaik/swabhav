/*var foo;
console.log("no value to foo");
console.log(foo); 
console.log(typeof foo);

foo = 'sonam'
console.log("foo is string");
console.log(foo);
console.log(typeof foo);

foo = 20;
console.log("foo is number");
console.log(foo);
console.log(typeof foo); 

foo = true;
console.log("foo is boolean");
console.log(foo);
console.log(typeof foo);

foo = [];
console.log("foo is array");
console.log(foo);
console.log(typeof foo);

foo = {};
console.log("foo is object");
console.log(foo);
console.log(typeof foo);

foo = function () {
};
console.log("foo is function");
console.log(foo);
console.log(typeof foo); 

var foo;
console.log("foo is window.foo");
console.log(foo == window.foo);

console.log("window log");
console.log(window);

console.log("document is window.document");
console.log(document == window.document);

console.log("location is window.location");
console.log(location == window.location);

console.log("this is window");
console.log(this == window) 

console.log("type of window");
console.log(typeof window)

console.log("console is window.console");
console.log(console == window.console);*/

function Car(name){
    this.name = name;
    console.log(this);
}

var beat = new Car("beat");
var hondacity = new Car("hondacity");
console.log(beat.name);
