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
let amithab=new person("amithab","bachan",22,["c"],{city:"hyderabad",pincode:"521185"},"24/10/1996","false","sr analyst");
let abhisheik=new person("abhisheik",21,["html"],"08/06/1997","false","jr analyst");
abhisheik=Object.create(amithab);
let aaradhya=new person("aaradhya",12,["c"],"12/12/2012","false","analyst");
aaradhya=Object.create(abhisheik);
print=function(){
    console.log(aaradhya.lname);
    console.log(aaradhya.address);
    console.log(aaradhya.dateOfBirth);

}();