import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from "./components/home/home.component";
import { AboutComponent } from "./components/about/about.component";
import { CareerComponent } from "./components/career/career.component";
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { ErrorComponent } from './components/error/error.component';
import { RoutesClass } from "./classes/route-class";

@NgModule({
  declarations: [
    AppComponent, HomeComponent, AboutComponent, CareerComponent, ErrorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, HttpClientModule, RouterModule.forRoot(RoutesClass.routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
