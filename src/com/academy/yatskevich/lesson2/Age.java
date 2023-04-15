package com.academy.yatskevich.lesson2;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        System.out.println("Введите ваш возраст:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        String keyWord;

        if (age % 100 >= 11 && age % 100 <= 14) {
            keyWord = " лет";
        } else if (age % 10 == 1) {
            keyWord = " год";
        } else if (age % 10 >= 2 && age % 10 <= 4) {
            keyWord = " года";
        } else {
            keyWord = " лет";
        }

        System.out.println("Ваш возраст - " + age + keyWord);

    }
}
