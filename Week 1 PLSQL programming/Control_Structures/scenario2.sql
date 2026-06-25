CREATE DATABASE numbers_db;
USE numbers_db;

DELIMITER $$

CREATE PROCEDURE CheckGrade(IN marks INT)
BEGIN
    IF marks >= 90 THEN
        SELECT 'Grade A' AS Grade;
    ELSEIF marks >= 75 THEN
        SELECT 'Grade B' AS Grade;
    ELSEIF marks >= 50 THEN
        SELECT 'Grade C' AS Grade;
    ELSE
        SELECT 'Fail' AS Grade;
    END IF;
END $$

DELIMITER ;

CALL CheckGrade(82);