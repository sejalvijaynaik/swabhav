let sports:string[] = ["golf", "cricket", "tennis"];
sports.push("football");
sports.push("hockey");

for(let tempSport of sports){
    if(tempSport == "golf"){
        console.log(tempSport + ">>>Mah fav sport");
    }
    else{
        console.log(tempSport);
    }
}