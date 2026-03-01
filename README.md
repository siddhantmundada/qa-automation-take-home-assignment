# QA Practical Task – Currently

## Overview

This project is a Selenium + TestNG based automation framework developed as part of a QA Lead take-home assignment.

The framework follows clean automation design principles including:

- Page Object Model (POM)
- Centralized suite execution using testng.xml
- Reusable BaseTest setup
- Screenshot capture on failure
- Maven dependency management

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

---

## Project Structure

qa-automation-framework
│
├── pom.xml
├── testng.xml
├── README.md
│
├── src
│   ├── main/java
│   │   └── framework
│   │       ├── base
│   │       ├── pages
│   │       └── utils
│   │
│   └── test/java
│       └── tests

---

## Test Scenarios Covered

- Verify successful login with valid credentials
- Verify login failure with invalid credentials
- Screenshot capture on failure

---

## How to Run

### Option 1 – From Eclipse
Right click `testng.xml` → Run As → TestNG Suite

### Option 2 – Using Maven
mvn clean test -DsuiteXmlFile=testng.xml

---

## Design Approach

- Test logic is separated from UI interaction using Page Object Model.
- WebDriver setup and teardown are centralized in BaseTest.
- testng.xml is used to standardize suite execution.
- Failure screenshots improve debugging and reporting.

---

Author:  
Siddhant Mundada - QA Engineer