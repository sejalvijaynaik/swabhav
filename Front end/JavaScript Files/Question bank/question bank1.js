document.getElementById("startQuiz").addEventListener("click", createQusetion);
var questionCounter = 0;
var questionScoreArray = new Array();
var score = 0;


function QuestionMaker(id, text, options, answer){
    this.id = id;
    this.text = text;
    this.options = options;
    this.answer = answer;
}

var questionOne = new QuestionMaker(1, "What is sin of 90 degrees??", [0, 1, 3.14, -1], 0);
var questionTwo = new QuestionMaker(2, "What does D represent in Roman numeral system?", [100, 500, 1000, 50], 1);
var questionThree = new QuestionMaker(3, "Among the following which whole number has no predecessor?", [-1, 0, 1, 100], 1);
var questionFour = new QuestionMaker(4, "Which of the following numbers gives 240 when added to its own square?", [15, 16, 18, 20], 0);
var questionFive = new QuestionMaker(5, "What is 1004 divided by 2?", [52, 502, 520 ,5002], 1);
var questionSix = new QuestionMaker(6, "The number of 3-digit numbers divisible by 6, is ?", [149, 166, 150, 151], 2);
var questionSeven = new QuestionMaker(7,"The average of first 50 natural numbers is ?", [25.3, 25.5, 25, 12.25], 1);
var questionEight = new QuestionMaker(8, "106 * 106 - 94 * 94 = ?", [2004, 2400, 1904, 1906], 1);
var questionNine = new QuestionMaker(9, "10001 - 101 = ?", [1001, 990, 9990, 990], 3);
var questionTen = new QuestionMaker(10, "What is 121 times 11?", [1331, 1313, 1133, 3131], 0); 

var questionsArray = [questionOne, questionTwo, questionThree, questionFour, questionFive, questionSix, questionSeven, questionEight, questionNine, questionTen];


function createQusetion(e){
    
    if(e.target.value == "previous"){
        questionCounter = questionCounter - 2;
    }
    
    if(e.target.value == "next"){
        if(questionCounter > 0){
            var options = document.getElementsByName("quizOptions");
            for(var i = 0; i < options.length; i++){
                if(options[i].checked){
                    questionScoreArray[questionCounter - 1] = options[i].id;
                    break;
                }
                else{
                    questionScoreArray[questionCounter - 1] = -1;
                }
            }
        }    
    }
    

    document.body.innerHTML = "";

    var questionPara = document.createElement("p");
    questionEight.id = "questionPara";
    questionPara.innerHTML = questionCounter + 1 + ") " + questionsArray[questionCounter].text;
    document.body.appendChild(questionPara);
    
    for(var i = 0; i < 4; i++){

        var option = document.createElement("input");
        option.type = "radio";
        option.id = i;
        option.name = "quizOptions";
        option.value = questionsArray[questionCounter].options[i];

        var optionLabel = document.createElement("label");
        optionLabel.innerHTML = option.value;

        var breakLine = document.createElement("br");

        document.body.appendChild(option);
        document.body.appendChild(optionLabel);
        document.body.appendChild(breakLine);
        
    } 
    

    if((questionScoreArray[questionCounter] != undefined) && (questionScoreArray[questionCounter] != -1)){
        var option = document.getElementById(questionScoreArray[questionCounter]);
         option.checked = "true";
    }

    if(questionCounter > 0){
        var previousButton = document.createElement("button");
        previousButton.value = "previous";
        previousButton.innerHTML = "PREVIOUS";
        previousButton.addEventListener("click", createQusetion);
        document.body.appendChild(previousButton);
    }
    
    var nextButton = document.createElement("button");

    if(questionCounter == 9){
        nextButton.innerHTML = "SUBMIT";
        nextButton.addEventListener("click", scorePage);
        document.body.appendChild(nextButton);
        return;
    }
    nextButton.innerHTML = "NEXT";
    nextButton.value = "next";
    nextButton.addEventListener("click", createQusetion);
    document.body.appendChild(nextButton);

    questionCounter = questionCounter + 1;
}
    
function scorePage(){

    var unanswered = 0;
    var options = document.getElementsByName("quizOptions");
    for(var i = 0; i < options.length; i++){
        if(options[i].checked){
            questionScoreArray[questionCounter] = options[i].id;
            break;
        }
        else{
            questionScoreArray[questionCounter] = -1;
        }
    }

    for(var i = 0; i < 10; i++){
        if(questionScoreArray[i] == questionsArray[i].answer){
            score = score + 1;
        }
        if(questionScoreArray[i] == -1){
            unanswered = unanswered + 1;
        }
    }
    document.body.innerHTML = "";

    var pieCanvas = document.createElement("canvas");
    pieCanvas.width = "500";
    pieCanvas.height = "500";

    var categories = ["Correct", "Wrong", "Unanswered"];
    var percentages = [(score * 10), ((10 - score - unanswered) * 10), (unanswered * 10)];
    
    var ctx = pieCanvas.getContext('2d');
    var myChart = new Chart(ctx, {
    type: 'pie',
    data: {
        labels: categories,
        datasets: [{
            data: percentages,
            backgroundColor: ["#FFB6C1", "#87CEFA", '#98FB98'],
            borderWidth: 0.5 ,
            borderColor: '#ddd'
        }]
    },
    options: {
        responsive: false,
        maintainAspectRatio: false,
        title: {
            display: true,
            text: 'Your Score Chart',
            position: 'top',
            fontSize: 16,
            fontColor: '#111',
            padding: 20
        },
        legend: {
            display: true,
            position: 'bottom',
            labels: {
                boxWidth: 20,
                fontColor: '#111',
                padding: 15
            }
        },
        tooltips: {
            enabled: false
        },
        
        labels: {
            render: 'percentage',
            fontColor: "black",
            fontWeight : "bold",  /*function (data) {
              var rgb = hexToRgb(data.dataset.backgroundColor[data.index]);
              var threshold = 140;
              var luminance = 0.299 * rgb.r + 0.587 * rgb.g + 0.114 * rgb.b;
              return luminance > threshold ? 'black' : 'white';
            },*/
            precision: 2
          }
        
    }
});

document.body.appendChild(pieCanvas);

var scorePara = document.createElement("p");
scorePara.id = "scorePara";
scorePara.innerHTML = "You scored :" + (score*10) + "%........";
scorePara.style.float = "left";
document.body.appendChild(scorePara);

var messagePara = document.createElement("p");
messagePara.id = "messagePara";
messagePara.style.float = "left";
if(score >= 7){
    messagePara.innerHTML = "Congratulations!!! You passed the quiz";
    document.body.appendChild(messagePara);
    return;
}

messagePara.innerHTML = "Sorry, you failed the quiz... Please try again....";
document.body.appendChild(messagePara);

var tryAgainButton = document.createElement("button");
tryAgainButton.innerHTML = "TRY AGAIN";
tryAgainButton.style.float = "left";
tryAgainButton.addEventListener("click", redirectSelf);
document.body.appendChild(tryAgainButton);
}

function redirectSelf(){
    window.open("question bank1.html", "_self");
}



