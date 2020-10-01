import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { StudentListComponent } from './components/student-list/student-list.component';
import { HttpClientModule } from "@angular/common/http";
import { StudentService } from "./services/student.service";
import { StudentAddComponent } from './components/student-add/student-add.component';
import { StudentGetComponent } from './components/student-get/student-get.component';
import { StudentUpdateComponent } from './components/student-update/student-update.component';
import { StudentDeleteComponent } from './components/student-delete/student-delete.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
    StudentAddComponent,
    StudentGetComponent,
    StudentUpdateComponent,
    StudentDeleteComponent
  ],
  imports: [
    BrowserModule, HttpClientModule
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
