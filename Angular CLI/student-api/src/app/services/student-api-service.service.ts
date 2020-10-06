import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IStudentAPI } from "../studentAPI/student-api";

@Injectable({
  providedIn: 'root'
})
export class StudentApiService {

  baseUrl = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";
  constructor(private httpClient:HttpClient) { }
  
  getStudents():Observable<IStudentAPI[]>{
    return this.httpClient.get<IStudentAPI[]>(this.baseUrl);
  }

  addStudent(studentAPI:IStudentAPI):Observable<IStudentAPI>{
    
    let studentJSON:string = JSON.stringify(studentAPI);
    let httpHeaders = new HttpHeaders({'Content-Type' : 'application/json'}); 
    console.log(studentJSON);

    return this.httpClient.post<IStudentAPI>(this.baseUrl, studentJSON, {'headers':httpHeaders});
  }
}
