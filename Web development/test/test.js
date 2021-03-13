let obj = {
    NewObj: {
        obj2: {
            obj5: {
                one: 1,
            },
        },
    },
    obj3: {
        obj4: {
            two: 2
        },
    },
};

let x = {
    newObj:{
        obj2:{
            obj5:{
                one: 1,
                two: {
                    objlast: 123
                }
            }
        }
    },
    obj3:{
        obj4:{
            two:2
        }
    }
}
  
function flatten(ob) { 
    let result = {}; 
  
    for (let i in ob) { 

        if (typeof(ob[i]) == 'object') { 
            const temp = flatten(ob[i]); 
            for (const j in temp) { 
  
                result[i + '.' + j] = temp[j]; 
            } 
        }   
        else { 
            result[i] = ob[i]; 
        } 
    } 
    return result; 
}; 
  
console.log(flatten(x));


