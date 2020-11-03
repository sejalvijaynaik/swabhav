import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from "@angular/common/http";
import { RouterModule } from '@angular/router';
import { ProductModule } from "./modules/product/product.module";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { RoutesClass } from "./classes/route-class";
import { ProductService } from "./services/product-service.service";
import { RouteGuard } from "./services/router-guard";

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule,
    RouterModule.forRoot(RoutesClass.routes),
    ProductModule
  ],
  providers: [ProductService, RouteGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
