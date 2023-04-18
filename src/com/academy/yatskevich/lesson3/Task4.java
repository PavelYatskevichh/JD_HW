package com.academy.yatskevich.lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
    }

    public static int[] creatingArray() {
        System.out.println("Введите любое количество целых чисел через пробел:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split = string.split(" ");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Ваш массив:");
        for (int number:array) {
            System.out.print(number + " ");
        }
    }

    public static void printWithinMultiplicityOf7(int[] array) {
        System.out.println("Ваш массив без элементов, кратных 7:");
        for (int number:array) {
            if (number % 7 == 0){
                continue;
            }
            System.out.print(number + " ");
        }
    }
}
