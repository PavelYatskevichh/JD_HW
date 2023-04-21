package com.academy.yatskevich.lesson4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 9, -11, 0, 3, -2, 20, 113, 6, 3, -9, -25, -2, 18};

        choiceSort(array);

        for (int n : array) {
            System.out.print(n + " ");
        }
    }

    private static void choiceSort(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            int n = -1;
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] <= min) {
                    min = array[j];
                    n = j;
                }

            }
            if (n >= i) {
                temp = array[i];
                array[i] = array[n];
                array[n] = temp;
            }

        }
    }
}
