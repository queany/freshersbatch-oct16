class Rectangle{
    constructor(width,height){
    this.width=width;
    this.height=height;
    }
    getArea=function(){
        console.log(this.width*this.height);
    }
}
var r=new Rectangle(4,5);
console.log(r.height,r.width);
r.hieght=50;//new hieght property is added with value 50
r.getArea();
