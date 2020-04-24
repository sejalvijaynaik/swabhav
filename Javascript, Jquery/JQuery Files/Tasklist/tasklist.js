$("#addTaskButton").click(createTask);

showLists();

function showLists(){
    var count = 0; 
    for(var a in localStorage){
        if(!isNaN(a)){
            if(!(localStorage[a].substring(0,7) === "crossed")){
                count = count + 1;

                $("#taskTable tbody").append("<tr></tr>");

                $("#taskTable tbody tr:last").append("<td><input type='checkbox' value=" + a +"></td>");

                $("input[type = 'checkbox'][value = "+ a + "]").click(CrossTask);

                $("#taskTable tbody tr:last").append("<td>" + localStorage[a] + "</td>");

                $("#taskTable tbody tr:last").append("<td><button value =" + a + ">Remove</button></td>");

                $("button[value =" + a + "]").click(removeTaskFunction);
            }
        }    
    }

    for(var a in localStorage){
        if(!isNaN(a)){

            if(localStorage[a].substring(0,7) === "crossed"){

                count = count + 1;

                $("#CompletedTaskTable tbody").append("<tr></tr>");

                $("#CompletedTaskTable tbody tr:last").append("<td><input type='checkbox' value=" + a +" checked = 'true'></td>");

                $("input[type = 'checkbox'][value = " + a + "]").click(CrossTask);

                $("#CompletedTaskTable tbody tr:last").append("<td style = 'text-decoration: line-through'>" + localStorage[a].substring(7) + "</td>");

                $("#CompletedTaskTable tbody tr:last").append("<td><button value =" + a + ">Remove</button></td>");

                $("button[value =" + a +"]").click(removeTaskFunction);

                $("#CompletedTaskTable tbody tr:last").append("<td>" + localStorage[a + "date"] + "</td>");
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
    var taskText = $("#task").val();
    if(taskText == ""){
        window.open("tasklist.html", "_self");
        return;
    }
    localStorage.tasks = Number(localStorage.tasks) + 1;
    localStorage.setItem(localStorage["tasks"], taskText);
    window.open("tasklist.html", "_self");
}

function CrossTask(){
    if ($(this).is(":checked") == true){
        localStorage[$(this).val()] = "crossed" + localStorage[$(this).val()];
        var d = new Date();
        localStorage[$(this).val() + "date"] = d.toString();
        window.open("tasklist.html", "_self");
    }
    else if ($(this).is(":checked") == false){
        localStorage[$(this).val()] = localStorage[$(this).val()].substring(7);
        localStorage.removeItem($(this).val() + "date");
        window.open("tasklist.html", "_self");
    }
}

function removeTaskFunction(){
    localStorage.removeItem($(this).val());
    localStorage.removeItem($(this).val() + "date");
    window.open("tasklist.html", "_self");
}
