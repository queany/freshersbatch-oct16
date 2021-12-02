let number=+prompt('Enter a integer:');
function parity(number){
    if(number%2===0){
        return "even";
    } else {
        return "odd";
    }
}
console.log(parity(number));