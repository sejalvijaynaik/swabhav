import { Component } from '@angular/core';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student/student';

@Component({
  selector: 'student-update',
  templateUrl: './student-update.component.html',
  styleUrls: ['./student-update.component.css']
})
export class StudentUpdateComponent {

  constructor(private studentService:StudentService) { }

  updateStudent():void{
    
    let student:Student = new Student("6b138ff5-5f23-4f76-bc54-37d5921382ed", "rachel", 8.9);
    this.studentService.updateStudent(student).subscribe((data)=>{console.log(data)});
  }


  

}
