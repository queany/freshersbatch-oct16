class Rectangle{
    width=10;
    height=20;
}
var r1=new Rectangle();
Rectangle.prototype.getArea=function(){
    return this.width*this.height;
}
console.log(r1.getArea());
