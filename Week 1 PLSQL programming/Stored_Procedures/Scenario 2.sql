CREATE DATABASE student_db;
USE student_db;

CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    department VARCHAR(30),
    marks INT
);

INSERT INTO Student VALUES
(1,'Arun','CSE',85),
(2,'Divya','ECE',78),
(3,'Karthik','IT',92),
(4,'Meena','CSE',88),
(5,'Rahul','EEE',70);

DELIMITER $$

CREATE PROCEDURE GetStudentsByMarks(IN min_marks INT)
BEGIN
    SELECT student_id, student_name, department, marks
    FROM Student
    WHERE marks >= min_marks;
END $$

DELIMITER ;

CALL GetStudentsByMarks(80);

SELECT * FROM Student;