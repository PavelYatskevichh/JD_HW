package com.academy.yatskevich.lesson13;

public class IllegalDateException extends Exception {
    public IllegalDateException() {
    }

    public IllegalDateException(String message) {
        super(message);
    }

    public IllegalDateException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalDateException(Throwable cause) {
        super(cause);
    }
}
