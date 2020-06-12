var app = angular.module("taskListApp", []);

app.controller("taskListController", function($scope){
   
    $scope.list = function(){
        $scope.taskArray = [];
        for(var a in localStorage){
            if(!isNaN(a)){
                task = {};
    
                if(localStorage[a].substring(0,4) === "done"){
                    task.desc = localStorage[a].substring(4);
                    task.done = true;
                }
                else{
                    task.desc = localStorage[a]
                    task.done = false;
                }
    
                $scope.taskArray.push(task);
            }
        }
    }

    $scope.list();
    
    $scope.taskAdd = function(){

        if(localStorage.tasks == undefined){
            localStorage.tasks = "0";
        }
        var taskText = $scope.inputTask;
        if(taskText == undefined){
            window.open("Task list local storage.html", "_self");
            return;
        }
        localStorage.tasks = Number(localStorage.tasks) + 1;
        localStorage.setItem(localStorage["tasks"], taskText);
        $scope.inputTask = '';
        window.open("Task list local storage.html", "_self");
    };

    $scope.taskDone = function(task){
        if(task.done == false){
            for(var a in localStorage){
                if(!isNaN(a)){
                    if(task.desc === localStorage[a]){
                        localStorage[a] = "done" + localStorage[a];
                    }
                }
            }
            window.open("Task list local storage.html", "_self");
        } 
        else if(task.done == true){
            for(var a in localStorage){
                if(!isNaN(a)){
                    if(("done" + task.desc) === localStorage[a]){
                        localStorage[a] = localStorage[a].substring(4);
                    }
                }
            }
            window.open("Task list local storage.html", "_self");
        }
    };

    $scope.clearLocalStorage= function(){
        delete localStorage.tasks;
        localStorage.clear();
        window.open("Task list local storage.html", "_self");
    }

    $scope.taskRemove = function(task){
        for(var a in localStorage){
            if(!isNaN(a)){
                if(task.desc === localStorage[a]){
                    localStorage.removeItem(a);
                }
            }
        }
        window.open("Task list local storage.html", "_self");
    }
    $scope.taskUpdate = function(task){
        
    }
});

