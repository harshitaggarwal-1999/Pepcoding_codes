let words = ['spray','limit','eite','exurberant','destruction'];
//t want to get words whose character length is greater than 6

let narr = [];
for(let i = 0 ; i < words.length; i++){
    let word = words[i];
    if(word.length>6){
        narr.push(word);
    }
}
console.log(narr);

narr = words.filter(function(el){
    console.log(el);
    return el.length>6;
})
console.log(narr);

//2nd try of filter

// let arr = [1,2,3,4,5,6,7,8];

// // let narr = []
// // //traditional way
// // for(let i = 0; i < arr.length; i++){
// //     if(arr[i]>3){
// //         narr.push(arr[i]);
// //     }
// // }
// // console.log(narr);
// //filter use

// let narr = arr.filter(function(el){
//     return el>3;
// });
// console.log(narr);