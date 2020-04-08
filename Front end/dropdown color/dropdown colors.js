var colors = document.getElementById("colors");

document.getElementById("selecedColor").addEventListener("click", changeColorClick);
colors.addEventListener("mouseover", changeColorMouseOver);

function changeColorClick(){
    var value = colors[colors.selectedIndex].value;
    document.getElementById("heading").style.color = value;
}

function changeColorMouseOver(){

    document.body.style.backgroundColor = "red";

}



