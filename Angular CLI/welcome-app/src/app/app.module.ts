import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from "@angular/forms";

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
import { MasterComponent } from './master/master.component';
import { ToggleComponent } from './toggle/toggle.component';
import { RatingComponent } from './rating/rating.component';
import { LoginTemplateComponent } from './login(template)/loginTemplate.component';
import { LoginModelComponent } from './login(model)/login(model).component';
import { RegisterModelComponent } from './register-model/register-model.component';
import { QuestionService } from "./services/question-service.service";
import { QuestionBankComponent } from './question-bank/question-bank.component';

@NgModule({
  declarations: [
    AppComponent, WelcomeComponent, TwoWayBindingComponent, LoadStudentsComponent, pricecalculatorComponent, DiscountCalculatorComponent, GradePipe, SnakeCasePipe,
    SnakeCaseComponent, 
    ProductTempVarComponent, ProductNgModelComponent, BlueballComponent, ChildComponent, ParentComponent, MasterComponent, ToggleComponent, RatingComponent, LoginTemplateComponent, LoginModelComponent, RegisterModelComponent, QuestionBankComponent
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule
  ],
  providers: [QuestionService],
  bootstrap: [AppComponent]
})
export class AppModule { }
