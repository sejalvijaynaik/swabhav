var app = angular.module("studentApp", []);
    
app.factory("APIFactory", function($http){
    var student = {};
    var students = [];
    $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/")
        .then(function(response){
            for(var i = 0; i < response.data.length; i++){
                student = response.data[i];
                students.push(student);
            }
        });
    return students;
});

app.factory("LocalStorageFactory", function(){
    function StudentCreate(rollNo, name, age, email, date, isMale, id){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.email = email;
        this.date = date;
        this.isMale = isMale;
        this.id = id;
    }

    var student1 = new StudentCreate(20, "rachel", 25, "rachel@gmail.com", "12/22/2000", false, "fjq3f9j93");
    var student2 = new StudentCreate(20, "ross", 25, "ross@gmail.com", "11/23/2000", true, "ngfw39");
    var student3 = new StudentCreate(20, "joey", 25, "joey@gmail.com", "09/23/2000", true, "iwn3goi3wgn");
    var student4 = new StudentCreate(20, "chandler", 25, "chandler@gmail.com", "08/15/2000", true, "w3go4jg9");
    var student5 = new StudentCreate(20, "monica", 25, "monica@gmail.com", "07/26/2000", false, "kwn4g93");

    var students = [student1, student2, student3, student4, student5];
    localStorage.setItem("students", JSON.stringify(students));
});

app.controller("studentApiController", function($scope, APIFactory) {
    $scope.loadFromApi = function(){
        $scope.studentsFromApi = APIFactory; 
    };
});

app.controller("studentLoaclStorageController", function($scope){
    $scope.loadFromLocalStorage = function(){
    $scope.studentsFromLocalStorage = JSON.parse(localStorage.getItem("students"));
    };
});
