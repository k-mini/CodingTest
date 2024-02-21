let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
let [N,X] = input[0].split(' ').map(i => parseInt(i));
let arr = input[1].split(' ')
            .map(i => parseInt(i))
            .filter(j=> j<X);
console.log(...arr);

