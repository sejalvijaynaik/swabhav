import { Component } from '@angular/core';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student/student';

@Component({
  selector: 'student-get',
  templateUrl: './student-get.component.html',
  styleUrls: ['./student-get.component.css']
})
export class StudentGetComponent {

  student:Student = new Student(null, null, null);
  constructor(private studentService:StudentService) { }

  getStudent():void{
    let id:string = "6b138ff5-5f23-4f76-bc54-37d5921382ed";
    this.studentService.getStudent(id).subscribe((data)=>{this.student = data});
  }
}
