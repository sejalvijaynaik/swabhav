function f1(){
    alert("I am f1");
}
function f2(){
    alert("i am f2");
}
f1();
//var setTime = setTimeout(f2, 2000);
//clearTimeout(setTime);
var setInter = setInterval(f2, 2000);
clearInterval (setInter);
