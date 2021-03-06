// let a = 20;
// let a  = 10;
// console.log(a);

// const a = 20;
// const a  = 10;
// console.log(a);

// let a = 20;
// a  = 10;
// console.log(a); // 10

// var a = 20;
// a  = 10;
// console.log(a); //10

// const c = 10;
// c = 20;
// console.log(c); // error

// function temp() {
//     {
//         var a = 10;
//     }

//     console.log(a); //10 as 'var' is function type
// }

// temp();

// function temp() {
//     {
//         let a = 10;
//     }

//     console.log(a); //error as 'let' is block type
// }

// temp();

// let a = 1;
// {
//     let a = 2;
//     console.log(a);//2 see this is not redeclared as 'let' is block scope
//     {
//         let a = 3;
//         console.log(a);//3 this is also not redeclared as 
//     }
// }


// let a = 1;
// {
//     console.log(a);
//     let a = 2; // error as compile time me a store hua hoga but not with vaue so jab run time pr aaya hoga to a present dikhega but value nah kyuki runtime me vale baad me assign hui hogi.
    
//     {
//         let a = 3;
//         console.log(a);
//     }
// }

// let arr = [];
// arr[0] = 1;
// arr.push(4);
// arr[2] = 3;
// arr.push(4);
// console.log(arr);

// let arr1 = [1,2,3,4];
// console.log(arr1);

// arr[100] = 25;

// arr.pop();
// console.log(arr);

// let arr = [1,'b',"bhavesh" , 1.3,true];
// console.log(arr);

// for(let i = 0; i < arr.length; i++){
//     console.log(arr[i]);
// }

// let arr = new Array('b');
// console.log(arr); // output = ['b']

// for(let i = 0; i < 2; i++){
//     for(let i = 4; i < 5; i++){
//         console.log(i);
//     }
// }output = 4
//           4

// for(let i = 4; i < 5; i++){
//     console.log(i);
// }

// for(let i = 4; i < 5; i++){
//     console.log(i);
// }
// output = 4
//          4


// let i = 0;
// console.log(i);
// let i = 1;
// console.log(i); // output = error as i is declared again in same scope

// for(let i = 0 ; i < 5; i++){
//     console.log(i); // output = error as accessing before declaratiion
//     let i = 10;
//     console.log(i);
//     for(let i = 3; i < 4; i++){
//         console.log(i);
//     }
// }

// for(let i = 0; i < 2; i++){
//     for(i = 4; i < 5; i++){
//         console.log(i);
//     }
// }output = 4

// for(let i = 0; i < 7; i++){
//     for(i = 4; i < 5; i++){
//         console.log(i);
//     }
// }output = infinte 4

// let arr = [5,6,7,8];

// for(i in arr){
//     console.log(i);
//     console.log(arr[i]);
// }

// arr.forEach(function(a,b){
//     console.log(b,a);
// });

// function hello(data, index) {
//     console.log(data);    
// }

// arr.map(hello);

// arr = arr.map(function(data, index) {
//     return data + 2;
// });
// console.log(arr);

// for(let i = 0; i < arr.length; i++){
//     arr[i] += 2;
// }

// DELETE VALUES IN ARRAY

// delete arr[1];
// console.log(arr); // value empty or better say undefined hojaegi bas.

// TO REMOVE COMPLETELY
//arr.splice(a,b)
//a = kaha kis index se shuru hoga removal
//b = kitne remove karne hai 'a index' ke baad

// arr.splice(1,2);//[5,8]
// arr.splice(3,1);//[5,6,7]
// arr.splice(5,2);//same thing
// arr.splice(-2,2);//[5,6]
// arr.splice(-1,1);//[5,6,7]

// let arr = [5,6,7,8,10,12,14,16];
// arr.forEach(function(data,index){
//     if(arr[index]%2 == 0){
//         arr.splice(index,1);
//     }
    

// });//bad way as ye for loop ki trh behave kar raha hai aur isme jaise ek remove hoga vese hi doosra aa jaega aur i++ ki vjh se vo ek value miss ho jaegi.

// FILTER

// arr = arr.filter(function(data, index){
//     // return !(data%2 == 0);
//     if(data%2 == 0){
//         return false;
//     }else {
//         return true;
//     }
// });

// console.log(b);

// 06-03-2021 CLASS 2 
//OBJECTS IN JAVASCRIPT

// let obj = {
//     "abc" : "hello",
//     "abc1" : [1,2,3,4],
//     "abc2" : function(){console.log("hello");},
//     1 : 123,
//     2 : {
//         "hello" : "how are you(nested object)"
//     }
// }

// obj.abc2();

// console.log(obj[2]);
// console.log(obj[2].hello);
// console.log(obj[2]["hello"]);

// console.log(Object.keys(obj));


// -------EVERYTHNG IN JS IS OBJECT-----------

// let arr = [1,2,3,4];
// arr['abc'] = "hello";
// console.log(arr);
// console.log(arr[4]);
// console.log(arr['abc']);

// arr[4] = "abc";
// console.log(arr);
// console.log(arr.length);

// ---------- QUESTION-----------
// QUES: https://www.freecodecamp.org/learn/javascript-algorithms-and-data-structures/basic-javascript/record-collection

// Setup
// var collection = {
//     2548: {
//       albumTitle: 'Slippery When Wet',
//       artist: 'Bon Jovi',
//       tracks: ['Let It Rock', 'You Give Love a Bad Name']
//     },
//     2468: {
//       albumTitle: '1999',
//       artist: 'Prince',
//       tracks: ['1999', 'Little Red Corvette']
//     },
//     1245: {
//       artist: 'Robert Palmer',
//       tracks: []
//     },
//     5439: {
//       albumTitle: 'ABBA Gold'
//     }
//   };
  
//   // Only change code below this line
//   function updateRecords(object, id, prop, value) {
//     if(prop != "tracks" && value != ""){
//         object[id][prop] = value;
//     }
//     if(prop == "tracks" && object[id]["tracks"] == undefined){
//         object[id][prop] = [value];
//     }

//     if(prop == "tracks" && value != ""){
//         object[id][prop].push(value);
//     }

//     if(value == ""){
//         delete object[id][prop];
//     }
//     return object;
//   }
  
//   updateRecords(collection, 5439, 'artist', 'ABBA');

//-------------------QUESTION ------------------------
// QUES: https://notepad.pw/l22wqq6x

// let input1 = [
//     { name: "Delhi", rainfall: [2.3, 4, 3.1, 5.5, 1.1, 1.2, 7] },
//     { name: "Noida", rainfall: [6.3, 0, 0.1, 3.5, 1, 2.6, 0.7] },
//     { name: "Dehradun", rainfall: [12, 5.6, 3.1, 0.55, 11, 16.2, 19] },
//     { name: "Nanital", rainfall: [8, 1.4, 0.61, 15.5, 6.6, 2, 9.82] },
// ];

// for(i in input1){
//     let sum = 0;
//     for(j in input1[i].rainfall){
//         sum += input1[i].rainfall[j];
//     }
//     let avg = sum/(input1[i].rainfall.length);
//     delete input1[i].rainfall;
//     input1[i]["avgRainfall"] = avg;
// }

// console.log(input1);

//SECOND METHOD

// let output = input1.map(function(data,index){
//     let sum = 0;
//     for(i in data.rainfall){
//         sum += data.rainfall[i];
//     }
//     let avg = sum/(data.rainfall.length);
//     return {
//         name: data.name,
//         avgRainfall: avg
//     };
// });

// console.log(output);







