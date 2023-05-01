package com.academy.yatskevich.lesson6;

public class Helicopter extends MannedAircraft {

    private int propellers;

    public Helicopter(String name, int loadCapacity, int flightRange, int capacity, int propellers) {
        super(name, loadCapacity, flightRange, capacity);
        setPropellers(propellers);
    }

    public Helicopter(String name, int loadCapacity, int flightRange, int capacity) {
        super(name, loadCapacity, flightRange, capacity);
    }

    public int getPropellers() {
        return propellers;
    }

    public void setPropellers(int propellers) {
        if (propellers > 0) {
            this.propellers = propellers;
        }
    }
}
