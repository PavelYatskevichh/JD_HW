package com.academy.yatskevich.lesson6.extra;

public class School extends PublicBuilding{
    String student;
    boolean schoolPass;
    final int maxDurationOfLesson = 45;
    int currentDurationOfLesson;

    public School(String visitor, boolean ticket){
        this.student = visitor;
        this.schoolPass = ticket;
        countingVisitors();
    }

    @Override
    public boolean pass() {
        return schoolPass;
    }

    @Override
    public void announceBreak() {
        while (true) {
            if (currentDurationOfLesson >= maxDurationOfLesson) {
                System.out.println("Перерыв!");
            }
        }
    }

    @Override
    public void feed() {
        System.out.println("Кормить " + student);
    }

    public int getCurrentNumberOfStudents() {
        return count;
    }
}
