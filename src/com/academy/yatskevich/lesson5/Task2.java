package com.academy.yatskevich.lesson5;

public class Task2 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction addition = fraction1.add(fraction2);
        addition.printFraction();

        int number = 4;
        Fraction multiplied = fraction1.multiply(number);
        Fraction divided = fraction1.divide(number);
        multiplied.printFraction();
        divided.printFraction();
    }
}
