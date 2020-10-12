import { Injectable } from '@angular/core';
import { IEmployee } from "../classes/iemployee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  employees:IEmployee[] = [];
  constructor() { 
    this.addEmployee({id:1, name:"Sejal", age:25, designation:"developer", email:"sejal@gmail.com", gender:"female", salary:50000});
    this.addEmployee({id:2, name:"ross", age:26, designation:"manager", email:"ross@gmail.com", gender:"male", salary:40000});
    this.addEmployee({id:3, name:"rachel", age:27, designation:"president", email:"rachel@gmail.com", gender:"female", salary:500000});
    this.addEmployee({id:4, name:"monica", age:28, designation:"developer", email:"monica@gmail.com", gender:"female", salary:30000});
    this.addEmployee({id:5, name:"joey", age:29, designation:"developer", email:"sejoeyjal@gmail.com", gender:"male", salary:20000});
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
      if(this.employees[i].name.toLowerCase().includes(name.toLowerCase())){
        searchEmployeesList.push(this.employees[i]);
      }
    }
    return searchEmployeesList;
  }
}
