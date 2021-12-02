const square=(x) => x*x;
const double=(x)=>x*2;
const compose=(...fns)=>val =>fns.reduceRight((prev,fn)=>fn(prev),val);

const comRes=compose(square,double)(5);
const comRes2=compose(square,double)(10);

const comResult=compose(square,double)(5);
const comResult12=compose(square,double)(10);
console.log(comRes);
console.log(comRes2);
console.log(comResult);
console.log(comResult12);
