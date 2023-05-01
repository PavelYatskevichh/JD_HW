package com.academy.yatskevich.lesson6.extra;

public class Cinema extends PublicBuilding{
    String visitor;
    boolean ticket;
    int maxDurationOfFilm;
    int currentDurationOfFilm;

    public Cinema(String visitor, boolean ticket){
        this.visitor = visitor;
        this.ticket = ticket;
        countingVisitors();
    }

    @Override
    public boolean pass() {
        return ticket;
    }

    @Override
    public void announceBreak() {
        while (true) {
            if (currentDurationOfFilm >= maxDurationOfFilm) {
                System.out.println("Перерыв!");
            }
        }
    }

    @Override
    public void feed() {
        System.out.println("Кормить " + visitor);
    }

    public int getCurrentNumberOfVisitors() {
        return count;
    }
}
