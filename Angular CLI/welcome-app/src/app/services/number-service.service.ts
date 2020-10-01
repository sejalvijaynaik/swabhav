import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NumberService {

  baseUrl:string = "http://numbersapi.com/";
  constructor(private httpClient:HttpClient) { }

  getNumber(numberInput:number):Observable<string>{

    return this.httpClient.get(this.baseUrl + numberInput, {responseType: 'text'});

  }
}
