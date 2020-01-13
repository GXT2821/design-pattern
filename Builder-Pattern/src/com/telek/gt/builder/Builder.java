package com.telek.gt.builder;

import com.telek.gt.product.Product;

public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return this.product;
    }
}
