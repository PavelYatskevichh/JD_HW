package com.academy.yatskevich.lesson13;

import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        Integer[][] array = new Integer[][]{{1, 2, 3},{4, 5}, {6, 7, 8, 9}};
        Folder<Integer> folder = new Folder<>(array);
        Iterator<Integer> iterator = folder.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
