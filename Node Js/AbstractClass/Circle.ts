import { Shape } from "./Shape";

export class Circle extends Shape{
    
    constructor(theX:number, theY:number, private _radius: number){
        super(theX, theY);
    }

    public getInfo():string{
        return super.getInfo() + " radius = " + this._radius;
    }

    calculateArea(): string {
        return "Area : " + Math.PI * this._radius * this._radius;
    }
}