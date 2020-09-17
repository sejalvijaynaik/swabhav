import { Component, OnInit } from '@angular/core';
import { IProduct } from "../product(tempVariable)/product";

@Component({
  selector: 'app-product-ngmodel',
  templateUrl: './productNgModel.component.html',
  styleUrls: ['./productNgModel.component.css']
})
export class ProductNgModelComponent {

  products:IProduct[] = [];
  productName:string = "";
  rating:string;
  ratings:number[] = [1, 2, 3, 4, 5];

  addproduct():void{
    console.log(this.productName);
    console.log(this.rating);

    this.products.push({name: this.productName, rating : parseInt(this.rating)});

    this.productName = "";
    this.rating = "";
  }
}
