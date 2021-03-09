#!/usr/bin/env node

// console.log("hello");

// const fs = require('fs');

// let data = fs.writeFileSync("abc.txt","utf-8");
// fs.writeFileSync("abc.txt",data+ " Hello, this is pepcoding");//append anything in file
// console.log(fs.existsSync("abc.txt"));//if file exist or not

// console.log(process.argv);


let cmds = process.argv.slice(2);
const fs = require("fs");

// -s remove lines(wcat filename -s)
// -n count lines(wcat filename -n)

// -b no numbering on empty lines

// options array = ['-s' , '-n' , '-b']

function wcat(cmds) {


    
    let options = cmds.filter(function(data, index){
        return data.startsWith("-");
    });

    let files = cmds.filter(function(data, index){
        return !data.startsWith("-");
    });

    if(files.length ==  0){
        console.log("Please specify a file name to read.");
        return;
    }
    
    for(i in files){
        if(!fs.existsSync(files[i])){
            console.log(files[i] + "does not exist");
            return;
        }
    }
    // writing commands
    if(options.includes('-w')) {
        if(options.length != 1 || files.length != 2 || cmds.indexOf('-w') != 1){
            console.log("command not found");
            return;
        }
        let data = fs.readFileSync(files[0],"utf-8");
        fs.writeFileSync(files[i],data);
        return;
    } else if(options.includes('-a')) {
        if(options.length != 1 || files.length != 2 || cmds.indexOf('-a') != 1){
            console.log("Command not found");
            return;
        }
        let file1 = fs.readFileSync(files[0],"utf-8");
        let file2 = fs.readFileSync(files[1],"utf-8");
        fs.writeFileSync(files[1], file2 + "\n" +  file1);
        return;
    }

    // reading commands
    // ------------------my code --------------------
//     let linenum = 1;
//     for(i in files){
//         let data = fs.readFileSync(files[i],"utf-8");//copies ALL not line wise all data data from cmds, cmds is the name of files which is given from command prompt
//         // if(options.includes("-n") && options.includes("-s")){
//         //     let lines = data.split("\r\n");
//         //     for(j in lines){
//         //         if(lines[j] != ""){
//         //             console.log(linenum + " " + lines[j]);
//         //             linenum+=1;
//         //         }
//         //     }
//         // }
//         if(options.includes("-s")) {
//             let lines = data.split("\r\n");
//             let allText = "";
//             for(j in lines) {
//                 if(!options.includes('-n')){
//                     if(lines[j] != ""){
//                         allText += lines[j]+"\n";
//                     }
//                 }else {
//                     if(lines[j] != ""){
//                         console.log(linenum + " " +lines[j]);
//                         linenum += 1;
//                     }
//                 }
//             }
//             console.log(allText);
//             // console.log(lines);
//             // return;//hatana paddega nahi to aur line nahi chalegi
//         }
//         // if(options.includes("-n") && !options.includes("-s")) {
//         //     let lines = data.split("\r\n");
//         //     for(j in lines){
                
//         //     } 
//         // }
//         // linenum = 1;
//         // ----------------------to be done ---------------------------
//         else if(options.includes('-n') && !options.includes('-b') || ((options.includes('-n') && options.includes('-b')) && options.indexOf('-b')>options.indexOf('-n'))){
//             let lines = data.split("\r\n");

//             for(j in lines){
//                 console.log(linenum + " " + lines[j]);
//                 linenum++;
//             }
//         } else if(options.includes('-b')){
//             let lines = data.split("\r\n");
//             for(j in lines){
//                 if(lines[j] == ""){
//                     console.log(lines[j]);
//                 }else {
//                     console.log(linenum + " " + lines[j]);
//                 }
//             }
//         }

//         else {
//             console.log(data);
//         }

//         // if(options.includes("-b")) {
//         //     let lines = data.split("\r\n");
//         //     for(j in lines) {
//         //         if(lines[j] == ""){
//         //             console.log(lines[j]);
//         //         }
//         //         else {
//         //             console.log(linenum + " " + lines[j]);
//         //         }
//         //     }
//         // }
        
        
        
//     }
    
// }
    let numbering = 1;

    for(i in files) {
        let data = fs.readFileSync(files[i],"utf-8");
        if(options.includes("-s")) {
            let lines = data.split("\r\n");
            // let allText = "";
            for(j in lines) {
                if(lines[j] != "") {
                    if(options.includes("-n") || options.includes("-b")) {
                        console.log(numbering + ". " + lines[j]);
                        numbering += 1;
                    } else {
                        console.log(lines[j]);
                    }
                    // allText += lines[j] + "\n";
                }
            }
            // console.log(allText);
            // console.log(lines);
        } else if((options.includes("-n") && !options.includes("-b")) || (options.includes("-n") && options.includes("-b") && (options.indexOf("-n") < options.indexOf("-b")))) {
            let lines = data.split("\r\n");
            for(j in lines) {
               console.log(numbering + ". " + lines[j]);
               numbering++; 
            }
        } else if(options.includes("-b")) {
            let lines = data.split("\r\n");
            for(j in lines) {
                if(lines[j] == "") {
                    console.log(lines[j]);
                } else {
                    console.log(numbering + ". " + lines[j]);
                    numbering += 1;
                }
            }
        }
        else {
            console.log(data);
        }
    }
}

wcat(cmds);