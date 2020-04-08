document.getElementById("fname").addEventListener("click", doSomething);
document.getElementById("male").addEventListener("mouseover", doSomething);
document.getElementById("vehicle1").addEventListener("mouseover", doSomething);

function doSomething(){
    document.body.style.backgroundColor = "red";
}