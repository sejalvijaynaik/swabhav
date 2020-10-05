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
import { StudentService } from './services/student-service.service';
import { HttpNumberComponent } from './http-number/http-number.component';
import { HttpClientModule } from '@angular/common/http';
import { NumberService } from "./services/number-service.service";
import { CountryService } from "./services/country-service.service";
import { HttpCountryComponent } from './http-country/http-country.component';
import { StudentApiService } from "./services/student-api-service.service";
import { HomeComponent } from './routeComponents/home/home.component';
import { AboutComponent } from './routeComponents/about/about.component';
import { CareerComponent } from './routeComponents/career/career.component';
import { RouterModule, Routes } from '@angular/router';
import { AddStudentComponent } from './studentAPIComponents/add-student/add-student.component';
import { GetStudentsComponent } from "./studentAPIComponents/get-students/get-students.component";

/*const routes : Routes = [
  {path:"app-home", component:HomeComponent},
  {path:"app-about", component:AboutComponent},
  {path:"app-career", component:CareerComponent},
  {path:"", redirectTo:"/app-home", pathMatch:"full"}
];*/

const routes : Routes = [
  {path:"get-students", component:GetStudentsComponent},
  {path:"add-student", component:AddStudentComponent},
  {path:"", redirectTo:"/get-students", pathMatch:"full"}
];

@NgModule({
  declarations: [
    AppComponent, WelcomeComponent, TwoWayBindingComponent, LoadStudentsComponent, pricecalculatorComponent, DiscountCalculatorComponent, GradePipe, SnakeCasePipe,
    SnakeCaseComponent, 
    ProductTempVarComponent, ProductNgModelComponent, BlueballComponent, ChildComponent, ParentComponent, MasterComponent, ToggleComponent, RatingComponent, LoginTemplateComponent, LoginModelComponent, RegisterModelComponent, QuestionBankComponent, HttpNumberComponent, HttpCountryComponent, GetStudentsComponent, HomeComponent, AboutComponent, CareerComponent, AddStudentComponent
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule, HttpClientModule, RouterModule.forRoot(routes)
  ],
  providers: [QuestionService, StudentService, NumberService, CountryService, StudentApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
