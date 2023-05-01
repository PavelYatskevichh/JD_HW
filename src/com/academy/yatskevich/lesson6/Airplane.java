package com.academy.yatskevich.lesson6;

public class Airplane extends MannedAircraft {
    private int wings;

    public Airplane(String name, int loadCapacity, int flightRange, int capacity, int wings) {
        super(name, loadCapacity, flightRange, capacity);
        setWings(wings);
    }

    public Airplane(String name, int loadCapacity, int flightRange, int capacity) {
        super(name, loadCapacity, flightRange, capacity);
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        if (wings > 0 && wings % 2 == 0) {
            this.wings = wings;
        }
    }
}
