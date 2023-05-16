package com.academy.yatskevich.lesson9;

public class Task3 {
    public static void main(String[] args) {
        HeirOfNumber<Integer> heir = new HeirOfNumber<>(103);
        System.out.println(heir.isStringEquals(999L));
    }
}
