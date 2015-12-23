Selenium
=======

This repository contains Selenium WebDriver code examples, exercises and tutorials for developers.

Over time, more and more test example will be uploaded here.

All tests examples in this repository is to be considered public domain unless stated otherwise.  

### To get started

1. Open a terminal window/command prompt
2. Clone this project.
3. CD into project directory
4. mvn clean verify

All dependencies should now be automatically download to your computer.

### What should I know?

- To run any tests you just need to ensure that all test file names end, or start with "IT"
- For more information, please refer to [Apache Maven Failsafe Plugin](http://maven.apache.org/surefire/maven-failsafe-plugin/examples/single-test.html)

### Browsers

You can specify which browser to use by using one of the following switches:

- -Dbrowser=firefox
- -Dbrowser=chrome
- -Dbrowser=ie
- -Dbrowser=phantomjs

You don't need to worry about downloading the IEDriverServer, or chromedriver binaries, this project will do that for you automatically.

### Selenium Grid2

You can specify a grid to connect to where you can choose your browser, browser version and platform:

- -Dremote=true 
- -DseleniumGridURL=http://{username}:{accessKey}@ondemand.saucelabs.com:80/wd/hub 
- -Dplatform=xp 
- -Dbrowser=firefox 
- -DbrowserVersion=33

### Multi-Threads

You can even specify multiple threads (you can do it on a grid as well!):

- -Dthreads=2

You can also specify a proxy to use

- -DproxyEnabled=true
- -DproxyHost=localhost
- -DproxyPort=8080

If the tests fail screenshots will be saved in ${project.basedir}/target/screenshots

If you need to force a binary overwrite you can do:

- -Doverwrite.binaries=true


###Contributions

If you have any code examples you would like to contribute to this repository, please feel free to open a pull request.

##Feedback

Contributors to this repo would be very grateful to receive feedback! If you would like to praise or comment on any test examples, or the repo as a whole, please do so in the issue tracker. I'd love to hear what you think, so please take a moment to let me know.


##Contact

If you have any questions about this repo, or need some help to contribute, please do not hesitate to contact me.
