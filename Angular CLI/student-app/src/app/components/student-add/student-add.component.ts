import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student/student';

@Component({
  selector: 'student-add',
  templateUrl: './student-add.component.html',
  styleUrls: ['./student-add.component.css']
})
export class StudentAddComponent  {

  name:string;
  address:string;
  age:number;
  constructor(private studentService:StudentService, private router:Router) {
    window.document.body.style.backgroundColor = 'plum';
   }

  addStudent():void{
    
    let student = new Student(null, this.name, this.address, this.age);
    this.studentService.addStudent(student).subscribe((data)=>{this.router.navigate(["/students-list"])});
  }
}