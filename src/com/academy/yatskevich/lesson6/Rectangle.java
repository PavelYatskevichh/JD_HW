package com.academy.yatskevich.lesson6;

public class Rectangle implements Shape {
    private int sizeA;
    private int sizeB;

    @Override
    public double area(){
        return sizeA * sizeB;
    }

    @Override
    public double perimeter() {
        return 2 * (sizeA + sizeB);
    }

    public Rectangle(int sizeA, int sizeB) {
        setSizeA(sizeA);
        setSizeB(sizeB);
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

    public int getSizeA() {
        return sizeA;
    }

    public void setSizeA(int sizeA) {
        if (sizeA > 0) {
            this.sizeA = sizeA;
        } else {
            System.out.println("Укажите другой размер А.");
        }
    }
}
