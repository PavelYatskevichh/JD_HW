package com.academy.yatskevich.lesson18;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Class<?> aClass;
        try {
            aClass = Class.forName("java.util.LinkedList");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("    Названия полей:");
        Field[] fields = aClass.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);

        Class<?> parentClass = aClass.getSuperclass();
        System.out.println("    Родительский класс:\n" + parentClass);

        System.out.println("    Названия методов:");
        Method[] methods = aClass.getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);

        System.out.println("    Конструкторы:");
        Arrays.stream(aClass.getConstructors()).forEach(System.out::println);

        System.out.println("    Вложенные классы:");
        Arrays.stream(aClass.getDeclaredClasses()).forEach(System.out::println);
    }
}
