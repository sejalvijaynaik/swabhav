import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { EmployeeService } from 'src/app/services/employee-service.service';
import * as $ from 'jquery';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  designationList:string[] = ["Developer", "Manager", "President"];
  addForm:FormGroup;
  id:FormControl;
  firstName:FormControl;
  lastName:FormControl;
  dob:FormControl;
  age:FormControl;
  designation:FormControl;
  email:FormControl;
  gender:FormControl;
  salary:FormControl;

  constructor(private employeeService:EmployeeService, private router:Router) { }

  ngOnInit(): void {
    this.createFormControls();
    this.createForm();
    $("#designationId").change(function(){
      if($("#designationId").val() == "Developer"){
        $("#salaryId").val(10000);
      }
      else if($("#designationId").val() == "Manager"){
        $("#salaryId").val(500000);
      }
      else if($("#designationId").val() == "President"){
        $("#salaryId").val(1000000);
      }
    });

    $("#dobId").on("input", function(){
        let dobDate:Date = new Date($("#dobId").val(this.dob.value));
        let diff = (new Date().getTime() - dobDate.getTime());
        let ageTotal = Math.trunc(diff/ (1000 * 3600 * 24 *365));
        
        $("#ageId").val(ageTotal);
        alert($("#ageId").val())
      
    });

  }

  createFormControls():void{
    this.id = new FormControl("", Validators.required);
    this.firstName = new FormControl("", Validators.required);
    this.lastName = new FormControl("", Validators.required);
    this.dob = new FormControl("", Validators.required);
    this.age = new FormControl("", Validators.required);
    this.designation = new FormControl("", Validators.required);
    this.email = new FormControl("", [
      Validators.required,
      Validators.pattern("[^ @]*@[^ @]*")
    ]);
    this.gender = new FormControl("", Validators.required);
    this.salary = new FormControl("", Validators.required);
  }

  createForm():void{
    this.addForm = new FormGroup({
      name: new FormGroup({
        firstName : this.firstName,
        lastName : this.lastName,
      }),
      id : this.id,
      dob : this.dob,
      age : this.age,
      designation : this.designation,
      email :this.email,
      gender : this.gender,
      salary : this.salary,
    });
  }

  validate():void{
    if(this.id.invalid){
      this.id.markAsDirty();
    }
    if(this.firstName.invalid){
      this.firstName.markAsDirty();
    }
    if(this.lastName.invalid){
      this.lastName.markAsDirty();
    }
    if(this.dob.invalid){
      this.dob.markAsDirty();
    }
    if(this.age.invalid){
      this.age.markAsDirty();
    }
    if(this.designation.invalid){
      this.designation.markAsDirty();
    }
    if(this.email.invalid){
      this.email.markAsDirty();
    }
    if(this.gender.invalid){
      this.gender.markAsDirty();
    }
    if(this.salary.invalid){
      this.salary.markAsDirty();
    }
    if(this.addForm.valid){
      this.addEmployee();
    }
  }

  addEmployee():void{
    
    this.employeeService.addEmployee({id: "SW-" + this.id.value, 
                                  firstName:this.firstName.value, 
                                  lastName:this.lastName.value,
                                  dob:this.dob.value,
                                  age:this.age.value, 
                                  designation:this.designation.value, 
                                  email:this.email.value, 
                                  gender:this.gender.value, 
                                  salary:this.salary.value});
    this.router.navigate(["/list"]);
  }
}
