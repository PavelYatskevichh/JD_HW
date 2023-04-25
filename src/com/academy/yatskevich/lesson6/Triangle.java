package com.academy.yatskevich.lesson6;

public class Triangle implements Shape {
    private int sizeA;
    private int sizeB;
    private int sizeC;

    public Triangle(int sizeA, int sizeB, int sizeC) {
        setSizeA(sizeA);
        setSizeB(sizeB);
        setSizeC(sizeC);
    }

    @Override
    public double area() {
        return Math.sqrt(this.perimeter() / 2 * (this.perimeter() / 2 - sizeA) * (this.perimeter() / 2 - sizeB)
                * (this.perimeter() / 2 - sizeC));
    }

    @Override
    public double perimeter() {
        return sizeA + sizeB + sizeC;
    }

    public int getSizeA() {
        return sizeA;
    }

    public void setSizeA(int sizeA) {
        if (sizeA > 0) {
            this.sizeA = sizeA;
        } else {
            System.out.println("Укажите другой размер В.");
        }
    }

    public int getSizeB() {
        return sizeB;
    }

    public void setSizeB(int sizeB) {
        if (sizeB > 0) {
            this.sizeB = sizeB;
        } else {
            System.out.println("Укажите другой размер В.");
        }
    }

    public int getSizeC() {
        return sizeC;
    }

    public void setSizeC(int sizeC) {
        if (sizeC > 0) {
            this.sizeC = sizeC;
        } else {
            System.out.println("Укажите другой размер В.");
        }
    }
}
