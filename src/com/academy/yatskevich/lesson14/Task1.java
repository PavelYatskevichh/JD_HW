package com.academy.yatskevich.lesson14;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/com/academy/yatskevich/lesson14/";
        String fileName = "matrix.txt";
        String fullPath = path + fileName;

        int[][] matrix = {{1, 2, 10, -5},
                {3, 6, -15, 5},
                {10, 1, -2, 0},
                {0, 3, 4, 6},
                {2, -2, 4, 0},
                {11, 12, -8, 9}};

        try (PrintWriter fileWriter = new PrintWriter(fullPath)) {

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    fileWriter.printf("%3d ", matrix[i][j]);
                }
                fileWriter.print("\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fileReader = new FileReader(fullPath)) {
            int b = 0;
            while ((b = fileReader.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
