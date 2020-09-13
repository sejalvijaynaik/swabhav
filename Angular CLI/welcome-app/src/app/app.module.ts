import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {WelcomeComponent} from './welcome/welcome.component';
import { TwoWayBindingComponent } from "./twowaybinding/twowaybinding.component";
import { FormsModule } from '@angular/forms';
import { LoadStudentsComponent } from "./loadstudents/loadstudents.component";

@NgModule({
  declarations: [
    AppComponent, WelcomeComponent, TwoWayBindingComponent, LoadStudentsComponent
  ],
  imports: [
    BrowserModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
