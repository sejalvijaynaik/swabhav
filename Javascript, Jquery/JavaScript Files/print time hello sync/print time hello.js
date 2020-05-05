var count = 0;
document.getElementById("helloButton").addEventListener("click", printHello);
document.getElementById("printTimeButton").addEventListener("click", printTime);

function printTime(){
    for(i = 0; ;i++){
        var today = new Date();
        var h = today.getHours();
        var m = today.getMinutes();
        var s = today.getSeconds();
        console.log(h + ":" + m + ":" + s);
    }
}

function printHello(){
    document.getElementById("para").innerHTML = "hello";
}