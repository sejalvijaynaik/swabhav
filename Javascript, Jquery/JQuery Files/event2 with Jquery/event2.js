$(document).ready(function(){

    $("#redButton").click(printColor);
    $("#blueButton").click(printColor);

    function printColor(){
        alert($(this).html());
    }
});
