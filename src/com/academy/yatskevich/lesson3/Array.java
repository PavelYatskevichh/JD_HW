package com.academy.yatskevich.lesson3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = creatingArray();
        printArray(array);
        System.out.print("\n");
        printWithinMultiplicityOf7(array);
        System.out.print("\n");
        MaxAndMinElements.printMAX(array);
        MaxAndMinElements.printMIN(array);
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
        for (int number:array) {
            System.out.print(number + " ");
        }
    }

    public static void printWithinMultiplicityOf7(int[] array) {
        for (int number:array) {
            if (number % 7 == 0){
                continue;
            }
            System.out.print(number + " ");
        }
    }
}
