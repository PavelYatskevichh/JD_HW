package com.academy.yatskevich.lesson3;

public class MultiplicationMatrixByVector {
    public static void main(String[] args) {

        System.out.println("Исходный вектор-столбец: ");

        //Объявление и инициализация Вектора. Будем считать, что это вектор-столбец.
        int[] vector = new int[(int) (Math.random()*9+1)];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
            System.out.println(vector[i]);
        }

        System.out.println("Исходная матрица: ");

        //Объявление и инициализация Матрицы.
        int[][] matrix = new int [(int) (Math.random()*9+2)] [(int) (Math.random()*9+2)];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.printf("%-3d ", matrix[i][j]);
            }
            System.out.print("\n");
        }

        multiplication(vector, matrix);
    }

    public static void multiplication(int[] array1, int[][] array2) {
        int[] result = new int[array2.length];
        if (array1.length != array2[0].length){
            System.out.println("Умножение невозможно. Программа завершается.");
        } else {
            System.out.println("Результатом умножения является следующий вектор-столбец:");
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] *= 1;
                    result[i] += array2[i][j] * array1[j];
                }
                System.out.println(result[i]);
            }
        }
    }
}
