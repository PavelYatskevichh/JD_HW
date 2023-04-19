package com.academy.yatskevich.lesson4;

import java.util.Scanner;

public class Task2 {

    static int x;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        x = Math.min(Math.abs(number1), Math.abs(number2));

        System.out.println("Максимальный общий делитель: " + findingMaxDivider(number1, number2));
    }

    private static int findingMaxDivider(int number1, int number2) {
        if (number1 % x == 0 && number2 % x == 0) {
            return x;
        } else {
            x--;
            findingMaxDivider(number1, number2);
        }
        return x;
    }
}
