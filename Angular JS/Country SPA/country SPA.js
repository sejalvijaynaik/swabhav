var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider, $httpProvider) {
    $httpProvider.defaults.withCredentials = false;
    $httpProvider.defaults.useXDomain = true;
    delete $httpProvider.defaults.headers.common['X-Requested-With'];

    $routeProvider
    .when("/home", {
        templateUrl : "fragments/home.html",
        controller : "homeController"
    })
    .when("/search", {
        templateUrl : "fragments/search.html",
        controller : "searchController"
    })
});

app.factory("GetCountries", function($http){
    var country ={};
    var countries =[];
    $http.get("http://restcountries.eu/rest/v2/all")
    .then(function(response){
        for(var i = 0; i < response.data.length; i++){
            country = response.data[i];
            countries.push(country);
        }
    });
    return countries;
});

app.controller("homeController", function($scope, GetCountries){
    $scope.countries = GetCountries;
});
app.controller("searchController", function($scope, GetCountries){
    $scope.search = function(){
        if($scope.searchName != undefined){
            $scope.searchCountries = [];
            for(var i = 0; i < GetCountries.length; i++){
                searchCountry = {};
                console.log(GetCountries[i].name);
                if(GetCountries[i].name.includes($scope.searchName)){
                    searchCountry = GetCountries[i];
                    console.log($scope.searchCountry);
                    $scope.searchCountries.push(searchCountry);
                }
            }
        }
    } 
});
