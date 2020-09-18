import { Component } from '@angular/core';
import { IStudent } from "../student/student";

@Component({
  selector: 'two-way-binding',
  templateUrl: './twowaybinding.component.html',
  styleUrls: ['./twowaybinding.component.css']
})
export class TwoWayBindingComponent{

  /*student:IStudent = {
    rollNo : 0,
    name : "",
    cgpa : 0.0
  }*/

  firstName:string = "";
  lastName:string = "";

  nameChange(event:string):void{
    console.log("event" + event);
    this.lastName = event;
    console.log("lastname" + this.lastName);
    
  }
}