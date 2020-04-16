console.log("before function declaration");
f1();

function f1(){

    for(var i =1; i<= 10; i++){
        console.log(i);
    }  
    console.log("i am outside the loop" + i);
}

console.log("now i am outside the function");
f1();

(function(){
    for(var i =1; i<= 10; i++){
        console.log(i);
    }  
})();




