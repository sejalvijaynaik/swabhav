"use strict";
class Person {
    constructor(_firstName, _lastName, _age, _height, _weight) {
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._age = _age;
        this._height = _height;
        this._weight = _weight;
    }
    get age() {
        return this._age;
    }
    set age(age) {
        this._age = age;
    }
    get height() {
        return this._height;
    }
    set height(height) {
        this._height = height;
    }
    get weight() {
        return this._weight;
    }
    set weight(weight) {
        this._weight = weight;
    }
    get lastName() {
        return this._lastName;
    }
    set lastName(value) {
        this._lastName = value;
    }
    get firstName() {
        return this._firstName;
    }
    set firstName(firstName) {
        this._firstName = firstName;
    }
    youngOrOld() {
        if (this._age > 50) {
            return "Old";
        }
        else {
            return "Young";
        }
    }
    calculateBMI() {
        let bmi = this._weight / (Math.pow((this._height / 100), 2));
        if (bmi < 18.5)
            return "Underweight";
        if (bmi >= 18.5 && bmi < 24.9)
            return "Healthy";
        if (bmi >= 24.9 && bmi > 30)
            return "Overweight";
        else {
            return "Obese";
        }
    }
}
let myPerson = new Person("sejal", "naik", 25, 152, 50);
console.log(myPerson.youngOrOld());
console.log(myPerson.calculateBMI());
