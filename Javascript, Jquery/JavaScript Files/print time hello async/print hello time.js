var w;
document.getElementById("helloButton").addEventListener("click", printHello);
document.getElementById("printTimeButton").addEventListener("click", printTime);

function printTime() {
  if (typeof(Worker) !== "undefined") {
    if (typeof(w) == "undefined") {
      w = new Worker("count worker.js");
    }
    w.onmessage = function(event) {
      document.getElementById("para").innerHTML = event.data;
    };
  } else {
    document.getElementById("para").innerHTML = "Sorry! No Web Worker support.";
  }
}

function printHello() {
  document.getElementById("para").innerHTML = "hello";
}