var app = angular.module("numbersApiApp", []);
app.controller("numbersApiController", function($scope, $http){

    $http.get("http://numbersapi.com/2")
    .then(function(response){
        console.log(response.data);
    });

    console.log("end of controller");

});