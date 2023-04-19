package com.academy.yatskevich.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел Фибоначчи:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        System.out.printf("Последовательнось Фибоначчи:\n%d, %d", 0, 1);

        fibonacciSequence(0, 1, quantity-2);
    }

    private static void fibonacciSequence(int penultimateNumber, int lastNumber, int quantity) {
        if (quantity != 0) {
            int currentNumber = penultimateNumber + lastNumber;
            System.out.printf(", %d", currentNumber);
            fibonacciSequence(lastNumber, currentNumber, --quantity);
        }
    }
}