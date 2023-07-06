package com.academy.yatskevich.lesson18;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getMethods();
        List<String> methodsList = Arrays.stream(methods)
                .filter(method -> !Modifier.isStatic(method.getModifiers()))
                .map(Method::getName).toList();
        System.out.println(methodsList);
    }
}
