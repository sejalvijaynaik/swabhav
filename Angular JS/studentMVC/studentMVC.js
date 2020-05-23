var app = angular.module("studentApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/home", {
        templateUrl : "fragments/home.html",
        controller : "homeController"
    })
    .when("/add", {
        templateUrl : "fragments/add.html",
        controller : "addController"
    })
    .when("/search", {
        templateUrl : "fragments/search.html",
        controller : "searchController"
    });
});

app.factory("GetFactory", function($http){
    var student = {};
    var students = [];
    console.log("Inside getfactory");
    $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/")
        .then(function(response){
            for(var i = 0; i < response.data.length; i++){
                student = response.data[i];
                students.push(student);
                console.log(student);
            }
        });
    return students;
});

app.controller("homeController", function($scope, GetFactory){
    $scope.getStudents = function(){
        $scope.displayStudents = GetFactory;
        console.log("value of displayStudents");
        console.log($scope.displayStudents);
    }
    $scope.getStudents();
});
app.controller("addController", function($scope){
    $scope.msg = "I am inside about";
});
app.controller("searchController", function($scope){
    $scope.msg = "I am inside career";
});