import { Component } from '@angular/core';

@Component({
  selector: 'dicsount-calculator',
  templateUrl: './discountcalculator.component.html',
})
export class DiscountCalculatorComponent{

  price:string = "";
  rate:string = "";
  cost:number = 0;
  dicscountAmount:number = 0;
  
  priceCalculate():void {
    
    this.dicscountAmount = (parseInt(this.rate)/100 *parseInt(this.price))
    this.cost = parseInt(this.price) - this.dicscountAmount;
  }
}