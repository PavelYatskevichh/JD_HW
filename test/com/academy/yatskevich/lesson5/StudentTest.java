package com.academy.yatskevich.lesson5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student1 = new Student(501, "Глушко Владислав", "Строительный факультет",
            3, 11201516, 1998);
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
    public void testIntroduce() {
        student1.introduce();
        String expected = "Привет! Меня зовут Глушко Владислав. Моё ID - 501. " +
                "Я учусь на Строительный факультет факультете в группе 11201516. Сейчас я на 3 курсе." +
                " И, кстати, я 1998 года рождения.\n";
        assertEquals(expected, output.toString());
    }

    @Test
    public void testConstructor1() {
        Student student2 = new Student(502, "Головатый Алексей", "Строительный факультет",
                2, 11201516, 1998);
        assertEquals(502, student2.getId());
        assertEquals("Головатый Алексей", student2.getFullName());
        assertEquals("Строительный факультет", student2.getFaculty());
        assertEquals(2, student2.getYearInUniversity());
        assertEquals(11201516, student2.getGroup());
        assertEquals(1998, student2.getYearOfBirth());
    }

    @Test
    public void testConstructor2() {
        Student student2 = new Student();
        assertEquals(0, student2.getId());
        assertNull(student2.getFullName());
        assertNull(student2.getFaculty());
        assertEquals(0, student2.getYearInUniversity());
        assertEquals(0, student2.getGroup());
        assertEquals(0, student2.getYearOfBirth());
    }

    @Test
    public void testSetId() {
        student1.setId(1111);
        assertEquals(1111, student1.getId());
    }

    @Test
    public void testSetFullName() {
        student1.setFullName("Бженчищикевич Бжегош");
        assertEquals("Бженчищикевич Бжегош", student1.getFullName());
    }

    @Test
    public void testSetFaculty() {
        student1.setFaculty("qwerty");
        assertEquals("qwerty", student1.getFaculty());
    }

    @Test
    public void testSetYearInUniversity() {
        student1.setYearInUniversity(100);
        assertEquals(100, student1.getYearInUniversity());
    }

    @Test
    public void testSetYearOfBirth() {
        student1.setYearOfBirth(1984);
        assertEquals(1984, student1.getYearOfBirth());
    }

    @Test
    public void testSetGroup() {
        student1.setGroup(1488);
        assertEquals(1488, student1.getGroup());
    }

    @Test
    public void testGetId() {
        assertEquals(501, student1.getId());
    }

    @Test
    public void testGetFullName() {
        assertEquals("Глушко Владислав", student1.getFullName());
    }

    @Test
    public void testGetFaculty() {
        assertEquals("Строительный факультет", student1.getFaculty());
    }

    @Test
    public void testGetYearInUniversity() {
        assertEquals(3, student1.getYearInUniversity());
    }

    @Test
    public void testGetYearOfBirth() {
        assertEquals(1998, student1.getYearOfBirth());
    }

    @Test
    public void testGetGroup() {
        assertEquals(11201516, student1.getGroup());
    }
}
