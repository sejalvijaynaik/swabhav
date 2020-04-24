var imageElement = document.getElementById("loaderImage");
var chechBoxElement = document.getElementById("clickMe");

imageElement.style.visibility = "hidden";

chechBoxElement.addEventListener("click", showImage);

function showImage(){
    if(chechBoxElement.checked == true){
        imageElement.style.visibility = "visible";
    }
    else if(chechBoxElement.checked == false){
        imageElement.style.visibility = "hidden";
    }
}

