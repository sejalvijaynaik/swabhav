class CustomerWithParam {

    constructor(private _firstName : string, private _lastName : string){
    
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

let myCustomerWithParam = new CustomerWithParam("sejal", "naik");

console.log(myCustomerWithParam.firstName);
console.log(myCustomerWithParam.lastName);