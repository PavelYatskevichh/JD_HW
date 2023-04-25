package com.academy.yatskevich.lesson5;

import java.util.Arrays;

public class Matrix {
    private int[][] matrix;

    public Matrix(int x, int y) {
        this.setMatrix(x, y);
    }

    private Matrix(int x) {
        matrix = new int[x][x];
    }

    public Matrix add(Matrix other) {
        if (other.getMatrix().length == this.matrix.length && other.getMatrix()[0].length == this.matrix[0].length) {
            Matrix result = new Matrix(this.matrix.length, this.matrix[0].length);
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[0].length; j++) {
                    result.getMatrix()[i][j] = other.getMatrix()[i][j] + this.matrix[i][j];
                }
            }
            return result;
        } else {
            System.out.println("Матрицы разных размеров. Сложение невозможно.");
            return new Matrix(0);
        }
    }

    public Matrix multiply(Matrix other) {
        if (other.getMatrix().length == this.matrix[0].length) {
            Matrix result = new Matrix(this.matrix.length, other.getMatrix()[0].length);
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < other.getMatrix()[0].length; j++) {
                    int sum = 0;
                    for (int k = 0; k < this.matrix[0].length; k++) {
                        sum += this.matrix[i][k] * other.getMatrix()[k][j];
                    }
                    result.getMatrix()[i][j] = sum;
                }
            }
            return result;
        } else {
            System.out.println("Матрицы не согласованы. Умножение невозможно.");
            return new Matrix(0);
        }
    }

    public Matrix subtract(Matrix other) {
        if (other.getMatrix().length == this.matrix.length && other.getMatrix()[0].length == this.matrix[0].length) {
            Matrix result = new Matrix(this.matrix.length, this.matrix[0].length);
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[0].length; j++) {
                    result.getMatrix()[i][j] = this.matrix[i][j] - other.getMatrix()[i][j];
                }
            }
            return result;
        } else {
            System.out.println("Матрицы разных размеров. Вычитание невозможно.");
            return new Matrix(0);
        }
    }

    public void setMatrix(int x, int y) {
        if (x > 1 && y > 1) {
        matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
        } else {
            System.out.println("Минимальный размер матрица 2х2.");
            matrix = new int[0][0];
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
