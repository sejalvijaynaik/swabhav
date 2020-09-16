import { Component, OnInit } from '@angular/core';
import { IProduct } from "./product";

@Component({
  selector: 'app-product-temp-var',
  templateUrl: './productTempVar.component.html',
  styleUrls: ['./productTempVar.component.css']
})
export class ProductTempVarComponent {

  products:IProduct[] = [];

  addproduct(name:string, rating:string):void{
    console.log(name);
    console.log(rating);

    this.products.push({name: name, rating : parseInt(rating)});

  }
}
