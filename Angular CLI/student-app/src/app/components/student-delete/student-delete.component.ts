import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'student-delete',
  templateUrl: './student-delete.component.html',
  styleUrls: ['./student-delete.component.css']
})
export class StudentDeleteComponent implements OnInit {

  id:string = "";
  constructor(private studentService:StudentService, private router:Router, 
  private activatedRoute:ActivatedRoute) {}
  
  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(()=>{this.id = this.activatedRoute.snapshot.paramMap.get("id");this.deleteStudent();})
  }

  deleteStudent():void{
    this.studentService.deleteStudent(this.id).subscribe((data)=>{this.router.navigate(["/students-list"])});
  }

}