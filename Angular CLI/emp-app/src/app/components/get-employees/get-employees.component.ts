import { Component, OnInit } from '@angular/core';
import { IEmployee } from '../../classes/iemployee';
import { EmployeeService } from '../../services/employee-service.service';

@Component({
  selector: 'get-employees',
  templateUrl: './get-employees.component.html',
  styleUrls: ['./get-employees.component.css']
})
export class GetEmployeesComponent implements OnInit {

  employees:IEmployee[] = [];
  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {
    this.employees = this.employeeService.getEmployees();
  }

  getSearchEmployees(searchName:string):void{
    if((searchName == "") || (searchName == undefined)){
      this.employees = this.employeeService.getEmployees();
    }
    else{
      this.employees = this.employeeService.searchEmployees(searchName);
    }
  }
}
