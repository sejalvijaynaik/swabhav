import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeService } from 'src/app/services/employee-service.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  id:number;
  name:string;
  age:number;
  designation:string;
  email:string;
  gender:string;
  salary:number;

  constructor(private employeeService:EmployeeService, private router:Router) { }

  ngOnInit(): void {
  }

  addEmployee():void{

    this.employeeService.addEmployee({id:this.id, name:this.name, age:this.age, designation:this.designation, email:this.email, gender:this.gender, salary:this.salary});
    this.router.navigate(["/list"]);
  }
}
