var newWindow = window.open("", "_blank", "width=400, height=200");
var newDoc = newWindow.document;

 var para = newDoc.createElement("p");
 para.innerHTML = "i am child window";
 para.style.fontSize = "100px";
 newDoc.body.appendChild(para);
 var button = newDoc.createElement("button");
 button.innerHTML = "Go back";
 button.addEventListener("click", redirectParent);
 newDoc.body.appendChild(button);

 function redirectParent(){
     
    newWindow.opener.open("new window.html", "_self");
 }

