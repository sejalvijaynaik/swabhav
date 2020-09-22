import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  @Output() valueChange = new EventEmitter();
  counter = 0;

  @Input() childMessage:string;

  valueChanged():void{

    this.counter = this.counter + 1;
    this.valueChange.emit(this.counter);

  }

}
