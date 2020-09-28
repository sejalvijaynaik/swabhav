import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login-model',
  templateUrl: './login(model).component.html',
  styleUrls: ['./login(model).component.css']
})
export class LoginModelComponent implements OnInit {

  loginForm:FormGroup;
  username:FormControl;
  password:FormControl;

  ngOnInit() {
    this.createFormControls();
    this.createForm();
  }

  createFormControls():void{
    this.username = new FormControl('', Validators.required);
    this.password = new FormControl('', Validators.required);
  }

  createForm() { 
    this.loginForm = new FormGroup({
      username: this.username,
      password: this.password
    });
  }

  login():void{

    if((this.username.value != "") && (this.password.value != "")){
      this.afterLogin();
    }
  }

  afterLogin():void{
    alert("You are logged in")
  }
}
