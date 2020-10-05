import { Component, OnInit } from '@angular/core';
import { StudentApiService } from '../../services/student-api-service.service';
import { IStudentAPI } from "../../studentAPI/student-api";

@Component({
  selector: 'get-students',
  templateUrl: './get-students.component.html',
  styleUrls: ['./get-students.component.css']
})
export class GetStudentsComponent implements OnInit {

  students:IStudentAPI[] = [];
  constructor(private studentApiService:StudentApiService) {
    window.document.body.style.backgroundColor = 'plum';
   }

  ngOnInit(): void {
    this.studentApiService.getStudents().subscribe((data)=>{this.students = data});
  }

}
