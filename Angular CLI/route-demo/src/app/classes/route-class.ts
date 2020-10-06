import { Routes } from '@angular/router';
import { HomeComponent } from "../components/home/home.component";
import { AboutComponent } from "../components/about/about.component";
import { CareerComponent } from "../components/career/career.component";
import { ErrorComponent } from "../components/error/error.component";

export class RoutesClass {
    public static routes : Routes = [
        {path:"home", component:HomeComponent},
        {path:"about", component:AboutComponent},
        {path:"career", component:CareerComponent},
        {path:"", redirectTo:"/home", pathMatch:"full"},
        { path: '**', component: ErrorComponent}
      ];
}
