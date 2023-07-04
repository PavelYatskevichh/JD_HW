package com.academy.yatskevich.lesson21;

public class Square implements Shape {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int getArea() {
        return a * a;
    }

    public Square(int a) {
        this.a = a;
    }
}
