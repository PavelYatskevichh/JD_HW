package com.academy.yatskevich.lesson5;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numeratorLocal, int denominatorLocal) {
        this.numerator = numeratorLocal;
        this.denominator = denominatorLocal;
    }
    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }
    public Fraction add(Fraction example) {
        int newDenominator = this.denominator * example.denominator;
        int newNumerator = this.numerator * example.denominator + example.numerator * this.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction multiply(int value) {
        int newNumerator = this.numerator * value;
        return new Fraction(newNumerator, denominator);
    }
    public Fraction divide(int value) {
        int newDenominator = this.denominator * value;
        return new Fraction(numerator, newDenominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Fraction fraction = (Fraction) obj;
        return this.numerator == fraction.numerator && this.denominator == fraction.denominator;
    }
}