package com.academy.yatskevich.lesson6;

abstract class MannedAircraft extends Aircraft {

    public MannedAircraft(String name, int loadCapacity, int flightRange, int capacity) {
        super(name, loadCapacity, flightRange);
        setCapacity(capacity);
    }
}
