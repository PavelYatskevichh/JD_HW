package com.academy.yatskevich.lesson6;

abstract class UnmannedAircraft extends Aircraft {
    private int signalReachArea;

    {
        setCapacity(0);
    }

    public UnmannedAircraft(String name, int loadCapacity, int flightRange, int signalReachArea) {
        super(name, loadCapacity, flightRange);
        setSignalPeachArea(signalReachArea);
    }

    public UnmannedAircraft(String name, int loadCapacity, int flightRange) {
        super(name, loadCapacity, flightRange);
    }

    public int getSignalPeachArea() {
        return signalReachArea;
    }

    public void setSignalPeachArea(int signalReachArea) {
        if (signalReachArea >= 0) {
            this.signalReachArea = signalReachArea;
        }
    }
}
