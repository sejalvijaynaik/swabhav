function add(a, b, fn){
    fn(a + b);
}

add(10, 20, function(r){
    console.log(r);
});

console.log("end of program");