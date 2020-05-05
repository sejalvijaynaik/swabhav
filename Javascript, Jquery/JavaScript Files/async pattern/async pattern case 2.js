function add(a, b, fn){
    setTimeout(fn(a + b), 10000)
}

add(10, 20, function(r){
    console.log(r);
});

console.log("end of program");

