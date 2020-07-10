"use strict";
function LeapYearOrNot(year) {
    if (year % 4 == 0) {
        return true;
    }
    return false;
}
console.log(LeapYearOrNot(2001));
