require("chromedriver");

let wd = require("selenium-webdriver");
// let chrome = require("selenium-webdriver/chrome");
let browser = new wd.Builder().forBrowser('chrome').build();
let matchesurls =[];

async function main(){
    await browser.get(`https://www.cricbuzz.com/cricket-series/3130/indian-premier-league-2020/matches`);
    
    await browser.wait(wd.until.elementLocated(wd.By.css(".cb-col-60.cb-col.cb-srs-mtchs-tm a")));
    let matches = await browser.findElements(wd.By.css(".cb-col-60.cb-col.cb-srs-mtchs-tm a"));

    for(let i in matches){
        matchesurls.push(matches[i].getAttribute("href"));
    }

    console.log(matchesurls);

}

main();