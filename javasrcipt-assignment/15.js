function bblSort(arr){
     
    for(var i = 0; i < arr.length; i++){
        
      
      for(var j = 0; j < ( arr.length - i -1 ); j++){
          
        if(arr[j] > arr[j+1]){
            
          var temp = arr[j]
          arr[j] = arr[j + 1]
          arr[j+1] = temp
        }
      }
    }
    // Print the sorted array
    console.log(arr);
}

var arr = [1,20,3,5,6,90,8,45,30,66,12,35];
 
bblSort(arr);