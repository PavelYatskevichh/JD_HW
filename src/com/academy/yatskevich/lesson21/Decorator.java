package com.academy.yatskevich.lesson21;

public abstract class Decorator implements Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    public abstract void add();

    @Override
    public void drink() {
        drink.drink();
        add();
    }
}
