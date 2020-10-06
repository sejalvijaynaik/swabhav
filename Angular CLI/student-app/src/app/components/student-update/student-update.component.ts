import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student/student';

@Component({
  selector: 'student-update',
  templateUrl: './student-update.component.html',
  styleUrls: ['./student-update.component.css']
})
export class StudentUpdateComponent implements OnInit {

  id:string;
  name:string = "";
  cgpa:number;
  
  constructor(private studentService:StudentService, 
    private activatedRoute:ActivatedRoute,
    private router:Router) { }
  
  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(()=>{this.id = this.activatedRoute.snapshot.paramMap.get("id");this.prepopulate();})
    
  }

  prepopulate():void{
    this.studentService.getStudent(this.id).subscribe((data)=>{this.name = data.name; this.cgpa = data.cgpa});
  }

  updateStudent():void{
    
    let student:Student = new Student(this.id, this.name, this.cgpa);
    this.studentService.updateStudent(student).subscribe((data)=>{this.router.navigate(["/students-list"])});

  }
}