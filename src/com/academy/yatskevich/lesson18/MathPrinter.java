package com.academy.yatskevich.lesson18;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MathPrinter {
    public static void main(String[] args) {
        Class<Math> aClass = Math.class;
        Method[] methods = aClass.getMethods();
        Field[] fields = aClass.getFields();

        for (Field field : fields) {
            int modifier = field.getModifiers();
            System.out.print(Modifier.toString(modifier) + " "
                    + field.getName() + "\n");
        }

        for (Method method : methods) {
            int modifier = method.getModifiers();
            System.out.print(Modifier.toString(modifier) + " "
                    + method.getReturnType().getSimpleName() + " "
                    + method.getName());

            Class<?>[] types = method.getParameterTypes();
            System.out.print("(");
            for (int i = 0; i < types.length; i++) {
                if (i >= 1) {
                    System.out.print(", ");
                }
                System.out.print(types[i].getSimpleName());
            }
            System.out.print(")\n");
        }
    }
}
