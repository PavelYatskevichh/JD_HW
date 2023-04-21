package com.academy.yatskevich.lesson4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task7 {
    public static void main(String[] args) {
        double[] arrayX = new double[30];
        for (int i = 0; i < arrayX.length; i++) {
            arrayX[i] = 5.33 + 0.122 * i;
        }
        double[] arrayZ = new double[30];
        for (int i = 0; i < arrayZ.length; i++) {
            arrayZ[i] = Math.cbrt(Math.pow(arrayX[i], 2) + 4.5);
        }

        System.out.println("Массив:");
        for (int i = 0; i < arrayZ.length; i++) {
            String s = String.format("A[%d] = %.3f", i, arrayZ[i]);
            System.out.printf("%-14s ", s);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        double[] arrayZNew;
        int n = 0;
        for (int i = 0; i < arrayZ.length; i++) {
            if (arrayZ[i] > 3.5) {
                n = i;
                break;
            }
        }
        arrayZNew = new double[arrayZ.length - n];
        System.arraycopy(arrayZ, n, arrayZNew, 0, arrayZNew.length);

        System.out.println("Новый массив:");
        for (int i = 0; i < arrayZNew.length; i++) {
            String s = String.format("A[%d] = %.3f", i, arrayZNew[i]);
            System.out.printf("%-14s ", s);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        double product = 1.0;
        for (int i = 0; i < arrayZNew.length; i++) {
            product *= arrayZNew[i];
        }
        double result = Math.pow(product, (1.0 / arrayZNew.length));

        System.out.printf("\nСреднее геометрическое нового массива = %.3f", result);
    }
}
