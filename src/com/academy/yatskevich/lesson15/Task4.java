package com.academy.yatskevich.lesson15;

import java.util.Scanner;

public class Task4 {

    public static int number;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            String str = scanner.nextLine();
            Thread thread1 = new Thread(new WebReader(str));
            thread1.start();
        }
    }
}
