import { Component } from '@angular/core';
import { ICountry } from '../country/icountry';
import { CountryService } from '../services/country-service.service';

@Component({
  selector: 'http-country',
  templateUrl: './http-country.component.html',
  styleUrls: ['./http-country.component.css']
})
export class HttpCountryComponent{

  countries:ICountry[] = [];
  constructor(private countryService:CountryService) { }

  getCountry():void{
    this.countries = this.countryService.getCountry()
  }
}
