/*function f1(){
    console.log("i am f1");
}

function f2(){
    console.log("i am f2");
}

function f3(){
    console.log("i am f3");
}

var functions = [f1, f2, f3];
functions[1]();*/

var functions = [function(){
    console.log("i am f1");
},
function(){
    console.log("i am f2");
},
function(){
    console.log("i am f3");
}]

functions[0]();