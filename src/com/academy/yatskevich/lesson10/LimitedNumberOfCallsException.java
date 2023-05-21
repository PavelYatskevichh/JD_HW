package com.academy.yatskevich.lesson10;

public class LimitedNumberOfCallsException extends Exception{
    private int countOfCalls = 0;

    public LimitedNumberOfCallsException() {
        countingCalls();
    }

    public LimitedNumberOfCallsException(String message) {
        super(message);
        countingCalls();
    }

    public LimitedNumberOfCallsException(String message, Throwable cause) {
        super(message, cause);
        countingCalls();
    }

    public LimitedNumberOfCallsException(Throwable cause) {
        super(cause);
        countingCalls();
    }

    public void countingCalls() {
        this.countOfCalls++;
    }
}

