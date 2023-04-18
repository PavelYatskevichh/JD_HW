package com.academy.yatskevich.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Введите число:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number % 2 == 0 ? "Число четное" : "Число нечетное");
    }
}
