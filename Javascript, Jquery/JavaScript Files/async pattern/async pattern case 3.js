function add(a, b){

    return new Promise(function(resolve, reject){
        if((a > 0 )&&(b > 0)){
            resolve(a + b);
        }
        else{
            reject({error : "Numbers are not positive"});
        }
    });
}

add(-10, 20).then(function (result){
    console.log(result);
}).catch(function(err){
    console.log(err.error);
});

console.log("End of the program");