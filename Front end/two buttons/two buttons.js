var redButton =  document.getElementById("redButton");
var blueButton = document.getElementById("blueButton");

redButton.addEventListener("click", redFunction);
blueButton.addEventListener("click", blueFunction);

function redFunction(){

    document.getElementById("redButton").style.backgroundColor = "red"
}

function blueFunction(){

    document.getElementById("blueButton").style.backgroundColor = "blue";
}