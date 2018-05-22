#Longest words in a sentence

This is a simple Java project to find the longest words in a given sentence.

##Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

###Prerequisites

In order to successfully run/debug this project, please install the following.
   - Java 8
   - An open java editor like Eclipse
   - Maven
   
####Installation 
1. To install Java 8 in your machine, please follow the steps mentioned [here.](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html) 
2. To install Eclipse in your machine, please follow the steps mentioned  [here.](https://wiki.eclipse.org/Eclipse/Installation) 
3. To install maven in your machine, please follow the steps mentioned [here.](https://www.mkyong.com/maven/how-to-install-maven-in-windows/) 
4. Optional, to install maven in Eclipse, please follow the steps mentioned [here.](http://toolsqa.com/java/maven/how-to-install-maven-eclipse-ide/) 
5. Optional, to install TestNG in Eclipse, please follow the steps mentioned
[here.](http://www.seleniumeasy.com/testng-tutorials/how-to-install-testng-step-by-step) 

####TestNG
TestNG is used as a test framework for this project because of the following reasons
- Good support for data providers.
- Better reporting.


####Running the tests

Option# 1: To run the tests from command line, navigate to the root directory of the project and use the below command to run the tests.
`mvn clean test`

Option# 2: Please find below the steps to run the tests in Eclipse, which has TestNG installed.
 `Right click on LongestWordInSentenceTest.Java -> Run As -> TestNG Test`

If the test run is successful while running from Eclipse, following would be printed in the console.

```sh
[RemoteTestNG] detected TestNG version 6.14.3
PASSED: shouldReturnLongestWordInSentence("The climate in washington is great", [washington])
PASSED: shouldReturnLongestWordInSentence("", [])
PASSED: shouldReturnLongestWordInSentence("This is test for list", [This, test, list])
PASSED: shouldReturnLongestWordInSentence("Cool", [Cool])
PASSED: shouldReturnLongestWordInSentence("Mind long past care goes free fall", [Mind, long, past, care, goes, free, fall])

===============================================
    Default test
    Tests run: 5, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 5, Failures: 0, Skips: 0
===============================================```