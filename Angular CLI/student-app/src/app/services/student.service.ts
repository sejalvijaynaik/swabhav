import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Student } from "../student/student";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  students:Student[] = [];
  constructor(private httpClient:HttpClient){}
  baseUrl:string = "http://localhost:8080/";

  getStudents():Observable<Student[]>{
    return this.httpClient.get<Student[]>("api/v2/students/");
  }

  addStudent(student:Student):Observable<Student>{
    let studentJSON:string = JSON.stringify(student);
    let httpHeaders = new HttpHeaders({'Content-Type' : 'application/json'}); 
    console.log(studentJSON);

    return this.httpClient.post<Student>("api/v2/students/", studentJSON, {'headers':httpHeaders});
  }

  getStudent(id:string):Observable<Student>{
    return this.httpClient.get<Student>("api/v2/students/" + id);
  }

  updateStudent(student:Student):Observable<Student>{
    let studentJSON:string = JSON.stringify(student);
    let httpHeaders = new HttpHeaders({'Content-Type' : 'application/json'}); 
    return this.httpClient.put<Student>("api/v2/students/", studentJSON, {'headers':httpHeaders});
  }

  deleteStudent(id:string){
    return this.httpClient.delete<Student>("api/v2/students/" + id);
  }
}
