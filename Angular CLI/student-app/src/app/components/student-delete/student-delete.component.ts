import { Component } from '@angular/core';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'student-delete',
  templateUrl: './student-delete.component.html',
  styleUrls: ['./student-delete.component.css']
})
export class StudentDeleteComponent{

  constructor(private studentService:StudentService) { }

  deleteStudent():void{
    let id:string = "7ed038a9-763c-45bc-bcee-7a156de01229";
    this.studentService.deleteStudent(id).subscribe();
  }

}
