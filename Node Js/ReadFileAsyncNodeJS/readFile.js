var fs = require("fs");
fs.readFile("hello.txt", "utf8", function (err, data) {
    if(err){
        console.log(err);
    }
    console.log(data);
});
console.log("end of program");