var counterApp = angular.module("blueBallApp", []);

counterApp.controller("blueBallController", function($scope){
   $scope.startGame = function(){
    
    var $ballsDiv = $("#balls");
    $ballsDiv.empty();
    $scope.ballsArray = [];
    $scope.correctBall = Math.floor(Math.random() * 50);
    $scope.attempts = 4;
    for(i = 0; i < 50; i++){
        $ballsDiv.append("<span id = " + i + " class = 'circle'></span>");
        $scope.ballsArray[i] = $("#" + i);
        $("#" + i).click($scope.ballColorChange);
        }
   };

   $scope.ballColorChange = function(){
    $scope.attempts = $scope.attempts - 1;
    if($(this).attr("id") == $scope.correctBall){
        $(this).css("background", "radial-gradient(circle at 30px 30px, powderblue, darkblue)");
        $scope.endGame("Congratulations you won !!!!!");
    }
    else if($(this).attr("id") > $scope.correctBall){
        $(this).css("background", "radial-gradient(circle at 30px 30px, palegreen, chartreuse)");
    }
    else if($(this).attr("id") < $scope.correctBall){
        $(this).css("background", "radial-gradient(circle at 30px 30px, lightsalmon, red)");
    }
    if($scope.attempts == 0){
        $scope.ballsArray[$scope.correctBall].css("background", "radial-gradient(circle at 30px 30px, powderblue, darkblue)");
        $scope.endGame("You Lost !!!!!")
    }
   }
   $scope.endGame = function(message){
    
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
});