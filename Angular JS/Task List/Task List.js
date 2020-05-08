var app = angular.module("taskListApp", []);
app.controller("taskListController", function($scope){

    $scope.taskArray = [];
    /*$scope.textDecorate = {
        "text-decoration" : "line-through"
    };*/
    $scope.taskAdd = function(){
        var task = {};
        task.taskDesc = $scope.inputTask;
        task.done = false;

        $scope.taskArray.push(task);
        $scope.inputTask = '';
    };
    $scope.taskDone = function(item){
        if(item == true){
            
        }
    };
});