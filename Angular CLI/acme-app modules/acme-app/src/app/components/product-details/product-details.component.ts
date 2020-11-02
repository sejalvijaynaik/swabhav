import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IProduct } from '../../classes/iproduct';
import { ProductService } from "../../services/product-service.service";

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  id:string;
  stars:number;
  products:IProduct[] = [];
  product:IProduct;
  constructor(private activatedRoute:ActivatedRoute,
    private router:Router, private productService:ProductService) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(()=>{this.id = this.activatedRoute.snapshot.paramMap.get("id"); this.getProducts();});
  }

  getProducts():void{
    this.productService.getProducts().subscribe((data)=>{this.products = data; this.getProduct();});
    
  }

  getProduct():void{
    for(let i=0; i<this.products.length; i++){
      if(this.products[i].productId == parseInt(this.id)){
        this.product = this.products[i];
        break;
      }
    }
  }
  
  back():void{
    this.router.navigate(['/list']);
  }
}
