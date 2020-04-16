
for(var i = 1; i <= 10; i++){
    $("#mainTable tbody").append("<tr></tr>");
    $("#mainTable tbody tr:last").append("<td>" + i + "</td>");
    $("#mainTable tbody tr:last").append("<td>" + i + "</td>");
    $("#mainTable tbody tr:last").append("<td>" + i + "</td>");
}

i = 1;
$("#" + i).text("lala")


/*$("#mainTable").append("<td>2</td>");
$("#mainTable").append("<td>3</td>");*/

/*$("#mainTable").append("<td>1</td>");
$("#mainTable").append("<td>2</td>");
$("#mainTable").append("<td>3</td>");*/
console.log($("#mainTable").html());
