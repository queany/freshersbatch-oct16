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
amithab=new person("amithab","bachan",22,["c"],{city:"hyderabad",pincode:"521185"},"24/10/1996","false","sr analyst");
abhisheik=new person("abhisheik",21,["html"],"08/06/1997","false","jr analyst");
var abhisheik=Object.create(amithab);
print=function(){
    console.log(amithab);
    console.log(abhisheik.lname);
    console.log(abhisheik.address);
    console.log(abhisheik.dateOfBirth);

}();