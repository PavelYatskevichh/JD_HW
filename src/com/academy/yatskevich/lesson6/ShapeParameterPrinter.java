package com.academy.yatskevich.lesson6;

public class ShapeParameterPrinter {
    public void getPerimeterAndArea(Shape figure) {
        System.out.printf("Периметр и площадь геометрической фигуры: %.3f, %.3f\n", figure.perimeter(), figure.area());
    }

    public void getPerimeter(Shape figure) {
        System.out.printf("Периметр геометрической фигуры: %.3f\n", figure.perimeter());
    }

    public void getArea(Shape figure) {
        System.out.printf("Площадь геометрической фигуры: %.3f\n", figure.area());
    }
}
