package com.academy.yatskevich.lesson6;

public class Task2 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
        Circle circle1 = new Circle(2);
        Triangle triangle1 = new Triangle(3,4,5);

        ShapeParameterPrinter printer = new ShapeParameterPrinter();

        printer.getPerimeter(rectangle1);
        printer.getArea(circle1);
        printer.getPerimeterAndArea(triangle1);
    }
}
