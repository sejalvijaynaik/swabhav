"use strict";
var arithmatic;
(function (arithmatic) {
    function add(num1, num2) {
        return num1 + num2;
    }
    arithmatic.add = add;
    function subtract(num1, num2) {
        return num1 - num2;
    }
    arithmatic.subtract = subtract;
    function multiply(num1, num2) {
        return num1 * num2;
    }
    arithmatic.multiply = multiply;
})(arithmatic || (arithmatic = {}));
