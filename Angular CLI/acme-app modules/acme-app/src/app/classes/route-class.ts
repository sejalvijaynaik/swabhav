import { Routes } from '@angular/router';
import { WelcomeComponent } from '../components/welcome/welcome.component';
import { ProductListComponent } from "../components/product-list/product-list.component";
import { ProductDetailsComponent } from "../components/product-details/product-details.component";
import { RouteGuard } from '../services/router-guard';

export class RoutesClass {
    public static routes : Routes = [
        {path:"home", component:WelcomeComponent},
        {path:"list", component:ProductListComponent},
        {path:"details/:id", component:ProductDetailsComponent,
        canActivate: [RouteGuard]},
        {path:"", redirectTo:"/home", pathMatch:"full"}
      ];
}
