//alert(localStorage["1date"]);

//alert(new Date() - localStorage["1date"]);
var dObj = Date.parse(localStorage["1date"]);
alert((new Date() - dObj)/1000);

