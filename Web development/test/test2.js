var file = process.argv[2];
// console.log(args);

const fs =  require("fs");


    
let data = fs.readFileSync(file,"utf-8");
// let lines = data.split("\r\n");
// let countn = 0;
// for(i in lines){
//     let currline = lines[i];
//     for(let j = 0; j < currline.length; j++){
//         if(currline[j] == 'n')countn++;
//     }

// }

// let countn = 0;

let linesarr = data.split("n");

console.log(linesarr.length - 1);


// console.log(countn);

// Countn(file);
