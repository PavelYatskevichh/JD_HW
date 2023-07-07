package com.academy.yatskevich.lesson5;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction1 = new Fraction(1,5);
    private Fraction fraction2 = new Fraction(2,3);
    private int number = 4;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testPrintFraction() {
        fraction1.printFraction();
        assertEquals("1/5\r\n", output.toString()); // Это жесть, иногда мультиплатформенность Джавы играет против нас.
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testAdd() {
        Fraction result = new Fraction(13,15);
        assertEquals(result,fraction1.add(fraction2));
    }

    @Test
    public void testMultiply() {
        Fraction result = new Fraction(4,5);
        assertEquals(result,fraction1.multiply(number));
    }

    @Test
    public void testDivide() {
        Fraction result = new Fraction(1,20);
        assertEquals(result,fraction1.divide(number));
    }
}
