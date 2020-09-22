import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {WelcomeComponent} from './welcome/welcome.component';
import { TwoWayBindingComponent } from "./twowaybinding/twowaybinding.component";
import { FormsModule } from '@angular/forms';
import { LoadStudentsComponent } from "./loadstudents/loadstudents.component";
import { pricecalculatorComponent } from "./pricecalculator/pricecalculator.component";
import { DiscountCalculatorComponent } from "./discountcalculator/discountcalculator.component";
import { GradePipe } from "./pipes/grade-pipe.pipe";
import { SnakeCasePipe } from "./pipes/snake-case.pipe";
import { SnakeCaseComponent } from "./snakecase/snakecase.component";
import { ProductTempVarComponent } from './product(tempVariable)/productTempVar.component';
import { ProductNgModelComponent } from './product(ngModel)/productNgModel.component';
import { BlueballComponent } from './blueball/blueball.component';
import { ChildComponent } from './child/child.component';
import { ParentComponent } from './parent/parent.component';

@NgModule({
  declarations: [
    AppComponent, WelcomeComponent, TwoWayBindingComponent, LoadStudentsComponent, pricecalculatorComponent, DiscountCalculatorComponent, GradePipe, SnakeCasePipe,
    SnakeCaseComponent, 
    ProductTempVarComponent, ProductNgModelComponent, BlueballComponent, ChildComponent, ParentComponent
  ],
  imports: [
    BrowserModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
