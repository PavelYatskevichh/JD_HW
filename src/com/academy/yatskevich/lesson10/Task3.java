package com.academy.yatskevich.lesson10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        try {
            readData(scanner);
        } catch (LimitedNumberOfCallsException e) {
            System.out.println("END!");
        }
    }

    static void readData(Scanner sc) throws InterruptedException, LimitedNumberOfCallsException {
        double[] array = new double[100];
        int i = 0;
        int n = 0;
        int z = 0;

        while (true) {
            try {

                String s = sc.next();
                array[i] = Double.parseDouble(s);
                i++;
                n++;


            } catch (NumberFormatException e) {
                z++;
                if (z == 5) {
                    throw new LimitedNumberOfCallsException();
                }

                Thread.sleep(100);
                for (int j = 1; j <= i; j++) {
                    System.out.print(array[n - j] + " ");
                }
                System.out.println();

            }
        }


    }
}
