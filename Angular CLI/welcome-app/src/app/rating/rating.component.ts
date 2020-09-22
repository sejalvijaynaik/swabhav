import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-rating',
  templateUrl: './rating.component.html',
  styleUrls: ['./rating.component.css']
})
export class RatingComponent  {

  ratingNumber:string = "";
  @Output() ratingGivenEvent = new EventEmitter();

  ratingSubmit():void{
    if(this.ratingNumber != ""){
      this.ratingGivenEvent.emit(this.ratingNumber);
    }
  }
}
