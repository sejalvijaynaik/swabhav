import { Injectable } from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router} from "@angular/router";
import { Observable } from 'rxjs';
import { IProduct } from '../classes/iproduct';
import { ProductService } from './product-service.service';
import { map } from 'rxjs/operators';

@Injectable({
    providedIn: 'root'
})
export class RouteGuard implements CanActivate {

    constructor(private productService:ProductService, private router: Router) { }

    canActivate(route: ActivatedRouteSnapshot): Observable<boolean> {
    
        let products:IProduct[];
        let id = route.params.id;

        return this.productService.getProducts().pipe(map(res => {
            products = res;
            for(let product of products){
                if(id == product.productId){
                    return true;
                }
            } 
            this.router.navigate(['/list']);
            alert("Wrong product id");
            return false;
        }));
    }
}