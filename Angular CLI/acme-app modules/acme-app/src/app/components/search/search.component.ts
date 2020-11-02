import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  
  searchName:string;
  @Output() searchProductEmitter = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }

  searchProduct():void{
    this.searchProductEmitter.emit(this.searchName);
  }

}
