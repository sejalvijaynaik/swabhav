document.getElementById("myButton").addEventListener("click", loadDemo);

function loadDemo(){
    xttp = new XMLHttpRequest();
    xttp.onreadystatechange = function(){
        if(this.readyState == 4 && this.status == 200){
            document.getElementById("myPara").innerHTML = this.responseText;
        }
    };
    xttp.open("GET", "http://localhost/swabhav/demo.txt", false);
    xttp.send();
}