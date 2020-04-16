function engine(){
    return "Engine started";
}

function car (name, engine){
    return name + engine();
}

alert(car("beat", engine));
