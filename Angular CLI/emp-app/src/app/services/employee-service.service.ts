import { Injectable } from '@angular/core';
import { IEmployee } from "../classes/iemployee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  employees:IEmployee[] = [];
  constructor() { 
    this.addEmployee({id:"SW-1", firstName:"Sejal", lastName:"Naik", dob:"15/11/1994", age:25, designation:"developer", email:"sejal@gmail.com", gender:"female", salary:50000});
    this.addEmployee({id:"SW-2", firstName:"ross", lastName:"geller", dob:"15/12/1994", age:26, designation:"manager", email:"ross@gmail.com", gender:"male", salary:40000});
    this.addEmployee({id:"SW-3", firstName:"rachel", lastName:"green", dob:"13/11/1994",age:27, designation:"president", email:"rachel@gmail.com", gender:"female", salary:500000});
    this.addEmployee({id:"SW-4", firstName:"monica", lastName:"geller", dob:"15/11/1964",age:28, designation:"developer", email:"monica@gmail.com", gender:"female", salary:30000});
    this.addEmployee({id:"SW-5", firstName:"joey", lastName:"naik", dob:"17/11/1994",age:29, designation:"developer", email:"sejoeyjal@gmail.com", gender:"male", salary:20000});
  }

  getEmployees():IEmployee[]{
    return this.employees;
  }

  addEmployee(employee:IEmployee):void{
    this.employees.push(employee);
  }

  searchEmployees(name:string):IEmployee[]{
    let searchEmployeesList:IEmployee[] = [];
    for(let i = 0; i < this.employees.length; i++){
      if(this.employees[i].firstName.toLowerCase().includes(name.toLowerCase())){
        searchEmployeesList.push(this.employees[i]);
      }
    }
    return searchEmployeesList;
  }
}
