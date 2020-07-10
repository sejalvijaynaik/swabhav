class Rectangle {
    private _width: number;
    private _length: number;

    public get length(): number {
        return this._length;
    }
    public set length(value: number) {
        this._length = value;
    }
    public get width(): number {
        return this._width;
    }
    public set width(value: number) {
        this._width = value;
    }
    
    constructor(width:number, length:number){
        this._width = width;
        this._length = length;
    }

    calculateArea() :number{
        return this._width * this._length;
    }

    
}

let rec1 = new Rectangle(10, 20);
console.log(rec1.width);
console.log(rec1.length);
console.log(rec1.calculateArea());

let rec2 = new Rectangle(20, 30);
console.log(rec2.width);
console.log(rec2.length);
console.log(rec2.calculateArea());