"use strict";
var CustomerWithParam = /** @class */ (function () {
    function CustomerWithParam(_firstName, _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
    }
    Object.defineProperty(CustomerWithParam.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (value) {
            this._lastName = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(CustomerWithParam.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        set: function (firstName) {
            this._firstName = firstName;
        },
        enumerable: false,
        configurable: true
    });
    return CustomerWithParam;
}());
var myCustomerWithParam = new CustomerWithParam("sejal", "naik");
console.log(myCustomerWithParam.firstName);
console.log(myCustomerWithParam.lastName);
