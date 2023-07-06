package com.academy.yatskevich.lesson18;

public class CallOld {
    @SuppressWarnings("deprication")
    public void callOld() {
        System.out.println(new TestAnnotation().old());
    }

    public static void main(String[] args) {
        new CallOld().callOld();
    }
}
