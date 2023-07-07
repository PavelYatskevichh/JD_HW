package com.academy.yatskevich.lesson5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class HRTest {
    private Student student1 = new Student(501, "Глушко Владислав", "Строительный факультет",
            3, 11201516, 1998);
    private Student student2 = new Student(502, "Головатый Алексей", "Строительный факультет",
            2, 11201516, 1999);
    private HR hr = new HR();
    private int yearInUniversity = 3;
    private int yearOfBirth = 1999;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testEachStudentToArray() {
        Student[] expected = new Student[]{student1, student2};
        assertArrayEquals(expected, hr.eachStudentToArray(student1, student2));
    }

    @Test
    public void testPrintStudentsAccordingYearInUniversity() {
        Student[] students = new Student[]{student1, student2};
        hr.printStudentsAccordingYearInUniversity(students, yearInUniversity);
        String expected = "Список ФИО студентов на 3 курсе:\nГлушко Владислав\r\n";
        assertEquals(expected, output.toString());
    }

    @Test
    public void testPrintStudentsAccordingYearOfBirth() {
        Student[] students = new Student[]{student1, student2};
        hr.printStudentsAccordingYearOfBirth(students, yearOfBirth);
        String expected = "Список ФИО студентов 1999 года рождения:\nГоловатый Алексей\r\n";
        assertEquals(expected, output.toString());
    }
}
