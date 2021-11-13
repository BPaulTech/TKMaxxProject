# TKMaxxProject

Project Title : TKMaxxProject

Motivation : Implement Automation framework in TKMaxx website

Programmig Language used: Java

Tools used for Framework: Cucumber-JVM, JUnit

Build tool used: Maven

Framework method used: Page Object Model

Webdriver code distribution: All the webdriver codes are divided according to pages. Created separate classes for each page which is sitting under the package, com.pages under src/test/java

Runner class: CucumberRunner class is sitting under com.runner under src/test/java. Also there are regression, smoke and ticket runner classes to run scenarios separately using tags.

BaseTest: A class created for driver code which extends to other classes using inheritance concept

Step Definitions: All the step defintions divided and distributed into separate classes which is sitting under package, com.stepDefinitions under src/test/java

Hooks: Using the annotations @Before and @After, block of codes are used to run before and after every scenario

Feature file: The BDD steps are created in the cucumber files inside the folder features, under src/test/resources

Run the test: To run all the test scenarios, go to the package com.runner, right click on CucumberRunner.java class and Run as Junit Test. To run the test scenarios separately, add @regression, @smoke or @ticket tags just above the feature or scenario in cucumber file. Then go to the package com.runner, right click on relevant runner class and Run as Junit Test
