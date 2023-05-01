package com.academy.yatskevich.lesson6;

abstract class Aircraft {
    private String name;
    private int capacity;
    private int loadCapacity;
    private int flightRange;

    public Aircraft(String name, int loadCapacity, int flightRange) {
        setName(name);
        setLoadCapacity(loadCapacity);
        setFlightRange(flightRange);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        if (loadCapacity >= 0) {
            this.loadCapacity = loadCapacity;
        }
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        if (flightRange >= 0) {
            this.flightRange = flightRange;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        }
    }
}