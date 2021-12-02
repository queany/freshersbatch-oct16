function longestWord(arr){

    return arr.slice().sort((a,b)=>{return b.length - a.length;
    })[0]

}
function myTextBox(arr){
    let finalString='';
    let word=longestWord(arr);
    let asterisk='*'.repeat(word.length + 4);
    for(let i=0;i<arr.length;i++){
        if(arr[i].length<word.length){
            let sub=word.length-arr[i].length;
            let spaces=''.repeat(sub);
            finalString+=`* ${arr[i]} ${spaces} *\n`;
        }
        else{
            finalString+=`* ${arr[i]} *\n`;
        }
    }
    finalString+=asterisk;
    console.log(finalString);
        }
    
myTextBox(["Hello","World","in","a","frame"])