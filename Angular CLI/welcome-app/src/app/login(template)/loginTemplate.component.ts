import { Component } from '@angular/core';

@Component({
  selector: 'app-login-template',
  templateUrl: './loginTemplate.component.html',
  styleUrls: ['./loginTemplate.component.css']
})
export class LoginTemplateComponent {

  username:string = "";
  password:string = "";

  login():void{
    if((this.username != "") && (this.password != "")){
      this.afterLogin();
    }
  }

  afterLogin():void{
    alert("You are logged in")
  }
}
