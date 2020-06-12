var app = angular.module("numbersApiApp", []);
app.controller("numbersApiController", function($scope, $http){

    $scope.numbers = [];
   
    $scope.show = function(){
        for(var a in localStorage){
            if(!isNaN(a)){
               $scope.number = {};
               $scope.number.desc = localStorage[a];
               $scope.number.date = moment(localStorage[a + 'date']).fromNow();
               $scope.numbers.push($scope.number);
               console.log($scope.number.desc);
               console.log($scope.number.date);
            }    
        }
    };
    $scope.show();
    
    $scope.getNumber = function(){
        console.log($scope.inputNumber);
        var url = "http://numbersapi.com/" + $scope.inputNumber;
        $http.get(url)
        .then(function(response){
            $scope.desc = response.data;
            $scope.createEntry();
        });
    };
    $scope.createEntry = function(){
        if(localStorage.entries == undefined){
            localStorage.entries = "0";
        }
        if($scope.inputNumber == ""){
            window.open("numbers api.html", "_self");
            return;
        }
        localStorage.entries = Number(localStorage.entries) + 1;
        localStorage.setItem(localStorage["entries"], $scope.desc);
        console.log(localStorage.getItem(localStorage["entries"]));
        
        localStorage[localStorage["entries"] + "date"] = new Date();
        window.open("numbers api.html", "_self");
    };
    $scope.removeAll = function(){
        delete localStorage.entries;
        localStorage.clear();
        window.open("numbers api.html", "_self");
    }; 
});