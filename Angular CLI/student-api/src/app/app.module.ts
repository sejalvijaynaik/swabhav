import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { AddStudentComponent } from './Components/add-student/add-student.component';
import { GetStudentsComponent } from "./Components/get-students/get-students.component";
import { RoutesClass } from "./classes/route-class";
import { HomeComponent } from './components/home/home.component';

@NgModule({
  declarations: [
    AppComponent, AddStudentComponent, GetStudentsComponent, HomeComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, RouterModule.forRoot(RoutesClass.routes), FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
