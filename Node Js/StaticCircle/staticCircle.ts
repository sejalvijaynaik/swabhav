class Circle{
    static pi:number = 3.14; 

    static calculateArea(radius:number):number{
        return Circle.pi * radius * radius; 
    }

    static calculatePerimeter(radius:number):number{
        return 2 * Circle.pi * radius;
    }
}

console.log(Circle.calculateArea(10));
console.log(Circle.calculatePerimeter(10));


