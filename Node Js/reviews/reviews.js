var reviews = [2, 6, 9, 8, 0];
var total = 0;
for (var i = 0; i < reviews.length; i++) {
    console.log(reviews[i]);
    total = total + reviews[i];
}
console.log("Average = " + total / reviews.length);
