import { Component } from '@angular/core';

@Component({
  selector: 'app-master',
  templateUrl: './master.component.html',
  styleUrls: ['./master.component.css']
})
export class MasterComponent {

  status:string = "OFF";
  rating:number = 0;

  displayState(event:number):void{
    if(event == 0){
      this.status = "OFF";
    }
    else{
      this.status = "ON";
    }
  }

  displayRating(event:number):void{
    this.rating = event;
    console.log(this.rating);
  }
}
