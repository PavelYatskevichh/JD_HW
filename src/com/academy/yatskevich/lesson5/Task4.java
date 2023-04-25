package com.academy.yatskevich.lesson5;

public class Task4 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        printMatrix(matrix1);
        Matrix matrix2 = new Matrix(2, 3);
        printMatrix(matrix2);
        Matrix matrix3 = new Matrix(3, 4);
        printMatrix(matrix3);

        printMatrix(matrix1.add(matrix2));
        printMatrix(matrix1.subtract(matrix2));
        printMatrix(matrix1.multiply(matrix3));
    }
    public static void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                System.out.printf("%4d",matrix.getMatrix()[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
