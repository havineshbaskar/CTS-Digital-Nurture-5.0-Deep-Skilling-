CREATE DATABASE numbers_db;
USE numbers_db;

DELIMITER $$

CREATE PROCEDURE CheckVoting(IN age INT)
BEGIN
    IF age >= 18 THEN
        SELECT 'Eligible to Vote' AS Result;
    ELSE
        SELECT 'Not Eligible to Vote' AS Result;
    END IF;
END $$

DELIMITER ;

CALL CheckVoting(20);