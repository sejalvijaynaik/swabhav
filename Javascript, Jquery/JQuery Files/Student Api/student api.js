var actualUrl = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";
var updateId;

$("#addStudent").click(addStudent);
$("#updateStudent").click(updateStudent);

getStudents();
function getStudents(){
    $.ajax({ type: "GET", url: actualUrl, success: function(result){

        $("#displayTable tbody").empty();
        $("#displayTable tbody").append("<tr></tr>");
        $("#displayTable tbody tr:last").append("<th>Roll No</th>");
        $("#displayTable tbody tr:last").append("<th>Name</th>");
        $("#displayTable tbody tr:last").append("<th>Age</th>");
        $("#displayTable tbody tr:last").append("<th>Email ID</th>");
        $("#displayTable tbody tr:last").append("<th>Date</th>");
        $("#displayTable tbody tr:last").append("<th>isMale</th>");
        $("#displayTable tbody tr:last").append("<th>ID</th>");
        $("#displayTable tbody tr:last").append("<th>Update</th>");
        $("#displayTable tbody tr:last").append("<th>Delete</th>");

        for(var i = 0; i < result.length; i++){
            $("#displayTable tbody").append("<tr></tr>");
            $("#displayTable tbody tr:last").append("<td>" + result[i].rollNo + "</td>");
            $("#displayTable tbody tr:last").append("<td>" + result[i].name + "</td>");
            $("#displayTable tbody tr:last").append("<td>" + result[i].age + "</td>");
            $("#displayTable tbody tr:last").append("<td>" + result[i].email + "</td>");
            $("#displayTable tbody tr:last").append("<td>" + result[i].date + "</td>");
            $("#displayTable tbody tr:last").append("<td>" + result[i].isMale + "</td>");
            $("#displayTable tbody tr:last").append("<td>" + result[i].id + "</td>");
            $("#displayTable tbody tr:last").append("<td><button value = update" + result[i].id + ">Update</button></td>");
            $("button[value = update" + result[i].id + "]").click(updateDetails);
            $("#displayTable tbody tr:last").append("<td><button value = delete" + result[i].id + ">Delete</button></td>");
            $("button[value = delete" + result[i].id + "]").click(deleteStudent);
        }    
    }});
}

function addStudent(){
    var rollNo = $("#studentRollNo").val();
    var rollNoInNum = parseInt(rollNo);

    var name = $("#studentName").val();

    var  age = $("#studentAge").val();
    var ageInNum = parseInt(age);

    var email = $("#studentEmail").val();

    var date = $("#studentDate").val();

    var isMale = $('input[name="isMale"]:checked').attr("id");
    var isMaleInBoolean = (isMale == "true");
    
    $.ajax({
        url: actualUrl,
        type: 'POST',    
        data: {
            "rollNo": rollNoInNum,
            "name": name,
            "age": ageInNum,
            "email": email,
            "date": date,
            "isMale": isMaleInBoolean
        },
        dataType: 'json',
        success: function(result) {  
            window.open("student api.html", "_self");  
        }
    });

    $("#studentRollNo").val("");
    $("#studentName").val("");
    $("#studentAge").val("");
    $("#studentEmail").val("");
    $("#studentDate").val("");
    $('input[name="isMale"]:checked').prop('checked', false);
}

function updateDetails(){

    var id = $(this).val().substring(6);
    updateId = id;
    var completeUrl = actualUrl + id;
    $.ajax({ type: "GET", url: completeUrl, success: function(result){
        var text = JSON.stringify(result);
        textActual = text.substring(1, text.length-1);
        var studentObject = JSON.parse(textActual);
        
        $("#studentRollNo").val(studentObject.rollNo);
        $("#studentName").val(studentObject.name);
        $("#studentAge").val(studentObject.age);
        $("#studentEmail").val(studentObject.email);
        $("#studentDate").val(studentObject.date);
        if(studentObject.isMale == true){
            $("#true").prop("checked", true);
        }
        else if(studentObject.isMale == false){
            $("#false").prop("checked", true);
        }
    }});
}

function updateStudent(){
    var rollNo = $("#studentRollNo").val();
    var rollNoInNum = parseInt(rollNo);

    var name = $("#studentName").val();

    var  age = $("#studentAge").val();
    var ageInNum = parseInt(age);

    var email = $("#studentEmail").val();

    var date = $("#studentDate").val();

    var isMale = $('input[name="isMale"]:checked').attr("id");
    var isMaleInBoolean = (isMale == "true");

    var completeUrl = actualUrl + updateId;
    
    $.ajax({
        url: completeUrl,
        type: 'PUT',    
        data: {
            "rollNo": rollNoInNum,
            "name": name,
            "age": ageInNum,
            "email": email,
            "date": date,
            "isMale": isMaleInBoolean
        },
        dataType: 'json',
        success: function(result) {  
            window.open("student api.html", "_self");
        }
    });
    $("#studentRollNo").val("");
    $("#studentName").val("");
    $("#studentAge").val("");
    $("#studentEmail").val("");
    $("#studentDate").val("");
    $('input[name="isMale"]:checked').prop('checked', false);
}

function deleteStudent(){

    var id = $(this).val().substring(6);
    var completeUrl = actualUrl + id;
    $.ajax({ type: "DELETE", url: completeUrl, success: function(result){
        window.open("student api.html", "_self");
    }});
}
