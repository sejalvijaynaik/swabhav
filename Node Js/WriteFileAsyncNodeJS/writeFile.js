fs = require("fs");
fs.writeFile("hello.txt", "hello world", function (err, data) {
    if (err) return console.log(err);
    console.log(data);
});
console.log("end of program");

