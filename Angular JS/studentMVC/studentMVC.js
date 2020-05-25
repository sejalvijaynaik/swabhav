var app = angular.module("studentApp", ["ngRoute"]);
app.config(function($routeProvider, $httpProvider) {
    $httpProvider.defaults.withCredentials = true;
    $httpProvider.defaults.useXDomain = true;
    delete $httpProvider.defaults.headers.common['X-Requested-With'];

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
    })
    .when("/update", {
        templateUrl : "update.html",
        controller : "updateController"
    });
});

/*app.all('/*', function (request, response, next) {
        response.header("Access-Control-Allow-Origin", "*");
        response.header("Access-Control-Allow-Headers", "X-Requested-With");
        response.header("Access-Control-Allow-Methods", "GET, POST", "PUT", "DELETE");
        next();
    });*/

app.factory("GetFactory", function($http){
    var getFactoryStudents = {};
    console.log("Inside getfactory");
    getFactoryStudents.getStudents = function(){
        var student = {};
        getFactoryStudents.students = [];
        $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/")
        .then(function(response){
            for(var i = 0; i < response.data.length; i++){
                student = response.data[i];
                getFactoryStudents.students.push(student);
                console.log(student);
            }
        });
    };
    return getFactoryStudents;
});

app.factory("GetOneStudentFactory", function($http){
    var studentObj = {};
    studentObj.getStudent = function(){
        studentObj.student = {};
        $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/")
        .then(function(response){
            response.data = student;
        });
    };
    return studentObj;
});

app.factory("AddFactory", function($http){
    var student = {};
    student.rolllNo = "";
    student.name = "";
    student.age = "";
    student.email = "";
    student.date = "";
    student.isMale = "";

    student.addStudent = function(){
        student.rollInNum = parseInt(student.rollNo);
        student.ageInNum = parseInt(student.age);
        student.isMaleInBoolean = (student.isMale == "true");
        $http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/", {
            "rollNo": rollNoInNum,
            "name": name,
            "age": ageInNum,
            "email": email,
            "date": date,
            "isMale": isMaleInBoolean
        }).then(function(response){
            console.log(response.data);
        });
    };
    return student;
});

app.factory("UpdateFactory", function($http){
    var student = {};
    student.id = "";
    student.rolllNo = "";
    student.name = "";
    student.age = "";
    student.email = "";
    student.date = "";
    student.isMale = "";

    student.updateStudent = function(){
        student.rollInNum = parseInt(student.rollNo);
        student.ageInNum = parseInt(student.age);
        student.isMaleInBoolean = (student.isMale == "true");
        var url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + student.id;
        $http.put(url, {
            "rollNo": rollNoInNum,
            "name": name,
            "age": ageInNum,
            "email": email,
            "date": date,
            "isMale": isMaleInBoolean
        }).then(function(response){
            console.log(response.data);
        });
    };
    return student;
});

app.controller("homeController", function($scope, GetFactory){
    $scope.getStudents = function(){
        GetFactory.getStudents();
        $scope.displayStudents = GetFactory.students;
        console.log("value of displayStudents");
        console.log($scope.displayStudents);
    }
    $scope.getStudents();
});

app.controller("addController", function($scope, AddFactory, GetFactory){
    
    $scope.addStudent = function(){
        AddFactory.rollNo = $scope.rollNo
        AddFactory.name = $scope.name;
        AddFactory.age = $scope.age;
        AddFactory.email = $scope.email;
        AddFactory.date = $scope.date;
        AddFactory.isMale = $scope.isMale;
        AddFactory.addStudent();
        GetFactory.getStudents();
    };
});
app.controller("searchController", function($scope){
    $scope.msg = "I am inside career";
});

app.controller("updateController", function($scope, GetOneStudentFactory, UpdateFactory, GetFactory){
    GetOneStudentFactory.getStudent();
    $scope.id = GetOneStudentFactory.student.id;
    $scope.rollNo = GetOneStudentFactory.student.rollNo;
    $scope.name = GetOneStudentFactory.student.name;
    $scope.age = GetOneStudentFactory.student.age;
    $scope.email = GetOneStudentFactory.student.email;
    $scope.date = GetOneStudentFactory.student.date;
    $scope.isMale = GetOneStudentFactory.student.isMale;

    $scope.updateStudent= function(){
        UpdateFactory.id = $scope.id;
        UpdateFactory.rollNo = $scope.rollNo
        UpdateFactory.name = $scope.name;
        UpdateFactory.age = $scope.age;
        UpdateFactory.email = $scope.email;
        UpdateFactory.date = $scope.date;
        UpdateFactory.isMale = $scope.isMale;
        UpdateFactory.updateStudent();
        GetFactory.getStudents();
    };
});