import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'student-app-new';
  constructor(){
    window.document.body.style.backgroundColor = 'plum';
  }
}