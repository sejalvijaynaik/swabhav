let displaycolr = function (message:string ,...colors:string[]) {
        console.log(message);
         for (let i of colors) {
             console.log(i);
    
         }
     }

     let myMessage:string ="list of colors";
     displaycolr(myMessage,"red");
     //displaycolr(myMessage,"red", "blue");
     //displaycolr(myMessage,"red", "blue", "green");