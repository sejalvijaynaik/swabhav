import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Student } from "../classes/student";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  students:Student[] = [];
  constructor(private httpClient:HttpClient){}
  baseUrl:string = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";

  getStudents():Observable<Student[]>{
    return this.httpClient.get<Student[]>(this.baseUrl);
  }
  
  addStudent(student:Student):Observable<Student>{
    
    let studentJSON:string = JSON.stringify(student);
    let httpHeaders = new HttpHeaders({'Content-Type' : 'application/json'}); 
    console.log(studentJSON);

    return this.httpClient.post<Student>(this.baseUrl, studentJSON, {'headers':httpHeaders});
  }

  getStudent(id:string):Observable<Student>{
    return this.httpClient.get<Student>(this.baseUrl + id);
  }

  updateStudent(student:Student):Observable<Student>{
    let studentJSON:string = JSON.stringify(student);
    let httpHeaders = new HttpHeaders({'Content-Type' : 'application/json'}); 
    return this.httpClient.put<Student>(this.baseUrl + student.id, studentJSON, {'headers':httpHeaders});
  }
  deleteStudent(id:string){
    return this.httpClient.delete<Student>(this.baseUrl + id);
  }
}

