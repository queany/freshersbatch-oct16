function isEven(num) { return num % 2 === 0; }

function findRight(array, fn) {
    if (!array.length) {
        return;
    }

    var p = array.pop();
    return fn(p) ? p : findRight(array, fn);
}

console.log(findRight([1, 3, 5, 4, 2], isEven)); 
console.log(findRight([1, 3, 5], isEven));   