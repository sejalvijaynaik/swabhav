import { Component } from '@angular/core';
import { IQuestion } from '../question/question';
import { QuestionService } from '../services/question-service.service';

@Component({
  selector: 'question-bank',
  templateUrl: './question-bank.component.html',
  styleUrls: ['./question-bank.component.css']
})
export class QuestionBankComponent {

  questions:IQuestion[] = [];
  questionText:string = "";
  options:number[] = [];
  chosenOption:number = -1;
  chosenOptions:number[] = [10];
  currentQuestionNumber:number = 0;
  questionDivShow:string = "none";
  finalScore:number = 0;
  resultDiv:string = "none";
  previousButtonShow:string = "none";
  nextButtonText:string = "NEXT";
  unanswered:number = 0;
  startButtonShow:string = "inline-block";
  exitButtonShow:string = "none";

  constructor(private questionService:QuestionService) {
    window.document.body.style.backgroundColor = 'plum';
  }

  startQuiz():void{ 
    for(let i = 0; i < 10; i++){
      this.chosenOptions[i] = -1;
    }
    
    this.startButtonShow = "none";
    this.exitButtonShow = "inline-block";
    this.resultDiv = "none";
    this.nextButtonText = "NEXT";
    this.previousButtonShow = "none";
    this.currentQuestionNumber = 0;
    this.questionDivShow = "block";
    this.chosenOption = -1;
    this.questions = this.questionService.addQuestions();
    this.questionText = this.questions[this.currentQuestionNumber].id + ")  " + this.questions[this.currentQuestionNumber].questionText; 
    this.options = this.questions[this.currentQuestionNumber].options;
    this.setUnanswered();
    
  }

  setUnanswered():void{
    this.unanswered = 0;
    for(let i = 0; i < 10 ; i++){
     if(this.questions[i].answered == false){
       ++this.unanswered;
     }
    }
  }
  
  nextQuestion():void{
    this.previousButtonShow = "inline-block";

    if(this.chosenOption != -1){
      this.questions[this.currentQuestionNumber].answered = true;
    }
    
    this.chosenOptions[this.currentQuestionNumber] = this.chosenOption;
    ++this.currentQuestionNumber;
    if(this.currentQuestionNumber == 9){
      this.nextButtonText = "SUBMIT";
    }

    if(this.currentQuestionNumber > 9){
      this.endQuiz();
    }else{
      if(this.chosenOptions[this.currentQuestionNumber] == -1){
        this.chosenOption = -1;
      }
      else{
        this.chosenOption = this.chosenOptions[this.currentQuestionNumber];
      }
      this.questionText = this.questions[this.currentQuestionNumber].id + ")  " + this.questions[this.currentQuestionNumber].questionText;
      this.options = this.questions[this.currentQuestionNumber].options;
    }
    this.setUnanswered();
  }

  previousQuestion():void{
    if(this.chosenOption != -1){
      this.questions[this.currentQuestionNumber].answered = true;
    }
    this.chosenOptions[this.currentQuestionNumber] = this.chosenOption;

    if(this.chosenOptions[this.currentQuestionNumber] == -1){
      this.chosenOption = -1;
    }
    else{
      this.chosenOption = this.chosenOptions[this.currentQuestionNumber];
    }
    
    this.nextButtonText = "NEXT";
    --this.currentQuestionNumber;
    if(this.currentQuestionNumber == 0){
      this.previousButtonShow = "none";
    }
    this.chosenOption = this.chosenOptions[this.currentQuestionNumber];
    this.questionText = this.questions[this.currentQuestionNumber].id + ")  " + this.questions[this.currentQuestionNumber].questionText;
    this.options = this.questions[this.currentQuestionNumber].options;
    this.setUnanswered();
  }

  endQuiz():void{
    this.unanswered = 0;
    for(let i = 0; i < 10 ; i++){
      console.log(this.chosenOptions[i]);
      console.log(this.questions[i].answered);
      if(this.chosenOptions[i] == this.questions[i].correctOption){
        ++this.finalScore;
      }
      if(this.chosenOptions[i] == -1){
        ++this.unanswered;
      }
    }
    this.questionDivShow = "none";
    this.resultDiv = "block";
  }
  exitQuiz():void{
    window.open("index.html", "_self");
  }
}
