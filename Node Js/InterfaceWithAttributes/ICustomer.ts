interface ICustomer{
    firstName : string,
    lastName : string,
    balance : number,
    descripton : string,
    printInfo():string;
}

let customer1 : ICustomer = {
    firstName : "sejal",
    lastName : "naik",
    balance : 500.00,
    descripton : "savings account",
    printInfo():string{
        return this.firstName+ " " + this.lastName + " has " + this.balance + " in her " + this.descripton;
    }
}

console.log(customer1.printInfo());