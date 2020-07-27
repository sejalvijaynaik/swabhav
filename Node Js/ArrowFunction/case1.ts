var employee = {
    id:1,
    greet : ()=>
    {
       console.log(this.id);
    }
};

employee.greet();