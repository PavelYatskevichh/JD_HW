package com.academy.yatskevich.lesson2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        System.out.println("Введите значение a, b, c для квадратоного уравнения ax²+bx+c=0:");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0){
            System.out.println("Это не квадратное уравнение. Программа завершается.");
        } else {
            System.out.printf("Для уравнения %dx²%+dx%+d=0\n", a, b, c);

            double discriminant = b * b - 4 * a * c;

            if (discriminant < 0) {
                System.out.println("Корней нет.");
            } else if (discriminant == 0.0) {
                double x = (double) -b / (2 * a);
                System.out.println("Уравнение имеет один корень равный: " + x);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Корни: %.3f, %.3f", x1, x2);
            }
        }
    }
}