# PLSQL Exercises - Exercise 1: Control Structures (MySQL 8.0)

## Objective

To learn and implement control structures in MySQL using stored procedures and conditional statements (`IF`, `ELSEIF`, and `ELSE`).

## Software Requirements

* MySQL Server 8.0
* MySQL 8.0 Command Line Client or MySQL Workbench

## Programs Included

### 1. CheckNumber

Determines whether the given number is:

* Positive
* Negative
* Zero

**Example**

* Input: `10`
* Output: `Positive Number`

---

### 2. CheckGrade

Determines the grade based on the marks entered.

**Grading Criteria**

* Marks ≥ 90 → Grade A
* Marks ≥ 75 → Grade B
* Marks ≥ 50 → Grade C
* Marks < 50 → Fail

**Example**

* Input: `82`
* Output: `Grade B`

---

### 3. CheckVoting

Determines whether a person is eligible to vote.

**Criteria**

* Age ≥ 18 → Eligible to Vote
* Age < 18 → Not Eligible to Vote

**Example**

* Input: `20`
* Output: `Eligible to Vote`

## Concepts Used

* Stored Procedures
* IF Statement
* ELSEIF Statement
* ELSE Statement
* Input Parameters
* MySQL Delimiters

## How to Run

1. Open MySQL 8.0 Command Line Client or MySQL Workbench.
2. Create and select the database.
3. Execute the SQL script.
4. Call the required stored procedure using the `CALL` statement.
5. View the output.

## Learning Outcomes

* Understood the use of control structures in MySQL.
* Learned to create and execute stored procedures.
* Implemented decision-making using conditional statements.
* Gained hands-on experience with MySQL 8.0 stored programs.

