package com.academy.yatskevich.lesson6;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius){
        setRadius(radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Укажите другой радиус.");
        }
    }
}
