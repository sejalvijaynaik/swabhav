var sports = ["golf", "cricket", "tennis"];
sports.push("football");
sports.push("hockey");
for (var _i = 0, sports_1 = sports; _i < sports_1.length; _i++) {
    var tempSport = sports_1[_i];
    if (tempSport == "golf") {
        console.log(tempSport + ">>>Mah fav sport");
    }
    else {
        console.log(tempSport);
    }
}
