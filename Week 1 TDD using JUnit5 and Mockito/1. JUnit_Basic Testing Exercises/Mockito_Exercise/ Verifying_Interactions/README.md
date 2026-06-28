# Mockito Exercise 2 - Verifying Interactions

## Description
This project demonstrates how to verify method interactions using Mockito and JUnit 5. A mock object is created for the `MessageService` interface, and the test verifies that the `sendMessage()` method is called when the `notifyUser()` method is executed.

## Tools and Technologies
- Java 17
- Eclipse IDE
- Maven
- JUnit 5
- Mockito

## Project Structure

```
src
├── main
│   └── java
│       └── com.example.service
│           ├── MessageService.java
│           └── NotificationManager.java
└── test
    └── java
        └── com.example.service
            └── NotificationManagerTest.java
```

## How to Run

1. Import the project into Eclipse.
2. Right-click the project and select **Maven > Update Project**.
3. Open `NotificationManagerTest.java`.
4. Right-click the file and select **Run As > JUnit Test**.
5. Check the JUnit view for the test result.

## Expected Output

```
Runs: 1
Failures: 0
Errors: 0
```

## Concepts Covered

- Unit Testing
- Mockito Mock Objects
- Interaction Verification
- `verify()` Method
- Arrange-Act-Assert (AAA) Pattern
