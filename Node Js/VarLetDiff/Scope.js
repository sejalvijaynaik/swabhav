/*function outerFunc(){
    
    {
        var num = 10; 
    }
    console.log(num);
}

outerFunc();*/

/*function outerFunc(){
    
    {
        let num = 10; 
    }
    console.log(num);
}

outerFunc();*/

function outerFunc(){
    
    {
        function innerFunc(){
            var num = 10;
        } 
    }
    console.log(num);
}

outerFunc();