var sliderElement = document.getElementById("mySlider");
var paraElement = document.getElementById("myPara");
sliderElement.addEventListener("input", displayNumber);

function displayNumber(){
    paraElement.innerHTML = sliderElement.value;


    
    for(i = 1; i <= sliderElement.value; i++){
        var buttonElement = document.createElement("button");
        buttonElement.innerHTML = i;
        paraElement.appendChild(buttonElement);
        
    }
}

