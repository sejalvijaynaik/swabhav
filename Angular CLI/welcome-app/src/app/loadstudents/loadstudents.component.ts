import { Component } from '@angular/core';
import { IStudent } from "../student/student";

@Component({
  selector: 'load-students',
  templateUrl: './loadstudents.component.html',
  styleUrls: ['./loadstudents.component.css']
})
export class LoadStudentsComponent{

  students:IStudent[] = [];
    
  loadStudents(){
      this.students = [{rollNo: 1, name : "sejal", cgpa:9.8},
      {rollNo: 2, name : "monica", cgpa:5.7},
      {rollNo: 3, name : "ross", cgpa:7.8}];
    }
}