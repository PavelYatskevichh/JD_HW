package com.academy.yatskevich.lesson21;

public class Circle implements Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (radius * Math.PI);
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}
