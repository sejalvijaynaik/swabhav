import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'register-model',
  templateUrl: './register-model.component.html',
  styleUrls: ['./register-model.component.css']
})
export class RegisterModelComponent implements OnInit {

  languages: string[] = ["Java", "C++", "JavaScript"];
  registerForm: FormGroup;
  firstName: FormControl;
  lastName: FormControl;
  email: FormControl;
  password: FormControl;
  language: FormControl;
  firstNameError:string = "";

  createFormControls() {
    this.firstName = new FormControl("", Validators.required);
    this.lastName = new FormControl("", Validators.required);
    this.email = new FormControl("", [
      Validators.required,
      Validators.pattern("[^ @]*@[^ @]*")
    ]);
    this.password = new FormControl("", [
      Validators.required,
      Validators.minLength(8)
    ]);
    this.language = new FormControl("", Validators.required);
  }

  createForm() {
    this.registerForm = new FormGroup({
      name: new FormGroup({
        firstName: this.firstName,
        lastName: this.lastName
      }),
      email: this.email,
      password: this.password,
      language: this.language
    });
  }

  ngOnInit(): void {
    this.createFormControls();
    this.createForm();
  }

  validate():void{
    if(this.firstName.invalid){
      this.firstName.markAsDirty();
    }
    if(this.lastName.invalid){
      this.lastName.markAsDirty();
    }
    if(this.email.errors.required){
      this.email.markAsDirty();
    }
    if(this.password.errors.required){
      this.password.markAsDirty();
    }
    if(this.language.errors.required){
      this.language.markAsDirty();
    }
  }
}
