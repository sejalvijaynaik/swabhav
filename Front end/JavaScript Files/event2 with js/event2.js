document.getElementById("redButton").addEventListener("click", printColor);
document.getElementById("blueButton").addEventListener("click", printColor);

function printColor(e){
    alert(e.target.innerHTML);
}
