package com.academy.yatskevich.lesson14;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/com/academy/yatskevich/lesson14/";
        String fileName = "input.txt";
        String fullPath = path + fileName;
        String fileName2 = "occurrences.txt";
        String fullPath2 = path + fileName2;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fullPath));
        FileWriter fileWriter = new FileWriter(fullPath2)) {
            int count = 0;
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                char[] chars = line.toCharArray();
                for (char c : chars) {
                    if (c == 'a') {
                        count++;
                    }
                }
            }
            fileWriter.write(Integer.toString(count));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
