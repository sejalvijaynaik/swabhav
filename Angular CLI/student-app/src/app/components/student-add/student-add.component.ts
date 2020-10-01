import { Component } from '@angular/core';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student/student';

@Component({
  selector: 'student-add',
  templateUrl: './student-add.component.html',
  styleUrls: ['./student-add.component.css']
})
export class StudentAddComponent  {

  constructor(private studentService:StudentService) { }

  addStudent():void{
    
    let student:Student = new Student(null, "ross", 8.9);
    this.studentService.addStudent(student).subscribe((data)=>{console.log(data)});
  }

}

