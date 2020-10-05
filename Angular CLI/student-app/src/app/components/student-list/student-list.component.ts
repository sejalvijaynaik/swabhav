import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student/student';

@Component({
  selector: 'student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  students:Student[] = [];
  
  constructor(private studentService:StudentService, private router:Router) { 
    window.document.body.style.backgroundColor = 'plum';
  }
  
  ngOnInit(): void {
    this.getStudents();
  }

  getStudents():void{
    this.studentService.getStudents().subscribe((data)=>{this.students = data});
  }

  updateStudent(id:string):void{
    this.router.navigate(['/update-student', id]);
  }

  deleteStudent(id:string):void{
    if(confirm("Are you sure to delete?")) {
      this.router.navigate(['/delete-student', id]);
    }
  }
}
