var hexcodes = ["#FF0000", "#0000FF", "#00FF00", "#FFFF00"];

$("#selecedColor").click(function(){
    alert(hexcodes[$("#colors").prop("selectedIndex")]);
});