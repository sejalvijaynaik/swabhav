    var mymath = function()
    {
        var obj={};
       //var x=10; //private
      var y=20;
        obj.x=10;
       // obj.y=20;
        obj.isPrime=(n)=>{
          //  console.log(x);
            //debugger;
            for (let i =2; i < n/2; i++) {
                if(n%i==0)
                    return "Not Prime Number"
            }
            return "Prime Number"
        }
        return obj;
    }();

   console.log(mymath.isPrime(12));
   console.log(mymath.x);
   console.log(mymath.y);
