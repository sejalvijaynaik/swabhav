/*var marks=[10,20,30,40];

for(var m of marks){
    
    console.log(m);
}
mutable(marks);

function mutable(marks){
    for(var m of marks){
        marks[m]=0;
        
    }
}
for(var m of marks){
    
    console.log(m);
}*/

var marks = [10, 20, 30 ,40];
var count = 0;
var a = 100;
for(a of marks){

    marks[a] = 0;
    console.log("Iteration " + count);
    console.log("value of a : " + a);
    console.log("value of marks element : " + marks[count]);
    count = count + 1;
}

console.log(a);
console.log(marks[0]);

/*for(var b of marks){
    console.log(b);
}*/