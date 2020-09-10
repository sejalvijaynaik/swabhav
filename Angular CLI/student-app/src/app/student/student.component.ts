import { Component, OnInit } from '@angular/core';
import {Student} from './student';
  

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  students: Student[] = [
    new Student('sejal', 'mumbai', 'sejal@gmail.com', 25),
    new Student('monica', 'new york', 'monica@gmail.com', 27),
    new Student('rachel', 'new york', 'rachel@gmail.com', 29),
    new Student('ross', 'mumbai', 'ross@gmail.com', 29),
    new Student('joey', 'mumbai', 'joey@gmail.com', 28)
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
