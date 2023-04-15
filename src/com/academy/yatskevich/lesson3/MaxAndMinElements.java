package com.academy.yatskevich.lesson3;

public class MaxAndMinElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 400, 25, 6, 999, 9, -20};
        printMAX(array);
        printMIN(array);
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
        System.out.println(max);
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
        System.out.println(min);
    }
}
