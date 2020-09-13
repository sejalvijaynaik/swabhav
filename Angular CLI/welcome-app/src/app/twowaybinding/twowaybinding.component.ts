import { Component } from '@angular/core';
import { IStudent } from "../student/student";

@Component({
  selector: 'two-way-binding',
  templateUrl: './twowaybinding.component.html',
  styleUrls: ['./twowaybinding.component.css']
})
export class TwoWayBindingComponent{

  student:IStudent = {
    rollNo : 0,
    name : "",
    cgpa : 0.0
  }
}