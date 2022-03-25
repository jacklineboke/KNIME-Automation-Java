# Project description

## General info
Project for running UI and API tests

## Technologies and tools
* JDK 1.8;
* Maven;

## Setup
To start working with project:
1. Install [Java 1.8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
2. Set JAVA_HOME https://docs.oracle.com/cd/E19182-01/821-0917/inst_jdk_javahome_t/index.html
3. Install [maven builder](https://maven.apache.org/download.cgi) - to compile project

## Run Tests
To run tests after Installing all Maven dependecies found in pom.xml, right click on teztng.xml and select Run. 

## Modules
**src.main.java.additionalTools** - contains classes with custom functionals, that tester can use in automation <br />
**src.main.java.listeners** - contains classes relates retries failed tests like [listeners](https://testng.org/doc/documentation-main.html#testng-listeners) <br /> 
**src.main.java.pageObject** - contains classes with selectors and actions in UI tests <br />
**src.main.java.setupBrowser** - contains classes for start, run and stop browsers for UI tests <br />
**src.main.java.__.properties** - contains properties with creds for users in tests for login and path of environments <br />
**src.main.java.test** - contains class for tests <br />
**src.test.resources.log4j2.xml** - config file for log messages
**testng.xml** - testng config file to run local tests  <br />

##Frameworks, tools and libraries at pom.xml
* testng - testing [framework](https://testng.org/doc/)
* selenium-java - library for creation [UI tests](https://www.selenium.dev/)
* selenide - framework-wrapper of selenium methods - [wiki](https://selenide.org/) 
* javafaker - library for generation fake data - [wiki](https://www.baeldung.com/java-faker)
* allure-testng - module for interactions between testng and allure-report plugin
* allure-selenide - module for interactions between selenide and allure-report plugin for saving logs and showing at reports
* slf4j-simple - plugin used by selenide for live logging of test running
* log4j-api - tool for login api requests
* log4j-core - tool for creation custom log format, filepath to config file: *src.test.resources.log4j2.xml*
* hamcrest-core - library for assertion of values in tests - [wiki](http://hamcrest.org/JavaHamcrest/)
* rest-assured - library for api tests - [wiki](https://github.com/rest-assured/rest-assured/wiki/GettingStarted)
* json-path, json-simple, json, jackson-databind, jackson-annotations - libraries for generation json bodies and log in tests
* commons-lang3 - package contains of utility classes for java - [wiki](https://www.baeldung.com/java-commons-lang-3)
* maven-compiler-plugin - plugin to compile source code of maven project
* maven-surefire-plugin - plugin define config file (testng.xml) before running tests and for saving reports: *targer.surfire-reports.index.html*
* aspectjweaver - tool used for current allure for step annotations
* allure-maven - plugin generate report after running tests
* maven-project-info-reports-plugin - plugin, where through maven panel, user can generate temporary allure html report 
