class Customer {
    private _firstName : string;
    private _lastName: string;

    constructor(firstName : string, lastName : string){
        this._firstName = firstName;
        this._lastName = lastName;
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
}

let myCustomer = new Customer("sejal", "naik");

console.log(myCustomer.firstName);
console.log(myCustomer.lastName);