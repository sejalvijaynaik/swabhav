import { Routes } from '@angular/router';
import { GetEmployeesComponent } from "../components/get-employees/get-employees.component";
import { EmployeeAppHomeComponent } from "../components/employee-app-home/employee-app-home.component";
import { AddEmployeeComponent } from "../components/add-employee/add-employee.component";


export class RoutesClass {
    public static routes : Routes = [
      {path:"home", component:EmployeeAppHomeComponent},
      {path:"list", component:GetEmployeesComponent},
      {path:"add", component:AddEmployeeComponent},
      {path:"", redirectTo:"/home", pathMatch:"full"}
        //{ path: '**', component: ErrorComponent}
      ];
}
