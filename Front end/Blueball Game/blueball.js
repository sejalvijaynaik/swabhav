document.getElementById("startGameButton").addEventListener("click", startGame);

function startGame(){
    var ballsArray = [];
    var correctBall = Math.floor(Math.random() * 50);
    var attempts = 4;
    for(i = 0; i < 50; i++){
        var ballSpan = document.createElement("SPAN");
        ballSpan.className = "circle";
        ballSpan.id = i;
        ballsArray[i] = ballSpan;
        document.getElementById("balls").appendChild(ballSpan);
        ballSpan.addEventListener("click", ballColorChange);
    }
    
    function ballColorChange(e){
        attempts = attempts - 1;
        var targetBall = e.target;
        if(targetBall.id == correctBall){
            targetBall.style.background = "radial-gradient(circle at 30px 30px, powderblue, darkblue)";
            endGame("Congratulations you won !!!!!");
        }
        else if(targetBall.id > correctBall){
            targetBall.style.background = "radial-gradient(circle at 30px 30px, palegreen, chartreuse)";
        }
        else if(targetBall.id < correctBall){
            targetBall.style.background = "radial-gradient(circle at 30px 30px, lightsalmon, red)";
        }
        if(attempts == 0){
            ballsArray[correctBall].style.background = "radial-gradient(circle at 30px 30px, powderblue, darkblue)";
            endGame("You Lost !!!!!")
        }
    }
}

function endGame(message){
    
    var newWindow = window.open("", "_blank", "width=400, height=200");
    var newDoc = newWindow.document;

        var para = newDoc.createElement("p");
        para.innerHTML = message;
        para.style.fontSize = "50px";
        newDoc.body.appendChild(para);
        var button = newDoc.createElement("button");
        button.style.width = "100px";
        button.style.height = "50px";
        button.innerHTML = "Restart";
        newDoc.body.appendChild(button);
        button.addEventListener("click", redirectParent);
        
    
    function redirectParent(){
     newWindow.opener.open("blueball.html", "_self");
     newWindow.close();
    }
 }
