function count_heads(flips){
    var heads=0;
    var results;
    for(let i=0;i<flips;i++){
        results=Math.floor(Math.random()*2);
        if(results==0){
            heads++;
        }
    }
    console.log("The outcome for heads is: " + (heads/flips));

}
var n = Number(prompt("How many times do you want to flip?"));
console.log("How many times do you want to flip the coin?" +n,"<br>");
count_heads(n);
