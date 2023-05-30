package com.academy.yatskevich.lesson10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        double sum = 0;
        while (true) {
            str = scanner.next();
            if (str.equals("END")) {
                break;
            }
            try {
                double val = Double.parseDouble(str);
                sum += val;
                if (sum < 0) {
                    throw new ArithmeticException();
                }
                System.out.println(Math.sqrt(sum));
            } catch (ArithmeticException | NumberFormatException e) {
                System.out.println(e.getClass());
            }
        }
    }
}
