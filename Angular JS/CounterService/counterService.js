var counterApp = angular.module("counterApp", []);

counterApp.factory("countFactory", function(){
    var countInFactory = 0;
    var countObj = {};
    countObj.increment = function(){
        countInFactory = countInFactory + 1;
    };

    countObj.decrement = function(){
        countInFactory = countInFactory - 1;
    };

    countObj.getCount = function(){
        return countInFactory;
    } 
    return countObj;   
});

counterApp.controller("incrementController", function($scope, $rootScope, countFactory){
    $rootScope.getCount = countFactory.getCount();
    $scope.increment = function(){
        countFactory.increment();
        $rootScope.getCount = countFactory.getCount();
    };
});

counterApp.controller("decrementController", function($scope, $rootScope, countFactory){
    $rootScope.getCount = countFactory.getCount();
    $scope.decrement = function(){
        countFactory.decrement();
        $rootScope.getCount = countFactory.getCount();
    };  
});
