import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Student } from "../student/student";
import { map } from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  baseUrl:string = "http://localhost:8080/api/students";

  constructor(private httpClient:HttpClient){}

  getStudents():Observable<Student[]>{

    

    
      
  }

  
}
