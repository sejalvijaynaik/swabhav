import { Component } from '@angular/core';
import {IStudent} from '../student/student';

@Component({
  selector: 'sw-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent {
  
    myName = "sejal naik";
    student:IStudent = {
    rollNo : 1,
    name : "sejal",
    cgpa : 7.8
  }
}