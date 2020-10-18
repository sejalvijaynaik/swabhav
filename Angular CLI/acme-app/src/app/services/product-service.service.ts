import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IProduct } from "../classes/iproduct";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private httpClient:HttpClient) { }

  getProducts():Observable<IProduct[]>{
    return this.httpClient.get<IProduct[]>("./assets/json-files/products.json");
  }

  searchProducts(name:string, products:IProduct[]):IProduct[]{
    let searchProductsList:IProduct[] = [];
    for(let i = 0; i < products.length; i++){
      if(products[i].productName.toLowerCase().includes(name.toLowerCase())){
        searchProductsList.push(products[i]);
      }
    }
    return searchProductsList;
  }
}
