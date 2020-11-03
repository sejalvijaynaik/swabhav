angular.module("myApp", ['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when("/home", {
                templateUrl: "home.html",
                controller: "homeController"
            });
    }])

    .controller('homeController', ['$scope', function ($scope) {
        $scope.data = "Inside Home";
    }]);

    