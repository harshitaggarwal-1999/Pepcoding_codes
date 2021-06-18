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