#!/usr/bin/env node

// console.log("hello");

// const fs = require('fs');

// let data = fs.writeFileSync("abc.txt","utf-8");
// fs.writeFileSync("abc.txt",data+ " Hello, this is pepcoding");//append anything in file
// console.log(fs.existsSync("abc.txt"));//if file exist or not

// console.log(process.argv);


let cmds = process.argv.slice(2);
const fs = require("fs");



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
    let linenum = 1;
    for(i in files){
        let data = fs.readFileSync(files[i],"utf-8");//copies ALL not line wise all data data from cmds, cmds is the name of files which is given from command prompt
        if(options.includes("-n") && options.includes("-s")){
            let lines = data.split("\r\n");
            for(j in lines){
                if(lines[j] != ""){
                    console.log(linenum + " " + lines[j]);
                    linenum+=1;
                }
            }
        }
        if(options.includes("-s") && !options.includes("-n")) {
            let lines = data.split("\r\n");
            let allText = "";
            for(j in lines) {

                if(lines[j] != ""){
                    allText += lines[j]+"\n";
                }
            }
            console.log(allText);
            // console.log(lines);
            // return;//hatana paddega nahi to aur line nahi chalegi
        }
        if(options.includes("-n") && !options.includes("-s")) {
            let lines = data.split("\r\n");
            for(j in lines){
                console.log(linenum + " " +lines[j]);
                linenum += 1;
            } 
        }
        // linenum = 1;

        if(!options.includes("-n") && !options.includes("-s")){
            console.log(data);
        }
        
        
        
    }
    
}

wcat(cmds);