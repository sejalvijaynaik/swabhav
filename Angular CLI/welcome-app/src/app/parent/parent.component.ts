import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {

  parentMessage:string = "Hello i am parent";
  parentToChildMessage :string = "Hello i am child message coming from parent";

  displayCounter(counter):void{
    console.log(counter);  
  }

}
