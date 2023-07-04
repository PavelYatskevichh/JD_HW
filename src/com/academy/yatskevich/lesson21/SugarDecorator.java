package com.academy.yatskevich.lesson21;

public class SugarDecorator extends Decorator {
    public SugarDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void add() {
        System.out.print(" with sugar");
    }
}
