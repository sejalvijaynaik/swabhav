import { Component, OnInit } from '@angular/core';
import {SalesPerson} from "./sales-person";
import { from } from 'rxjs';


@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  salesPersonList : SalesPerson[] = [
    new SalesPerson("sejal", "naik", "sejalNaik@gmail.com", 1200),
    new SalesPerson("rachel", "green", "rachelGreen@gmail.com", 4500),
    new SalesPerson("phoebe", "buffay", "phoebeBuffay@gmail.com", 3000),
    new SalesPerson("monica", "geller", "monicaGeller@gmail.com", 5000)
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
