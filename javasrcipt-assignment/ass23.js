function isEven(num){
    if(num %2==0){
        return true;
    }
    else{
        return false;
    }
    }

console.log(isEven(3));
console.log(isEven(4));
var array=[1,3,5,4,2];
var found=array.find(isEven);
console.log(found);
