import { Component, OnInit } from '@angular/core';
import { IBlueball } from "./IBlueball";

@Component({
  selector: 'app-blueball',
  templateUrl: './blueball.component.html',
  styleUrls: ['./blueball.component.css']
})
export class BlueballComponent{

  blueballs : IBlueball[] = [];
  correctBall:number = 0;
  chances:number = 3;

  startGame():void{
    this.blueballs = [];
    for(let i = 0; i < 25; i++){
      this.blueballs.push({id: i, color : "grey"});
    }
    this.correctBall = Math.floor(Math.random() * 25);
    console.log(this.correctBall);
  }

  ballClick(value:number):void{

    if(this.chances > 0){
      this.chances = this.chances - 1;
      if(value== this.correctBall){
        this.blueballs[this.correctBall].color = "grey blue";
        this.endGame("YOU WON");
      }  
      else if(value > this.correctBall){
        this.blueballs[value].color = "grey green";
      }
      else{
        this.blueballs[value].color = "grey red";
      }
    }
    if(this.chances == 0){
      this.blueballs[this.correctBall].color = "grey blue";
      this.endGame("YOU LOST");
    }
  }

  endGame(message:string):void{
    var newWindow = window.open("", "_blank", "width=400, height=200");
    var newDoc = newWindow.document;

        var para = newDoc.createElement("p");
        para.innerHTML = message;
        para.style.fontSize = "50px";
        newDoc.body.appendChild(para);
        var button = newDoc.createElement("button");
        button.style.width = "100px";
        button.style.height = "50px";
        button.innerHTML = "Restart";
        newDoc.body.appendChild(button);
        button.addEventListener("click", redirectParent);
        
   function redirectParent(){
    newWindow.opener.open("index.html", "_self");
     newWindow.close();
  
    }
  }
}
