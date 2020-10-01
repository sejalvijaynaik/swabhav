import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICountry } from "../country/icountry";

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  countries:ICountry[] = [];
  constructor(private httpClient:HttpClient) { }

  getCountry():ICountry[]{
   
    this.httpClient.get("https://restcountries.eu/rest/v2/all").subscribe((data)=>{this.getCountries(data)});
    return this.countries;
  }

  getCountries(data):ICountry[]{
   
    for(let i = 0; i < data.length; i++){
      this.countries.push({name:data[i].name, capital:data[i].capital, flag:data[i].flag});
    }

    return this.countries;
  }
}