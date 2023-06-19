package com.academy.yatskevich.lesson15;

public class Adder extends Thread {
    static int count = 0;

    @Override
    public void run() {
        count++;
        if (count == 1 || count % 10 == 0) {
            throw new RuntimeException();
        }
        for (int i = 0; i < 500; i++) {
            ++Task3.value;
        }
    }
}
