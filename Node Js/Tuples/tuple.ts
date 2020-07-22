var myTuple : [number, string, boolean] = [10, "sejal", true];

for(let i = 0; i < myTuple.length; i++){
    console.log(myTuple[i]);
}

myTuple[0] = 20;

for(let i = 0; i < myTuple.length; i++){
    console.log(myTuple[i]);
}

myTuple.pop();

for(let i = 0; i < myTuple.length; i++){
    console.log(myTuple[i]);
}

myTuple.push("naik");

for(let i = 0; i < myTuple.length; i++){
    console.log(myTuple[i]);
}

