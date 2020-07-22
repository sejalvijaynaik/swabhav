class Person {

    constructor(private _firstName : string, private _lastName : string, private _age : number, private _height:number, private _weight:number){
    
    }

    public get age(): number {
        return this._age;
    }
    public set age(age: number) {
        this._age = age;
    }

    public get height(): number {
        return this._height;
    }
    public set height(height: number) {
        this._height = height;
    }

    public get weight(): number {
        return this._weight;
    }
    public set weight(weight: number) {
        this._weight = weight;
    }
    public get lastName(): string {
        return this._lastName;
    }
    public set lastName(value: string) {
        this._lastName = value;
    }

    public get firstName() : string{
        return this._firstName;
    }

    public set firstName(firstName : string) {
        this._firstName = firstName;
    }

    youngOrOld():string{
        if(this._age > 50){
            return "Old";
        }
        else{
            return "Young";
        }
    }
    calculateBMI():string{
        let bmi:number = this._weight/(Math.pow((this._height/100),2));
		if(bmi < 18.5)
			return "Underweight";
		if(bmi >= 18.5 && bmi < 24.9)
			return "Healthy";
		if(bmi >=24.9 && bmi >30)
			return "Overweight";
		else{
            return "Obese";
        }
    }
}

let myPerson = new Person("sejal", "naik", 25, 152, 50);

console.log(myPerson.youngOrOld());
console.log(myPerson.calculateBMI());