package com.academy.yatskevich.lesson3;

public class SequenceUpTo9999 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for (int j = 0; j <= 9; j++) {
                String string = String.valueOf(j);
                switch (i){
                    case 1 -> System.out.print(string);
                    case 2 -> System.out.print(string + string);
                    case 3 -> System.out.print(string + string + string);
                    case 4 -> System.out.print(string + string + string + string);
                }
            }
        }
    }
}
