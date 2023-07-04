package com.academy.yatskevich.lesson21;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Какую фигуру создавать (круг - 1, квадрат - 2, прямоугольник - 3)?");
        Scanner scanner = new Scanner(System.in);
        ShapeFabric someFabric = null;

        do {
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> someFabric = new CircleFabric();
                case 2 -> someFabric = new SquareFabric();
                case 3 -> someFabric = new RectangleFabric();
                default -> System.out.println("Давай по новой, Миша, всё *****!");
            }
        } while (someFabric == null);

        Shape someShape = someFabric.createShape();
        System.out.println("Площадь вашей фигуры: " + someShape.getArea());
    }
}
