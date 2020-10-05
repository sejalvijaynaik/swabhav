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

  name:string = "";
  cgpa:number;
  constructor(private studentService:StudentService, private router:Router) { }

  addStudent():void{
    
    let student = new Student(null, this.name, this.cgpa);
    this.studentService.addStudent(student).subscribe((data)=>{this.router.navigate(["/students-list"])});
  }
}

