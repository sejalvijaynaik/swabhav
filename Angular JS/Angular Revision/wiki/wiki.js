var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/home", {
        templateUrl : "home.html",
        controller : "homeController"
    });
});

app.controller("homeController", function($scope){
    $scope.msg = "I am inside home";
});
