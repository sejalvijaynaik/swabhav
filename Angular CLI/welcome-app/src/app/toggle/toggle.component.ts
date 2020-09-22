import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-toggle',
  templateUrl: './toggle.component.html',
  styleUrls: ['./toggle.component.css']
})
export class ToggleComponent{

  @Input() onStateColor:string;
  @Input() offStateColor:string;
  @Output() stateChange = new EventEmitter();
  state:number = 0;
  buttonColor:string = "red";

  stateChanged():void{
    if(this.state == 0){
      this.state = 1;
      this.buttonColor = "green";
    }
    else{
      this.state  = 0;
      this.buttonColor = "red";
    }

    this.stateChange.emit(this.state);
  }

}
