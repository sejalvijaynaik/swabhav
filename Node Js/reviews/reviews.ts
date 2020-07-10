let reviews:number[] = [2, 6, 9, 8, 0];

let total = 0;

for(let i = 0; i < reviews.length; i++){
    console.log(reviews[i]);
    total = total + reviews[i];
}

console.log("Average = " + total/reviews.length);