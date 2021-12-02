function fun(){
const arr1=["a","b","c"];
const arr2=[1,2,3];
let run=0,first=0,second=0;
const newarr=[];
while(run<arr1.length+ arr2.length){
    if(first>second){
        newarr[run]=arr2[second];
        second++;
    }
    else{
        newarr[run]=arr1[first];
        first++;
    }
    run++;
}
console.log(newarr);
}
fun();