// object = group of key value pair
// key: value -> property
// key: function -> method

let avenger = {
    firstname: "Harshit",
    lastname: "Aggarwal",
    age: 21,
    isAvenger: true,
    sayhi: function (){
        console.log("Harshit says Hi");

    },
    address: {
        flanumber: 346,
        streetname: "pocket-D",
    }
}
console.log(avenger);
console.log(avenger.address.streetname);
avenger.friends=["Tushar","Disha","ishaan"];
console.log("............................................");
console.log(avenger);
avenger.sayhi();

for(let key in avenger){
    console.log(key, " : ", avenger[key]);
}

let propkey = "age";
console.log(avenger[propkey]);
// square bracket pehle replace karega phir usse object ki keys me dhundhega where as fullstop seedha hi usse object ki keys me dhudhega
