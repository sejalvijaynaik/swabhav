import { Component, OnInit } from '@angular/core';
import { NumberService } from '../services/number-service.service';
import { INumber } from "../number/number";

@Component({
  selector: 'http-number',
  templateUrl: './http-number.component.html',
  styleUrls: ['./http-number.component.css']
})
export class HttpNumberComponent implements OnInit {

  numberInput:number;
  numberInfo:string;
  numbers:INumber[] =[];
  constructor(private numberService:NumberService){}
  
  ngOnInit(): void {
    this.show();
    window.document.body.style.backgroundColor = 'plum';
  }

  getNumber():void{
    this.numberService.getNumber(this.numberInput).subscribe((data) => {this.numberInfo = data, this.createEntry();
      this.show();});
    
  }

  show(){
    this.numbers = [];
    for(let a in localStorage){
      if(!isNaN(Number(a))){
        console.log("a = " + Number(a));
        this.numbers.push({numberId:Number(a), numberInput:Number(localStorage[a].substring(0,1)), numberInfo:localStorage[a]});
      }    
    }
  }

  createEntry(){
    if(localStorage.entries == undefined){
        localStorage.entries = "0";
    }
    localStorage.entries = Number(localStorage.entries) + 1;
    localStorage.setItem(localStorage["entries"], this.numberInfo);
    console.log(localStorage.getItem(localStorage["entries"]));
  }

  removeAll():void {
    delete localStorage.entries;
    localStorage.clear();
    this.numbers = [];
  }

}
