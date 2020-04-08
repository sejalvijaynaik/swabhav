document.getElementById("taskButton").addEventListener("click", showText);

function showText(){
    alert(document.getElementById("task").value);
    alert(localStorage.tasks);
}
