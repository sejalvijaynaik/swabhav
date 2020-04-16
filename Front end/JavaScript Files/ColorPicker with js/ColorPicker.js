document.getElementById("selecedColor").addEventListener("click", printHexColor);
var hexcodes = ["#FF0000", "#0000FF", "#00FF00", "#FFFF00"];

function printHexColor(){

    var colors = document.getElementById("colors");
    alert(hexcodes[colors.selectedIndex]);
}