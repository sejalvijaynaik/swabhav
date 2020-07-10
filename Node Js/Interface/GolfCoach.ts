import { Coach } from "./Coach";

export class GolfCoach implements Coach{
    getDailtWorkout(): string {
        return "Golf coach training";
    }
}