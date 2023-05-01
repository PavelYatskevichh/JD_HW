package com.academy.yatskevich.lesson6;

public class Quadcopter extends UnmannedAircraft{
    private final int propellers;

    {
        propellers = 2;
    }

    public int getPropellers() {
        return propellers;
    }

    public Quadcopter(String name, int loadCapacity, int flightRange, int signalReachArea) {
        super(name, loadCapacity, flightRange, signalReachArea);
    }

    public Quadcopter(String name, int loadCapacity, int flightRange) {
        super(name, loadCapacity, flightRange);
    }
}
