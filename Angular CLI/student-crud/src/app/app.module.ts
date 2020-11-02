import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from "@angular/common/http";
import {  RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { StudentService } from "./services/student.service";
import { ListComponent } from './components/list/list.component';
import { HomeComponent } from './components/home/home.component';
import { RoutesClass } from "./classes/route-class";
import { AddComponent } from './components/add/add.component';
import { GetComponent } from './components/get/get.component';
import { UpdateComponent } from './components/update/update.component';
import { DeleteComponent } from './components/delete/delete.component';
import { ErrorComponent } from './components/error/error.component';


@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    HomeComponent,
    AddComponent,
    GetComponent,
    UpdateComponent,
    DeleteComponent,
    ErrorComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(RoutesClass.routes)
  ],
  providers: [StudentService],
  
  bootstrap: [AppComponent]
})
export class AppModule { }
