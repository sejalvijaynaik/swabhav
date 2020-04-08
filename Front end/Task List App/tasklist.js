document.getElementById("addTaskButton").addEventListener("click", createTask);

showLists();

function showLists(){
    var count = 0; 
    for(var a in localStorage){
        if(!isNaN(a)){
            if(!(localStorage[a].substring(0,7) === "crossed")){
                count = count + 1;

                var taskTable = document.getElementById("taskTable");
                var row = document.createElement("tr");
                taskTable.appendChild(row);

                var taskDone = document.createElement("td");
                row.appendChild(taskDone);

                var taskCheckBox = document.createElement("input");
                taskCheckBox.type = "checkBox";
                taskCheckBox.value = a;
                taskCheckBox.addEventListener("click", CrossTask);
                taskDone.appendChild(taskCheckBox);

                var taskDesc = document.createElement("td");
                taskDesc.innerHTML = localStorage[a];
                taskDesc.id = a;
                row.appendChild(taskDesc);
            
                var removeTask = document.createElement("td");
                row.appendChild(removeTask);
            
                var removeButton = document.createElement("button");
                removeButton.value = a;
                removeButton.innerHTML = "Remove";
                removeButton.addEventListener("click", removeTaskFunction);
                removeTask.appendChild(removeButton);
            }
        }    
    }

    for(var a in localStorage){
        if(!isNaN(a)){

            if(localStorage[a].substring(0,7) === "crossed"){

                count = count + 1;

                var completeTaskTable = document.getElementById("CompletedTaskTable");
                var completedRow = document.createElement("tr");
                completeTaskTable.appendChild(completedRow);

                var completedTaskDone = document.createElement("td");
                completedRow.appendChild(completedTaskDone);
                var completedTaskCheckBox = document.createElement("input");
                completedTaskCheckBox.type = "checkBox";
                completedTaskCheckBox.value = a;
                completedTaskCheckBox.checked = true;
                completedTaskCheckBox.addEventListener("click", CrossTask);
                completedTaskDone.appendChild(completedTaskCheckBox);

                var completedTaskDesc = document.createElement("td");
                completedTaskDesc.innerHTML = localStorage[a].substring(7);
                completedTaskDesc.style.textDecoration = "line-through";
                completedTaskDesc.value = a;
                completedRow.appendChild(completedTaskDesc);

                var completedRemoveTask = document.createElement("td");
                completedRow.appendChild(completedRemoveTask);

                var completedRemoveButton = document.createElement("button");
                completedRemoveButton.value = a;
                completedRemoveButton.innerHTML = "Remove";
                completedRemoveButton.addEventListener("click", removeTaskFunction);
                completedRemoveTask.appendChild(completedRemoveButton);

                var completedDate = document.createElement("td");
                completedDate.innerHTML = localStorage[a + "date"];
                completedRow.appendChild(completedDate);
                
            }
        }
    }

    if(count == 0){
        delete localStorage.tasks;
        localStorage.clear();
    }
}

function createTask(){
 
    if(localStorage.tasks == undefined){
        localStorage.tasks = "0";
    }
    var taskText = document.getElementById("task").value;
    if(taskText == ""){
        window.open("tasklist.html", "_self");
        return;
    }
    localStorage.tasks = Number(localStorage.tasks) + 1;
    localStorage.setItem(localStorage["tasks"], taskText);
    window.open("tasklist.html", "_self");
}

function CrossTask(e){
    var targetCheckBox = e.target;
    if (targetCheckBox.checked == true){
        localStorage[targetCheckBox.value] = "crossed" + localStorage[targetCheckBox.value];
        var d = new Date();
        localStorage[targetCheckBox.value + "date"] = d.toString();
        window.open("tasklist.html", "_self");
    }
    else if (targetCheckBox.checked == false){
        localStorage[targetCheckBox.value] = localStorage[targetCheckBox.value].substring(7);
        localStorage.removeItem(targetCheckBox.value + "date");
        window.open("tasklist.html", "_self");
    }
}

function removeTaskFunction(e){
    var removeTaskButton = e.target;
    localStorage.removeItem(removeTaskButton.value);
    window.open("tasklist.html", "_self");
}
