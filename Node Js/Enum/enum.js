"use strict";
var colors;
(function (colors) {
    colors["red"] = "red";
    colors["blue"] = "blue";
    colors["green"] = "green";
})(colors || (colors = {}));
console.log(colors.red);
console.log(colors.blue);
console.log(colors.green);
console.log(colors);
console.log(typeof colors);
let c = colors.green;
console.log(c);
console.log(typeof c);
