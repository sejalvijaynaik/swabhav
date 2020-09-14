import { Component } from '@angular/core';

@Component({
  selector: 'price-calculator',
  templateUrl: './pricecalculator.component.html',
  //styleUrls: ['./twowaybinding.component.css']
})
export class pricecalculatorComponent{

  cost:number = 0;
  
  priceCalculate(price:string, rate:string):void {
    
    this.cost = parseInt(price) - (parseInt(rate)/100 *parseInt(price));
  }
}