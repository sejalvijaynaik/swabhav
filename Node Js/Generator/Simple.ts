function* idMaker(){
    let index = 1;
    while(index < 4){
        yield index;
        index = index + 1;
    }
}

let gen = idMaker();

console.log(gen.next());
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
