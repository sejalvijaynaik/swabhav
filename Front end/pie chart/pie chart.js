var canvas = document.getElementById("piechart");
var circle = canvas.getContext("2d");

var cx = 100;
var cy = 100;
var radius = 100;
var noOfSectors = 5;
var sectorAngle = (2* Math.PI)/noOfSectors
var sectorStartAngle = 0;
var sectorEndAngle = sectorAngle;
var midAngle;
var colors = ["red", "blue", "green", "black", "yellow"];

for(i = 1; i <= noOfSectors; i++){    
    circle.beginPath();
    circle.arc(cx, cy, radius, sectorStartAngle, sectorEndAngle);
    circle.stroke();

    circle.lineTo(cx,cy);
    circle.stroke();

    circle.fillStyle = colors[i - 1];
    circle.fill();

    var percent = (sectorEndAngle - sectorStartAngle)/(2*Math.PI) * 100;

    var myParas = document.getElementById("checkboxes");
    var paraElement = document.createElement("p");
    paraElement.innerHTML = colors[i - 1] + " " + percent + "%";
    myParas.appendChild(paraElement);
    
    sectorStartAngle = sectorEndAngle;
    sectorEndAngle = sectorEndAngle + sectorAngle;
}
    

