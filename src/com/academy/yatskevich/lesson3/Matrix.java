package com.academy.yatskevich.lesson3;

public class Matrix {
    public static void main(String[] args) {
        int [][] matrix = initializingMatrix();
        printMatrix(matrix);
        System.out.println("Строкой с максимальной сумммой элементов является строка № " + maxAmountOfString(matrix));
    }

    public static int[][] initializingMatrix (){
        int[][] matrix = new int[5][7];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*100);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Для матрицы:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-4d", matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int maxAmountOfString(int[][] matrix) {
        int maxSum = -1;
        int index = -1;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (maxSum <= sum) {
                maxSum = sum;
                index = i;
            }
        }
        return index;
    }
}
