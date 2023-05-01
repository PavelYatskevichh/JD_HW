package com.academy.yatskevich.lesson6.extra;

abstract public class Book implements Publication{
    private int page;
    @Override
    public void getInformation() {

    }

    @Override
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
