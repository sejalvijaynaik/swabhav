window.onload = function(){

var count = 0;

var button = document.getElementById("myButton");
button.addEventListener("click", incrementCounter);

var p = document.getElementById("myPara");

function incrementCounter (){
    count = count + 1;
    p.innerHTML = "You clicked me " + count + " times";
}
}