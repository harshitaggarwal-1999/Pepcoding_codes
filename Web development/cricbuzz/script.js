require("chromedriver");
let wd = require("selenium-webdriver");
let browser = new wd.Builder().forBrowser('chrome').build();
let matchId = 30880;
let batsmanColumns = ['playerName', 'out', "runs" , "ballsPlayed" , "fours", "sixes", "strikeRate"];
let innings1Batsmen = [];
let innings = 2;
// builder initialize karta hai aur inform karta hai browser ko ki kuch bana hai aur for browser se browser select karo and build() build kardega

async function main () {
    
    // if await not there then hello23 tab tak print nahi hoga jab tk site puri load nahi ho jata hai
    await browser.wait(wd.until.elementLocated(wd.By.css(".cb-nav-bar a")));
    let buttons = await browser.findElements(wd.By.css(".cb-nav-bar a"));
    await buttons[1].click();
    await browser.wait(wd.until.elementLocated(wd.By.css(`#innings_${innings} .cb-col.cb-col-100.cb-ltst-wgt-hdr`)));
    let tables = await browser.findElements(wd.By.css(`#innings_${innings} .cb-col.cb-col-100.cb-ltst-wgt-hdr`));
    let innings1BatsmenRows = await tables[0].findElements(wd.By.css(".cb-col.cb-col-100.cb-scrd-itms"));
    // let firstrowColumns = await innings1BatsmenRows[0].findElements(wd.By.css("div"));
    // console.log(firstrowColumns.length);
    // console.log("hello23");
    for(let i = 0; i < (innings1BatsmenRows.length - 3); i++){
        let columns = await innings1BatsmenRows[i].findElements(wd.By.css("div"));
        let data = {};
        for(j in columns) {
            if(j != 1){
                data[batsmanColumns[j]] = await columns[j].getAttribute("innerText");
                //sirf innerText laa kr dega like phillipe , dhoni as such  jo black colour se hai
                // console.log(temp);
            }
        }
        innings1Batsmen.push(data);
    }
    console.log(innings1Batsmen);

    // format of data storing
    // innings1Batsmen[{
    //     palyername :
    //     balls:
    //     fours:
    //     sixs:
    //     strikeRate:
    // }]
    // console.log(innings1Batsmen);

    // ---------------------------------------------------BOWLERS---------------------------------------
    


}

main();
// console.log("hello12");


