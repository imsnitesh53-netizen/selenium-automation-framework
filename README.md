# Selenium Automation Framework

A scalable **Selenium WebDriver + Java + TestNG + Maven** framework designed to demonstrate senior-level UI automation practices.

## Features

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model
- Driver Factory
- Headless execution in CI
- Test lifecycle management
- Clean test/page separation
- GitHub Actions CI/CD

## Architecture

```text
TestNG Tests
     |
     v
Page Objects
     |
     v
Driver Factory
     |
     v
Selenium WebDriver
     |
     v
Web Application
```

## Project Structure

```text
src/main/java/
  com/qa/framework/    Driver and framework utilities
  com/qa/pages/        Page Objects

src/test/java/
  com/qa/tests/        Test classes

.github/workflows/     CI pipeline
pom.xml               Maven dependencies
testng.xml            Test suite
```

## Run

```bash
mvn clean test
```

For headless mode:

```bash
HEADLESS=true mvn clean test
```

## Demo Application

The tests use SauceDemo, a public demo application. No proprietary test assets are included.

## Portfolio Focus

The framework emphasizes maintainability, reusable page objects, clean driver management, CI execution and a structure that can be extended for data-driven, parallel and cross-browser testing.
