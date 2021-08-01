// var n=5
// console.log("\n")
// let str=""
// for (var i = 1; i <= n; i++) {
//     for (var j = 0; j < i; j++) {
//         str = str + "*"
//     }
//     str = str + "\n"
// }
// console.log(str);


var n=5
var str="";
for (var i = 1; i <=1n; i++) {
    for (var k = 1; k <=n-i; k++){
        str += "  "
        //console.log(str)
    }
    for(var j=0; j<(2*i-1) ; j++)
    {
        str += "*";
        //console.log(str)
    }
    str = "\n";
}
console.log(str)