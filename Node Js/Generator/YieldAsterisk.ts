function* anotherGenerator(num:number){
    yield num + 1;
    yield num + 2;
    yield num + 3;
}

function* generator(num:number){
    yield num;
    yield* anotherGenerator(num);
    yield num + 1;
}

let myGen = generator(10);

console.log(myGen.next().value);
console.log(myGen.next().value);
console.log(myGen.next().value);
console.log(myGen.next().value);
console.log(myGen.next().value);
console.log(myGen.next().value);
