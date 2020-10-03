import { Component, OnInit } from '@angular/core';
import { StudentApiService } from '../services/student-api-service.service';
import { IStudentAPI } from "../studentAPI/student-api";

@Component({
  selector: 'http-student',
  templateUrl: './http-student.component.html',
  styleUrls: ['./http-student.component.css']
})
export class HttpStudentComponent implements OnInit {

  students:IStudentAPI[] = [];
  constructor(private studentApiService:StudentApiService) {
    window.document.body.style.backgroundColor = 'plum';
   }

  ngOnInit(): void {
    this.studentApiService.getStudents().subscribe((data)=>{this.students = data});
  }

}
