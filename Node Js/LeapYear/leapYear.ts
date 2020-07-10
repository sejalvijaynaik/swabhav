function LeapYearOrNot(year:number):boolean{
    if(year % 4 == 0){
        return true;
    }
    return false;
}

console.log(LeapYearOrNot(2001));

