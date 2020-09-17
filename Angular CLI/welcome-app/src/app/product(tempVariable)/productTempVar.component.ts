import { Component, OnInit } from '@angular/core';
import { IProduct } from "./product";

@Component({
  selector: 'app-product-temp-var',
  templateUrl: './productTempVar.component.html',
  styleUrls: ['./productTempVar.component.css']
})
export class ProductTempVarComponent {

  products:IProduct[] = [];

  addproduct(productName:HTMLInputElement, rating:HTMLInputElement):void{
    console.log(productName.value);
    console.log(rating.value);

    this.products.push({name: productName.value, rating : parseInt(rating.value)});

    productName.value = "";
    rating.checked = false;

  }
}
