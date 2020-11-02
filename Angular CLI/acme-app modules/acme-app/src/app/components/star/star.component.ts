import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'star',
  templateUrl: './star.component.html',
  styleUrls: ['./star.component.css']
})
export class StarComponent implements OnInit {

  @Input() stars:number;
  halfStarShow:string = "none";
  constructor() { }

  ngOnInit(): void {
    this.createStars();
  }

  createStars():void{
    //alert(this.stars);
    let decimal:number = this.stars% Math.trunc(this.stars);
    if(decimal != 0){
      if(decimal >= 0.5){
        this.halfStarShow = "inline-block";
      }
    }
    else{
      this.halfStarShow = "none";
    }
  }
}
