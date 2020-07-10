import { Coach } from "./Coach";

export class CricketCoach implements Coach{
    getDailtWorkout(): string {
        return "Cricket coach training";
    }
}