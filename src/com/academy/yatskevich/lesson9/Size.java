package com.academy.yatskevich.lesson9;

public class Size<T extends Line<?>> {
    private Line<?> sizes;

    public Size(Line<?> size) {
        this.sizes = size;
    }

    public Line<?> getSizes() {
        return sizes;
    }

    public void setSizes(Line<?> sizes) {
        this.sizes = sizes;
    }
}
