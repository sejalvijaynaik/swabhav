import {GolfCoach} from "./GolfCoach";
import {CricketCoach} from "./CricketCoach";
import {Coach} from "./Coach";

let golfCoach = new GolfCoach();
let cricketCoach = new CricketCoach();

let coachArray : Coach[] = [];
coachArray.push(golfCoach);
coachArray.push(cricketCoach);

for(let tempCoach of coachArray){
    console.log(tempCoach.getDailtWorkout());
}