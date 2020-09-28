import { Injectable } from '@angular/core';
import { IQuestion } from "../question/question";

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  questions:IQuestion[] = [];

  addQuestions():IQuestion[]{
    this.questions = [{id:1, questionText:"What is sin of 90 degrees?", options:[0, 1, 3.14, -1], correctOption:0},
    {id:2, questionText:"What does D represent in Roman numeral system?", options:[100, 500, 1000, 50], correctOption:1},
    {id:3, questionText:"Among the following which whole number has no predecessor?", options:[-1, 0, 1, 100], correctOption:1},
    {id:4, questionText:"Which of the following numbers gives 240 when added to its own square?", options:[15, 16, 18, 20], correctOption:0},
    {id:5, questionText:"What is 1004 divided by 2?", options:[52, 502, 520 ,5002], correctOption:1},
    {id:6, questionText:"The number of 3-digit numbers divisible by 6, is ?", options:[149, 166, 150, 151], correctOption:2},
    {id:7, questionText:"The average of first 50 natural numbers is ?", options:[25.3, 25.5, 25, 12.25], correctOption:1},
    {id:8, questionText:"106 * 106 - 94 * 94 = ?", options:[2004, 2400, 1904, 1906], correctOption:1},
    {id:9, questionText:"10001 - 101 = ?", options:[1001, 990, 9990, 990], correctOption:3},
    {id:10, questionText:"What is 121 times 11?", options:[1331, 1313, 1133, 3131], correctOption:0}
  ];
    return this.questions;
  }




  
}
