# Stored Procedures in MySQL

## Aim

To learn how to create and execute stored procedures in MySQL.

## Description

This project contains two examples of stored procedures:

* **company_db** – Retrieves employee details based on salary.
* **student_db** – Retrieves student details based on marks.

## Tools Used

* MySQL
* MySQL Command Line Client

## Execution

1. Create the database and table.
2. Insert the sample data.
3. Create the stored procedure.
4. Execute it using the `CALL` command.

## Sample Commands

```sql
CALL GetEmployeesBySalary(50000);

CALL GetStudentsByMarks(80);
```

## Result

The stored procedures display the records that match the given salary or marks value.

