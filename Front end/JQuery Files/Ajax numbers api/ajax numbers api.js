 var $result;
 var $input;
 showLists();

$("#submit").click(function(){
    var number = $("#numberInput").val();
    $input = number;
    var completeUrl = "http://numbersapi.com/" + number;
    $.ajax({ type: "GET", url: completeUrl, success: function(result){
        $result = result;
        createEntry();
    }});
})

function showLists(){
    var count = 0; 
    for(var a in localStorage){
        if(!isNaN(a)){
                count = count + 1;

                $("#numbersTable tbody").append("<tr></tr>");

                $("#numbersTable tbody tr:last").append("<td>" + localStorage[a] + "</td>");

                   var timeAgo = DateCalculate(localStorage[a + 'date']);
            
                $("#numbersTable tbody tr:last").append("<td>" + timeAgo + "</td>");

                $("#numbersTable tbody tr:last").append("<td><button id = 'removeButton'>REMOVE</button></td>");
            
                $removeButton = $("#removeButton");
                $removeButton.val(a);
                $removeButton.click(removeEntry);
        }    
    }
    if(count == 0){
        delete localStorage.tasks;
        localStorage.clear();
    }
    
}

function createEntry(){
 
    if(localStorage.entries == undefined){
        localStorage.entries = "0";
    }
    if($input == ""){
        window.open("ajax numbers api.html", "_self");
        return;
    }
    localStorage.entries = Number(localStorage.entries) + 1;
    localStorage.setItem(localStorage["entries"], $result);

    localStorage[localStorage["entries"] + "date"] = new Date();
    window.open("ajax numbers api.html", "_self");
}

function removeEntry(e){
    localStorage.removeItem($(this).val());
    localStorage.removeItem($(this).val() + "date");
    window.open("ajax numbers api.html", "_self");
}

function DateCalculate(oldDateInString){
    var datePrint;
    var oldDate = Date.parse(oldDateInString);
    var miliSecondsPassed = (new Date() - oldDate);
    var seconsPassed = Math.floor(miliSecondsPassed/1000);

    if(seconsPassed < 60){
        datePrint = seconsPassed + " seconds ago"; 
        return datePrint;
    }
    var minutesPassed = Math.floor(seconsPassed/60);
    if(minutesPassed < 60){
        datePrint = minutesPassed + " minutes ago";
        return datePrint;
    }
    var hoursPassed = Math.floor(minutesPassed/60);
    if(hoursPassed < 24){
        datePrint = hoursPassed + " hours ago";
        return datePrint;
    }
    var daysPassed = Math.floor(hoursPassed/24);
    if(daysPassed < 30){
        datePrint = daysPassed + " days ago";
        return datePrint;
    }
    var monthsPassed = Math.floor(daysPassed/30);
    if(monthsPassed < 12){
        datePrint = monthsPassed + " months ago";
        return datePrint;
    }
    var yearsPassed = Math.floor(monthsPassed/12);
    datePrint = yearsPassed + " years passed";
    return datePrint;
}