var count = 0;
document.getElementById("startButton").addEventListener("click", startCount);
document.getElementById("stopButton").addEventListener("click", stopcount);

function startCount(){
    for(i = 0; ;i++){
        count = count + 1;
        document.getElementById("counter").innerHTML = count;
    }
}

function stopcount(){
    count = 0;
}