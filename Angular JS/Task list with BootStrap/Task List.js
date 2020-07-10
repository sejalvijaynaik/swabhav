var app = angular.module("taskListApp", []);
app.controller("taskListController", function($scope){

    $scope.taskArray = [];
    
    $scope.taskAdd = function(){
        var task = {};
        task.taskDesc = $scope.inputTask;
        task.done = false;

        $scope.taskArray.push(task);
        $scope.inputTask = '';
    };
    $scope.taskDone = function(item){
       if(item.done == false){
           item.done = true;
       }
       else if(item.done == true){
           item.done = false;
        }  
    };
    $scope.taskRemove = function(item){
        $scope.taskArray.splice(item, 1);
    };
});