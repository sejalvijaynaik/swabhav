import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from 'src/app/classes/student';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  rollNo:number;
  name:string;
  age:number;
  email:string;
  gender:string;
  date:string;
  studentAPI:Student;

  constructor(private studentApiService:StudentService, private router:Router) { }

  ngOnInit(): void {
  }

  addStudent():void{

    let isMale:boolean = true;

    if(this.gender == 'female'){
      isMale = false;
    }
    this.studentAPI = {id:null, rollNo:this.rollNo, name:this.name, age:this.age, email:this.email, isMale:isMale, date:this.date};
    this.studentApiService.addStudent(this.studentAPI).subscribe(data=>{this.router.navigate(["/list"]);});
  }

}
