function func(){
const number=100;
let n1=1, n2=1, nextTerm;
for(let i=1;i<=number;i++){
    if(n1>100){
        break;
    }
    console.log(n1);
    nextTerm=n1+n2;
    n1=n2;
    n2=nextTerm;
}
}
func();