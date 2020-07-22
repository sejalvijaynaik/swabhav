"use strict";
/*var employee={
     id:1,
      greet:function()
         {
             var self = this;
             setTimeout(function(){console.log(self.id)},1000);
         }
    
     };

employee.greet();*/
var employee = {
    id: 1,
    greet: function () {
        setTimeout(() => { console.log(this.id); }, 1000);
    }
};
employee.greet();
