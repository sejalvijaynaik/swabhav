fs = require("fs");
fs.writeFileSync("hello.txt", "hello world"); 
console.log(fs.readFileSync("hello.txt", "utf8"));
console.log("end of program");

