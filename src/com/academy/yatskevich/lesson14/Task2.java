package com.academy.yatskevich.lesson14;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/com/academy/yatskevich/lesson14/";
        String fileName1 = "in1.txt";
        String fullPath1 = path + fileName1;
        String fileName2 = "in2.txt";
        String fullPath2 = path + fileName2;
        String fileName3 = "out.txt";
        String fullPath3 = path + fileName3;

        try (DataOutputStream dos1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fullPath1)));
             DataOutputStream dos2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fullPath2)))) {
            for (int i = 0; i < 1000; i++) {
                int value = (int) (Math.random() * 1000000);
                String s = Integer.toString(value);
                dos1.write(s.getBytes(StandardCharsets.UTF_8));
                dos1.write(' ');
            }

            for (int i = 0; i < 1000; i++) {
                int value = (int) (Math.random() * 1000000);
                String s = Integer.toString(value);
                dos2.write(s.getBytes(StandardCharsets.UTF_8));
                dos2.write(' ');
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (DataInputStream dis1 = new DataInputStream(new BufferedInputStream(new FileInputStream(fullPath1)));
             DataInputStream dis2 = new DataInputStream(new BufferedInputStream(new FileInputStream(fullPath2)));
             DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fullPath3)))) {

            StringBuilder sb = new StringBuilder();
            List<Integer> ar = new ArrayList<>();

            while (dis1.available() > 0) {
                char b;
                if ((b = (char) dis1.read()) == ' ') {
                    ar.add(Integer.parseInt(sb.toString()));
                    sb.setLength(0);
                } else {
                    sb.append(b);
                }
            }
            while (dis2.available() > 0) {
                char b;
                if ((b = (char) dis2.read()) == ' ') {
                    ar.add(Integer.parseInt(sb.toString()));
                    sb.setLength(0);
                } else {
                    sb.append(b);
                }
            }

            ar.sort(Comparator.naturalOrder());
            Integer[] array = ar.toArray(new Integer[0]);

            for (int i = 0; i < 2000; i++) {
                dos.write(array[i].toString().getBytes(StandardCharsets.UTF_8));
                dos.write(' ');
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
