import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IStudent } from '../student/student';
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
}
