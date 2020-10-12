import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'search-employee',
  templateUrl: './search-employee.component.html',
  styleUrls: ['./search-employee.component.css']
})
export class SearchEmployeeComponent implements OnInit {

  searchName:string;
  @Output() searchEmployeeEmitter = new EventEmitter();
  
  constructor(private employeeService:EmployeeService, private router:Router) { }

  ngOnInit(): void {
  }

  searchEmployee():void{
    this.searchEmployeeEmitter.emit(this.searchName);
    this.searchName = "";
  }
}
