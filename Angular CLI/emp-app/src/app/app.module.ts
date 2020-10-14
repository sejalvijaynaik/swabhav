import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from "@angular/forms";

import { AppComponent } from './app.component';
import { EmployeeService } from "./services/employee-service.service";
import { GetEmployeesComponent } from './components/get-employees/get-employees.component';
import { RoutesClass } from "./classes/route-class";
import { EmployeeAppHomeComponent } from './components/employee-app-home/employee-app-home.component';
import { AddEmployeeComponent } from './components/add-employee/add-employee.component';
import { SearchEmployeeComponent } from './components/search-employee/search-employee.component';

@NgModule({
  declarations: [
    AppComponent,
    GetEmployeesComponent,
    EmployeeAppHomeComponent,
    AddEmployeeComponent,
    SearchEmployeeComponent
  ],
  imports: [
    BrowserModule, RouterModule.forRoot(RoutesClass.routes), FormsModule, ReactiveFormsModule
  ],
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
