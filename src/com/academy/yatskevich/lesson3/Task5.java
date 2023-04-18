package com.academy.yatskevich.lesson3;

public class Task5 {
    public static void main(String[] args) {
    }

    /**
     * Print the max element of an array of integers.
     * @param array of integers
     */
    public static void printMAX(int[] array) {
        int max = array[0];
        for (int i : array) {
            max = (max >= i) ? max : i;
        }
        System.out.println("Максимальное значение в массиве:" + max);
    }

    /**
     * Print the minimum element of an array of integers.
     * @param array of integers
     */
    public static void printMIN(int[] array) {
        int min = array[0];
        for (int i : array) {
            min = (min <= i) ? min : i;
        }
        System.out.println("Минимальное значение в массиве:" + min);
    }
}
