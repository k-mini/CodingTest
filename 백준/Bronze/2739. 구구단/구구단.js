let fs = require('fs');
let a = parseInt(fs.readFileSync('/dev/stdin').toString().trim());

for (var i=1;i<=9;i++) {
    var result = a * i;
    console.log(a + ' * ' + i + ' = ' + result);
}