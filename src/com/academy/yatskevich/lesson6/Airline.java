package com.academy.yatskevich.lesson6;

import java.util.Arrays;

public class Airline {

    public int countTotalCapacity(Aircraft... aircraft) {
        int total = 0;
        for (Aircraft value : aircraft) {
            total += value.getCapacity();
        }
        return total;
    }

    public int countTotalLoadCapacity(Aircraft... aircraft) {
        int total = 0;
        for (Aircraft value : aircraft) {
            total += value.getLoadCapacity();
        }
        return total;
    }

    public int countAverageFlightRange(Aircraft... aircraft) {
        int total = 0;
        for (Aircraft value : aircraft) {
            total += value.getFlightRange();
        }
        return total / aircraft.length;
    }

    public Aircraft[] aircraftsToArray(Aircraft... aircraft) {
        Aircraft[] aircrafts = new Aircraft[aircraft.length];
        for (int i = 0; i < aircrafts.length; i++) {
            aircrafts[i] = aircraft[i];
        }
        return aircrafts;
    }

    public void sortAccordingFlightRange(Aircraft[] aircrafts) {
        if (aircrafts.length < 2) {
            return;
        }
        int mid = aircrafts.length / 2;
        Aircraft[] l = new Aircraft[mid];
        Aircraft[] r = new Aircraft[aircrafts.length - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = aircrafts[i];
        }
        for (int i = mid; i < aircrafts.length; i++) {
            r[i - mid] = aircrafts[i];
        }

        sortAccordingFlightRange(l);
        sortAccordingFlightRange(r);

        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i].getFlightRange() <= r[j].getFlightRange()) {
                aircrafts[k++] = l[i++];
            } else {
                aircrafts[k++] = r[j++];
            }
        }
        while (i < l.length) {
            aircrafts[k++] = l[i++];
        }
        while (j < r.length) {
            aircrafts[k++] = r[j++];
        }
    }

    public void findAccordingCapacity(Aircraft[] aircrafts, int capacity) {
        System.out.println("Аппрат(ы) с искомой вместительностью: ");
        for (int i = 0; i < aircrafts.length; i++) {
            if (aircrafts[i].getCapacity() == capacity) {
                System.out.println(aircrafts[i].getName());
            }
        }
    }

    public void findAccordingLoadCapacity(Aircraft[] aircrafts, int loadCapacity) {
        System.out.println("Аппрат(ы) с искомой грузоподъемностью: ");
        for (int i = 0; i < aircrafts.length; i++) {
            if (aircrafts[i].getLoadCapacity() == loadCapacity) {
                System.out.println(aircrafts[i].getName());
            }
        }
    }

    public void findAccordingFlightRange(Aircraft[] aircrafts, int flightRange) {
        System.out.println("Аппрат(ы) с искомой дальностью полёта: ");
        for (int i = 0; i < aircrafts.length; i++) {
            if (aircrafts[i].getFlightRange() == flightRange) {
                System.out.println(aircrafts[i].getName());
            }
        }
    }

    public void findAccordingParameters(Aircraft[] aircrafts, int loadCapacity, int flightRange, int capacity) {
        System.out.println("Аппрат(ы) с искомыми параметрами: ");
        for (int i = 0; i < aircrafts.length; i++) {
            if (aircrafts[i].getLoadCapacity() == loadCapacity && aircrafts[i].getFlightRange() == flightRange
            && aircrafts[i].getCapacity() == capacity) {
                System.out.println(aircrafts[i].getName());
            }
        }
    }
}
