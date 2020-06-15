var counterApp = angular.module("blueBallApp", []);

counterApp.controller("blueBallController", function($scope){
   $scope.startGame = function(){
        $scope.balls = angular.element(document.getElementById("balls"));
        $scope.ballArray = [];
        $scope.correctBall = Math.floor(Math.random() * 50);
        $scope.attempts = 4;
        for(i = 0; i < 50; i++){
            $scope.ball = {};
            $scope.balls.append("<span id = " + i + " class = 'circle'></span>");
            $scope.ball = angular.element(document.getElementById("i"));
            $scope.ball.bind("click", ballColorChange);
            $scope.ballArray.push($scope.ball);
        }
        console.log($scope.ballArray[0].id);
        function ballColorChange(){
            alert("color change");
        }

   };
   
});