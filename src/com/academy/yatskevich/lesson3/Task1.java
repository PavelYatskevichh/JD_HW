package com.academy.yatskevich.lesson3;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 1, result = 0; result < 50; i++){
            result = 5 * i;
            System.out.printf("5*%d=%d; ", i, result);
        }
    }
}
