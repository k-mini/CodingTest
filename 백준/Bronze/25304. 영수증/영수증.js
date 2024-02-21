let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
let X = parseInt(input.splice(0,1)[0]);
let N = parseInt(input.splice(0,1)[0]);
let Y = 0;

for (var i=0;i<N;i++){
    var [price, cnt]= input.splice(0,1)[0].split(' ').map(i => parseInt(i));
    Y += price * cnt;
}
if (X === Y) {
    console.log('Yes');
}
else {
    console.log('No');   
}
