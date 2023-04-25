package com.academy.yatskevich.lesson6;

public class ShapeParameterPrinter {
    public static void getPerimeter(Rectangle rectangle) {
        System.out.printf("Периметр прямоугольника: %.3f\n", rectangle.perimeter());
    }
    public static void getPerimeter(Circle circle) {
        System.out.printf("Периметр круга: %.3f\n", circle.perimeter());
    }
    public static void getPerimeter(Triangle triangle) {
        System.out.printf("Периметр треугольника: %.3f\n", triangle.perimeter());
    }

    public static void getArea(Rectangle rectangle) {
        System.out.printf("Площадь прямоугольника: %.3f\n", rectangle.area());
    }
    public static void getArea(Circle circle) {
        System.out.printf("Площадь круга: %.3f\n", circle.area());
    }
    public static void getArea(Triangle triangle) {
        System.out.printf("Площадь треугольника: %.3f\n", triangle.area());
    }

    public static void getPerimeterAndArea(Rectangle rectangle) {
        System.out.printf("Периметр и площадь прямоугольника: %.3f, %.3f\n", rectangle.perimeter(), rectangle.area());
    }
    public static void getPerimeterAndArea(Circle circle) {
        System.out.printf("Периметр и площадь круга: %.3f, %.3f\n", circle.perimeter(), circle.area());
    }
    public static void getPerimeterAndArea(Triangle triangle) {
        System.out.printf("Периметр и площадь треугольника: %.3f, %.3f\n", triangle.perimeter(), triangle.area());
    }
}
