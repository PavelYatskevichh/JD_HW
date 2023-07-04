package com.academy.yatskevich.lesson21;

public class SyrupDecorator extends Decorator {
    public SyrupDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void add() {
        System.out.print(" with syrup");
    }
}
