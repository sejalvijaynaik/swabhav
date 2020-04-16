var randomNumber = Math.floor((Math.random() * 10)) + 1;

$("#numberEntered").click(function(){
    var userNumber = $("#userGuess").val();
    if(userNumber == randomNumber){
        $("#UserInform").html("Congratulations You guessed right!!!");
        return;
    }
    if(userNumber > randomNumber){
        $("#UserInform").html("Go Lower!!!");
        return;
    }
    if(userNumber < randomNumber){
        $("#UserInform").html("Go Higher!!!");
        return;
    }
});