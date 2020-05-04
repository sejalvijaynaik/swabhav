var w;
document.getElementById("startButton").addEventListener("click", startCount);
document.getElementById("stopButton").addEventListener("click", stopCount);

function startCount() {
  if (typeof(Worker) !== "undefined") {
    if (typeof(w) == "undefined") {
      w = new Worker("count worker.js");
    }
    w.onmessage = function(event) {
      document.getElementById("counter").innerHTML = event.data;
    };
  } else {
    document.getElementById("result").innerHTML = "Sorry! No Web Worker support.";
  }
}

function stopCount() {
  w.terminate();
  w = undefined;
}