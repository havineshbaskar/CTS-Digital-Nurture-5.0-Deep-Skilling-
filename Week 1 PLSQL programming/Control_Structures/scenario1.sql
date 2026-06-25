CREATE DATABASE numbers_db;
USE numbers_db;

DELIMITER $$

CREATE PROCEDURE CheckNumber(IN num INT)
BEGIN
    IF num > 0 THEN
        SELECT 'Positive Number' AS Result;
    ELSEIF num < 0 THEN
        SELECT 'Negative Number' AS Result;
    ELSE
        SELECT 'Zero' AS Result;
    END IF;
END $$

DELIMITER ;

CALL CheckNumber(10);