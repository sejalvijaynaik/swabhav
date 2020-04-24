/*var colors = document.getElementById("colors");

document.getElementById("selecedColor").addEventListener("click", changeColorClick);
colors.addEventListener("mouseover", changeColorMouseOver);

function changeColorClick(){
    var value = colors[colors.selectedIndex].value;
    document.getElementById("heading").style.color = value;
}

function changeColorMouseOver(){

    document.body.style.backgroundColor = "red";

}*/

/*$("#selecedColor").click(function(){
    var changedColor = $("#colors").val();
    $("#heading").css("color", changedColor);
});*/

/*$("#colors option").each(function() {
    $(this).hover(function(){
        $("#heading").css("color", "blue");
    }, function(){
        $("#heading").css("color", "black");
    });
});*/



/*$("#colors option").hover(function(){
    $("#heading").css("color", "blue");
}, function(){
    $("#heading").css("color", "black");
});*/

/*$("#colors").hover(function (e)
{
     var $target = $(e.target); 
     if($target.is('option')){
         alert($target.attr("id"));//Will alert id if it has id attribute
         alert($target.text());//Will alert the text of the option
         alert($target.val());//Will alert the value of the option
     }
});*/

/*$("option").hover(function(){
    $("#heading").css("color", "blue");
}, function(){
    $("#heading").css("color", "black");
});*/

$("#colors").mouseover(function(){
    var n = $("#colors option").length;
    $(this).attr("size", n);
});
$("#colors").mouseout(function(){
    $(this).attr("size", 1);
});
$("#colors").on('mouseenter','option',function(e) {
    var $target = $(e.target);
    $("#heading").css("color", $target.val());

});
$("#colors").on('mouseleave','option',function(e) {
    var $target = $(e.target);
    $("#heading").css("color", "black");

});






