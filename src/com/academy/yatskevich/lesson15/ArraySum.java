package com.academy.yatskevich.lesson15;

import java.util.Arrays;

public class ArraySum implements Runnable {

    int[] array;
    private int sum;
    public int sum(int[] array) {
       return  Arrays.stream(array).sum();
    }

    public ArraySum(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        sum = sum(array);
    }

    public int getSum() {
        return sum;
    }
}
