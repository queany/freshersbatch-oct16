
function person(fname,lname,age,skills,address,dateOfBirth,married,profession){
    this.fname=fname;
    this.lname=lname;
    this.age=age;
    this.skills=skills;
    this.address=address;
    this.dateOfBirth=dateOfBirth;
    this.married=married;
    this.profession=profession;
}
let person1=new person("nikhil","goud",22,["c"],{city:"hyderabad",pincode:"521185"},"24/10/1996","false","sr analyst");
let person2=new person("harish","chinna",21,["html"],"08/06/1997",{city:"ameerpet",pincode:"500038"},"false","jr analyst");
print=function(){
    console.log(person1);
    console.log(person2);

}();
