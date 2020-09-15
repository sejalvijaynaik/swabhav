import { Component } from '@angular/core';
import { IStudent } from "../student/student";
import { StudentService } from "../services/student-service.service";

@Component({
  selector: 'load-students',
  templateUrl: './loadstudents.component.html',
  styleUrls: ['./loadstudents.component.css'],
})
export class LoadStudentsComponent{

  students:IStudent[] = [];
  constructor(private studentService:StudentService){}
    
  loadStudents(){
      this.students = this.studentService.addStudents();
    }
}