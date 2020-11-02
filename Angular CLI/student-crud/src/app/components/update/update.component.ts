import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from 'src/app/classes/student';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  id:string;
  rollNo:number;
  name:string;
  date:string;
  age:number;
  email:string;
  isMale:boolean;
  gender:string;

  constructor(private studentService:StudentService, 
    private activatedRoute:ActivatedRoute,
    private router:Router) { }
  
  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(()=>{
      this.id = this.activatedRoute.snapshot.paramMap.get("id");
      this.prepopulate();
    });
  }

  prepopulate():void{
    this.studentService.getStudent(this.id).subscribe((data)=>{
      this.id = data[0].id; 
      this.rollNo = data[0].rollNo; 
      this.name = data[0].name;
      this.age = data[0].age;
      this.date = data[0].date;
      this.email = data[0].email;
      this.isMale = data[0].isMale;
    });
  }

  updateStudent():void{
    
    let isMale:boolean = true;

    if(this.gender == 'female'){
      isMale = false;
    }

    let student:Student = new Student(this.id, this.name, this.rollNo, this.age, this.date, this.email, isMale);
    this.studentService.updateStudent(student).subscribe((data)=>{this.router.navigate(["/list"])});
  }
}
