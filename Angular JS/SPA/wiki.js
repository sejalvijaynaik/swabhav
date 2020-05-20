var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/home", {
        templateUrl : "fragments/home.html",
        controller : "homeController"
    })
    .when("/about", {
        templateUrl : "fragments/about.html",
        controller : "aboutController"
    })
    .when("/career", {
        templateUrl : "fragments/career.html",
        controller : "careerController"
    });
});

app.controller("homeController", function($scope){
    $scope.msg = "I am inside home";
});
app.controller("aboutController", function($scope){
    $scope.msg = "I am inside about";
});
app.controller("careerController", function($scope){
    $scope.msg = "I am inside career";
});