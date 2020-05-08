var ngClickApp = angular.module('ngClickApp', [])
ngClickApp.controller('ngClickController', function($scope) {
    $scope.count = 0;
    $scope.incrementCount = function() {
     $scope.count = $scope.count + 1;
    };
    $scope.decrementCount = function() {
        $scope.count = $scope.count - 1;
       };
  });
