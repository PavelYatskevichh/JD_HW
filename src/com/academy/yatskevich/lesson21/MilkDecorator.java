package com.academy.yatskevich.lesson21;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void add() {
        System.out.print(" with milk");
    }
}
