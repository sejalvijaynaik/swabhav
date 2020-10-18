import { Routes } from '@angular/router';
import { HomeComponent } from '../components/home/home.component';
import { ProductListComponent } from "../components/product-list/product-list.component";
import { ProductDetailsComponent } from "../components/product-details/product-details.component";

export class RoutesClass {
    public static routes : Routes = [
        {path:"home", component:HomeComponent},
        {path:"list", component:ProductListComponent},
        {path:"details/:id", component:ProductDetailsComponent},
        {path:"", redirectTo:"/home", pathMatch:"full"}
        //{ path: '**', component: ErrorComponent}
      ];
}
