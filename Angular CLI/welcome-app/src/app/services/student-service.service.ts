import { Injectable } from '@angular/core';
import { IStudent } from "../student/student";

@Injectable({
  providedIn: 'root',
})
export class StudentService {

  students:IStudent[] = [];

  addStudents():IStudent[]{
    this.students = [{rollNo: 1, name : "sejal", cgpa:9.8},
      {rollNo: 2, name : "monica", cgpa:5.7},
      {rollNo: 3, name : "ross", cgpa:7.8}];
    
    return this.students;
  }

}