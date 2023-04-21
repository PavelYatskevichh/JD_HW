package com.academy.yatskevich.lesson4;

public class Task1 {
    public static void main(String[] args) {
        firstEquationSplit(756.13, 0.3);
        firstEquationEntire(756.13, 0.3);
        secondEquation(1.21, 0.371);
        thirdEquation(12.1, -5, 12, 3.75);
    }

    public static void firstEquationSplit(double a, double x) {
        double part1 = Math.cos(Math.pow((Math.pow(x, 2) + Math.PI / 6), 5));
        double part2 = Math.sqrt(x * Math.pow(a, 3));
        double part3 = Math.log(Math.abs((a - 1.12 * x) / 4));
        double z = part1 - part2 - part3;
        System.out.println(z);
    }

    public static void firstEquationEntire(double a, double x) {
        double z = Math.cos(Math.pow((Math.pow(x, 2) + Math.PI / 6), 5))
                - Math.sqrt(x * Math.pow(a, 3)) - Math.log(Math.abs((a - 1.12 * x) / 4));
        System.out.println(z);
    }

    public static void secondEquation(double a, double b) {
        double y = Math.tan(Math.pow((a + b), 2)) - Math.cbrt(a + 1.5) + a * Math.pow(b, 5) - b / Math.log(a * a);
        System.out.println(y);
    }

    public static void thirdEquation(double x, double start, double end, double delta) {
        double a = start;
        while (a <= end) {
            double f = Math.pow(Math.E, a * x) - 3.45 * a;
            System.out.printf("%+6.2f %.3f \n", a, f);
            a += delta;
        }
    }
}
