"use strict";
let displaycolr = function (message, ...colors) {
    console.log(message);
    for (let i of colors) {
        console.log(i);
    }
};
let myMessage = "list of colors";
displaycolr(myMessage, "red");
//displaycolr(myMessage,"red", "blue");
//displaycolr(myMessage,"red", "blue", "green");
