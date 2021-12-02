var arr=[];
while(arr.length<100){
    var r=Math.floor(Math.random()*100)+1;
    if(arr.indexOf(r)===-1)arr.push(r);
}
console.log(arr);
function largest(arr){
    let i;
    let max=arr[0];
    for(i=1;i<arr.length;i++){
        if(arr[i]>max)
        max=arr[i];
    }
    return max;
}
console.log("The largest in the array is:" +largest(arr));
function smallest(arr){
    let j;
    let small=arr[0];
    for(j=1;j<arr.length;j++){
        if(arr[j]<small)
        small=arr[j];
    }
    return small;
}
console.log("The largest in the array is:" +smallest(arr));
var sum=arr.reduce(function(a,b){
    return a+b;
});
console.log("The sum of the array:"+sum);
function avg(arr){
    var sum=0;
    arr.forEach(function(item,idx){
        sum+=item;
    });
    return sum/arr.length;
}
//console.log("The sum of the array is:" +sum(arr));
console.log("The average of the array is:" +avg(arr));
function CountEvenOdd(arr,arr_size)
{
    let even_count=0;
    let odd_count=0;
    for(let z=0;z<arr_size;z++){
        if(arr[z] & 1 == 1)
        odd_count++;
    else
        even_count++;
    }
console.log("Number of even elemnts=" +even_count);
console.log("Number of odd elemnts=" +odd_count);
}
let n=arr.length;
CountEvenOdd(arr,n);
