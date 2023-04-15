package com.academy.yatskevich.lesson2;

import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {

        System.out.println("Введите два числа через \"enter\":");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        String binarySum = Integer.toBinaryString(sum);
        String octalSum = Integer.toOctalString(sum);
        String hexSum = Integer.toHexString(sum);

        System.out.println("Сумма чисел в десятичном формате равна: " + sum);
        System.out.println("Сумма чисел в двоичном формате равна: " + binarySum);
        System.out.println("Сумма чисел в весьмеричном формате равна: " + octalSum);
        System.out.println("Сумма чисел в шестнадцатиричном формате равна: " + hexSum);
    }
}
