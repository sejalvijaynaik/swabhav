var counterApp = angular.module("counterApp", []);

counterApp.service("countService", function(){
    
    this.increment = function(num){
        return num + 1;
    };

    this.decrement = function(num){
        return num - 1;
    };
});

counterApp.controller("incrementController", function($scope, countService){
    $scope.getCount = 0;
    $scope.increment = function(){
        $scope.getCount = countService.increment($scope.getCount);
    };
});

counterApp.controller("decrementController", function($scope, countService){
    $scope.getCount = 0;
    $scope.decrement = function(){
        $scope.getCount = countService.decrement($scope.getCount);
    };
});
