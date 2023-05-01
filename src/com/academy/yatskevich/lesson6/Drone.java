package com.academy.yatskevich.lesson6;

public class Drone extends UnmannedAircraft{
    private final int wings;

    {
        wings = 2;
    }

    public int getWings() {
        return wings;
    }

    public Drone(String name, int loadCapacity, int flightRange, int signalReachArea) {
        super(name, loadCapacity, flightRange, signalReachArea);
    }

    public Drone(String name, int loadCapacity, int flightRange) {
        super(name, loadCapacity, flightRange);
    }
}
