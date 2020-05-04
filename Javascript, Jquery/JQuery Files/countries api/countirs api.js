var actualUrl = "http://restcountries.eu/rest/v2/all";

getStudents();
function getStudents(){
    $.ajax({ type: "GET", url: actualUrl, success: function(result){

        $("#displayTable tbody").empty();
        $("#displayTable tbody").append("<tr></tr>");
        $("#displayTable tbody tr:last").append("<th>Country Name</th>");
        $("#displayTable tbody tr:last").append("<th>Capital</th>");
        $("#displayTable tbody tr:last").append("<th>Flag</th>");

        for(var i = 0; i < result.length; i++){
            $("#displayTable tbody").append("<tr></tr>");
            $("#displayTable tbody tr:last").append("<td>" + result[i].name + "</td>");
            $("#displayTable tbody tr:last").append("<td>" + result[i].capital + "</td>");
            $("#displayTable tbody tr:last").append("<td><a href = " + result[i].flag + ">Flag</a></td>");
        }    
    }});
}