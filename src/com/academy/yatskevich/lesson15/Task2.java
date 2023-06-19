package com.academy.yatskevich.lesson15;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] wholeArray = {1, 2, 3, 4, 5, 6};
        int[] array1 = Arrays.copyOfRange(wholeArray, 0,3);
        int[] array2 = Arrays.copyOfRange(wholeArray, 3, 6);

        ArraySum arraySum1 = new ArraySum(array1);
        ArraySum arraySum2 = new ArraySum(array2);

        Thread thread1 = new Thread(arraySum1);
        Thread thread2 = new Thread(arraySum2);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(arraySum1.getSum() + arraySum2.getSum());
    }
}
