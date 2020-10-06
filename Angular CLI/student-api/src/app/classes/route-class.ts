import { Routes } from '@angular/router';
import { AddStudentComponent } from '../Components/add-student/add-student.component';
import { GetStudentsComponent } from "../Components/get-students/get-students.component";
import { HomeComponent } from "../Components/home/home.component";


export class RoutesClass {
    public static routes : Routes = [
        {path:"home", component:HomeComponent},
        {path:"add", component:AddStudentComponent},
        {path:"list", component:GetStudentsComponent},
        {path:"", redirectTo:"/home", pathMatch:"full"}
        //{ path: '**', component: ErrorComponent}
      ];
}
