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
        switch (i){
            case (1) -> System.out.printf("%d", x);
            case (2) -> System.out.printf("%d%d", x, x);
            case (3) -> System.out.printf("%d%d%d", x, x, x);
            case (4) -> System.out.printf("%d%d%d%d", x, x, x, x);
        }
        x++;
        number(x, i);
    }
}
