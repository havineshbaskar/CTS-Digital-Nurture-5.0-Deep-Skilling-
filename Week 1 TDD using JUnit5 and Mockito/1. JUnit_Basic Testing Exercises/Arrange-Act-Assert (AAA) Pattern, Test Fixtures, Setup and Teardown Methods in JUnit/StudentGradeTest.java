package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentGradeTest {

    private StudentGrade grade;

    @BeforeEach
    void setup() {

        grade = new StudentGrade();

        System.out.println("Setup Executed");

    }

    @Test
    void testGradeA() {

        // Arrange
        int marks = 95;

        // Act
        String result = grade.calculateGrade(marks);

        // Assert
        assertEquals("A", result);

    }

    @Test
    void testGradeB() {

        // Arrange
        int marks = 80;

        // Act
        String result = grade.calculateGrade(marks);

        // Assert
        assertEquals("B", result);

    }

    @Test
    void testGradeC() {

        // Arrange
        int marks = 60;

        // Act
        String result = grade.calculateGrade(marks);

        // Assert
        assertEquals("C", result);

    }

    @Test
    void testFailGrade() {

        // Arrange
        int marks = 40;

        // Act
        String result = grade.calculateGrade(marks);

        // Assert
        assertEquals("Fail", result);

    }

    @AfterEach
    void cleanup() {

        System.out.println("Cleanup Executed");

    }

}