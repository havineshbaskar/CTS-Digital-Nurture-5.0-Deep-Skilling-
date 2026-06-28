# SLF4J Logging Exercise 1 – Logging Error Messages and Warning Levels

## Overview

This project demonstrates how to use the **SLF4J (Simple Logging Facade for Java)** logging framework with **Logback**. The application logs different messages based on the input provided by the user. It covers the use of **ERROR**, **WARN**, and **INFO** log levels.

## Objective

* Learn how to configure SLF4J in a Maven project.
* Understand different logging levels.
* Log warning and error messages based on program conditions.
* Execute the project using Eclipse IDE.

## Technologies Used

* Java 17
* Eclipse IDE
* Maven
* SLF4J API
* Logback

## Project Structure

```
SLF4JLoggingExercise
│
├── src
│   └── main
│       └── java
│           └── com
│               └── example
│                   └── logging
│                       ├── Main.java
│                       └── UserService.java
│
└── pom.xml
```

## Description

The `UserService` class checks the username entered by the user.

* If the username is empty, an **ERROR** message is logged.
* If the username contains fewer than four characters, a **WARN** message is logged.
* If the username is valid, an **INFO** message is logged indicating successful login.

The `Main` class creates a `UserService` object and calls the `login()` method with different usernames to demonstrate each logging level.

## Sample Output

```
ERROR com.example.logging.UserService -- Username cannot be empty!
WARN  com.example.logging.UserService -- Username is very short.
INFO  com.example.logging.UserService -- User Raj logged in successfully.
INFO  com.example.logging.UserService -- User Ramesh logged in successfully.
```

## How to Run

1. Import the project into Eclipse as a Maven project.
2. Update Maven dependencies.
3. Open `Main.java`.
4. Right-click `Main.java`.
5. Select **Run As → Java Application**.
6. View the log messages in the Eclipse Console.

## Learning Outcome

After completing this exercise, I learned how to:

* Add SLF4J and Logback dependencies using Maven.
* Create and use a logger in a Java class.
* Log messages using ERROR, WARN, and INFO levels.
* Run a Maven project in Eclipse IDE.
* Read and understand log output generated during program execution.

