package com.academy.yatskevich.lesson6.extra;

abstract public class PublicBuilding implements Building{
    int count;
    @Override
    public int countingVisitors(){
        return count++;
    }

    @Override
    abstract public boolean pass();

    @Override
    abstract public void announceBreak();

    @Override
    public void feed() {
        System.out.println("Кормить кого-то.");
    }
}
