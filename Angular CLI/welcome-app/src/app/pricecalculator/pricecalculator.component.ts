import { Component } from '@angular/core';

@Component({
  selector: 'price-calculator',
  templateUrl: './pricecalculator.component.html',
  //styleUrls: ['./twowaybinding.component.css']
})
export class pricecalculatorComponent{

  price:string = "0";
  rate:string = "0";
  cost:number = 0;
  
  priceCalculate():void {
    
    this.cost = parseInt(this.price) - (parseInt(this.rate)/100 *parseInt(this.price));
  }
}