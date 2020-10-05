import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentApiService } from 'src/app/services/student-api-service.service';
import { IStudentAPI } from 'src/app/studentAPI/student-api';

@Component({
  selector: 'add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent implements OnInit {

  rollNo:number;
  name:string;
  age:number;
  email:string;
  gender:string;
  date:string;
  studentAPI:IStudentAPI;

  constructor(private studentApiService:StudentApiService, private router:Router) { 
    window.document.body.style.backgroundColor = 'plum';
  }

  ngOnInit(): void {
  }

  addStudent():void{

    let isMale:boolean = true;

    if(this.gender == 'female'){
      isMale = false;
    }
    this.studentAPI = {id:null, rollNo:this.rollNo, name:this.name, age:this.age, email:this.email, isMale:isMale, date:this.date};
    this.studentApiService.addStudent(this.studentAPI).subscribe(data=>{this.router.navigate(["/get-students"]);});
  }
}
