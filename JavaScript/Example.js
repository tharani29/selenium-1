/*
    You need to start 'selenium server' before running the test

    Now copy & paste the following command into the terminal:
    $ java -jar /Users/sayem/Dropbox/Jar\ Folder/selenium-server-standalone-2.30.0.jar
    Now press "Enter" and selenium server will start....

    To run the test, open a new "tab" in the terminal and enter following command: (path to the script)
    $ node /Users/sayem/IdeaProjects/Selenium/JavaScript/example.js

 */


var webdriver = require('selenium-webdriver');

var driver = new webdriver.Builder().
    usingServer('http://localhost:4444/wd/hub').
    withCapabilities({'browserName': 'firefox'}).
    build();

driver.get('http://www.google.com');
driver.findElement(webdriver.By.name('q')).sendKeys('webdriver');
driver.findElement(webdriver.By.name('btnG')).click();
driver.wait(function() {
    return driver.getTitle().then(function(title) {
        return title === 'webdriver - Google Search';
    });
}, 1000);

driver.quit();