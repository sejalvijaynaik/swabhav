
function currentTimeCalculate() {
  
    var today = new Date();
    var h = today.getHours();
    var m = today.getMinutes();
    var s = today.getSeconds();
    var currentTime = h + ":" + m + ":" + s;
    postMessage(currentTime);
    setTimeout(currentTimeCalculate, 500);
  
}

currentTimeCalculate()