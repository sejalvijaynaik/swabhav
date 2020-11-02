angular.module('spa.module',['ngRoute'])
.config(['$routeProvider',function ($routeProvider) {
    console.log("Inside config")
    $routeProvider.when('/',{
        templateUrl:"Fragments/home.html",
        controller:"homeController"
    })
    .when('/home', {
        templateUrl: "Fragments/home.html",
        controller: "homeController"
    })
    .when('/about', {
        templateUrl: "Fragments/about.html",
        controller: "aboutController"
    })
    .when('/career', {
        templateUrl: "Fragments/career.html",
        controller: "careerController"
    })
}])