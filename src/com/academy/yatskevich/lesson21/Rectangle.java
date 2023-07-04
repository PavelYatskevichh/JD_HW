package com.academy.yatskevich.lesson21;

public class Rectangle implements Shape {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getArea() {
        return a * b;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
