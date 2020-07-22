"use strict";
let displaycolor = function (message, ...colors) {
    console.log(message);
    console.log(colors);
    console.log(arguments);
    for (let i in arguments) {
        console.log(arguments[i]);
    }
};
let message = "list of colors";
//displaycolor(message, "red");
//displaycolor(message, "red", "blue");
displaycolor(message, "red", "blue", "green");
