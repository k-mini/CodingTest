let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim();
let difference = 2541 - 1998;
console.log(input - difference);