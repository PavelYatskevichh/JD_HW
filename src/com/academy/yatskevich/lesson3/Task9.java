package com.academy.yatskevich.lesson3;

public class Task9 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            number(0, i);
        }
    }

    public static void number(int x, int i) {
        if (x == 10){
            return;
        }
        System.out.print(String.format("%d", x).repeat(i));
        x++;
        number(x, i);
    }
}
