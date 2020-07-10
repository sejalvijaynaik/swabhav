"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var GolfCoach_1 = require("./GolfCoach");
var CricketCoach_1 = require("./CricketCoach");
var golfCoach = new GolfCoach_1.GolfCoach();
var cricketCoach = new CricketCoach_1.CricketCoach();
var coachArray = [];
coachArray.push(golfCoach);
coachArray.push(cricketCoach);
for (var _i = 0, coachArray_1 = coachArray; _i < coachArray_1.length; _i++) {
    var tempCoach = coachArray_1[_i];
    console.log(tempCoach.getDailtWorkout());
}
