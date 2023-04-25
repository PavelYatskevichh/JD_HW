package com.academy.yatskevich.lesson6;

public class Task2 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
        Circle circle1 = new Circle(2);
        Triangle triangle1 = new Triangle(3,4,5);

//        Сделал не совсем в соответствии с заданием. Сделал методы статическими. На мой взгляд так логичнее.
        ShapeParameterPrinter.getPerimeter(rectangle1);
        ShapeParameterPrinter.getArea(circle1);
        ShapeParameterPrinter.getPerimeterAndArea(triangle1);
    }
}
