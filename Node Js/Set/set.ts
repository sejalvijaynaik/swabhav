let mySet = new Set();
mySet.add(10);
mySet.add("blue");
mySet.add(true)
.add("green")
.add("black");

//let mySet = new Set(["blue", "green", "yellow"]);

/*console.log(mySet.has("red"));

mySet.delete("red");

console.log(mySet.has("red"));

console.log(mySet.size);*/

/*mySet.add("red");
console.log(mySet.size);*/

for(let entry of mySet){
    console.log(entry);
}