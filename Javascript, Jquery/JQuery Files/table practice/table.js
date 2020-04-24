
tableCreate();
function tableCreate(){
    $("#mainTable tbody").empty();
    $("#mainTable tbody").append("<tr></tr>");
        $("#mainTable tbody tr:last").append("<th>column 1</th>");
        $("#mainTable tbody tr:last").append("<th>column 2</th>");
        $("#mainTable tbody tr:last").append("<th>column 3</th>");
    for(var i = 1; i <= 5; i++){
        $("#mainTable tbody").append("<tr></tr>");
        $("#mainTable tbody tr:last").append("<td style = 'text-decoration: line-through'>" + i + "</td>");
        $("#mainTable tbody tr:last").append("<td>" + i + "</td>");
        $("#mainTable tbody tr:last").append("<td>" + i + "</td>");
    }
    console.log($("#mainTable").html());
}

var trueInStr = "false";
var trueInBoolean = (trueInStr == "true");
alert(trueInBoolean);




/*$("#mainTable").append("<td>2</td>");
$("#mainTable").append("<td>3</td>");*/

/*$("#mainTable").append("<td>1</td>");
$("#mainTable").append("<td>2</td>");
$("#mainTable").append("<td>3</td>");*/
//console.log($("#mainTable").html());

/*for( var a in localStorage){
    console.log(a);
    console.log(localStorage[a]);
}*/

/*$("#addStudent").click(function(){
    $("#yes").prop("checked", true);
    $("#addStudent").text("lala");
    
    
})*/


