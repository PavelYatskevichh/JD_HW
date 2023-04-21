package com.academy.yatskevich.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите количество чисел Фибоначчи:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        System.out.print("Последовательнось Фибоначчи:\n");

        if (quantity >= 1) {
            System.out.print(0 + " ");
            if (quantity >= 2) {
                System.out.print(1 + " ");
            }
        }

        fibonacciSequence(0, 1, quantity);
    }

    private static void fibonacciSequence(int penultimateNumber, int lastNumber, int quantity) {
        if (quantity > 2) {
            int currentNumber = penultimateNumber + lastNumber;
            System.out.printf("%d ", currentNumber);
            fibonacciSequence(lastNumber, currentNumber, --quantity);
        }
    }
}