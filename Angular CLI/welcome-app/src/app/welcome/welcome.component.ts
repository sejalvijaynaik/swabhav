import { Component } from '@angular/core';
import { StudentService } from '../services/student-service.service';
import {IStudent} from '../student/student';

@Component({
  selector: 'sw-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent {
  
  students:IStudent[] = [];
  student:IStudent = null;

  constructor(private studentService:StudentService ){
    this.students = studentService.addStudents();
    this.student = this.students[0];
  }
}