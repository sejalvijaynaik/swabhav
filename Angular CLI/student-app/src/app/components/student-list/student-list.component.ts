import { formatCurrency } from '@angular/common';
import { Component } from '@angular/core';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student/student';

@Component({
  selector: 'student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent {

  students:Student[] = [];
  constructor(private studentService:StudentService) { }

  getStudents():void{
    this.studentService.getStudents().subscribe((data)=>{this.students = data});
  }

}
