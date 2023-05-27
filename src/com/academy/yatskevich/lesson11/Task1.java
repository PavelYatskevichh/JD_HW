package com.academy.yatskevich.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Number> list = new MyList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        list.remove(1);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.set(2, 24);
        System.out.println(list);
        list.add(2, 200);
        System.out.println(list);
        list.clear();
        System.out.println(list.size()); // выводит 5, хотя лист очистили только что
        list.addAll(Arrays.asList(57, 58, 59));
        System.out.println(list); // выводит [null, null, null, null, null, 57, 58, 59]
    }
}
