"use strict";
var customer1 = {
    firstName: "sejal",
    lastName: "naik",
    balance: 500.00,
    descripton: "savings account",
    printInfo: function () {
        return this.firstName + " " + this.lastName + " has " + this.balance + " in her " + this.descripton;
    }
};
console.log(customer1.printInfo());
