import { Component, OnInit } from '@angular/core';
import { IProduct } from 'src/app/classes/iproduct';
import { ProductService } from "../../services/product-service.service";
import { Router } from '@angular/router';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  showImage:string = "none";
  showImgBtnText:string = "Show Image";
  products:IProduct[] = [];
  constructor(private productService:ProductService, private router:Router) { }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts():void{
    this.productService.getProducts().subscribe((data)=>{this.products = data});
  }

  showImageToggle():void{
    if(this.showImage == "block"){
      this.showImage = "none";
      this.showImgBtnText = "Show Image";
    }
    else{
      this.showImage = "block";
      this.showImgBtnText = "Hide Image";
    }
  }

  productSelect(id:number):void{
    this.router.navigate(['/details', id]);
  }

  getSearchEmployees(searchName:string):void{
    if((searchName == "") || (searchName == undefined)){
      this.productService.getProducts().subscribe((data)=>{this.products = data});
    }
    else{
      this.productService.getProducts().subscribe((data)=>{this.products = data;
        this.products = this.productService.searchProducts(searchName, this.products);
      });
      
    }
  }
}
