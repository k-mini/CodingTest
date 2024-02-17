let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');
let T = parseInt(input[0]);

for (var i=1; i <= T;i++) {
    var arr = input[i].split(' ');
    var a = parseInt(arr[0]);
    var b = parseInt(arr[1]);
    console.log(a + b);
}