package com.telek.gt.builder.imp;

import com.telek.gt.builder.Builder;

public class ProductABuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("PartB");
    }

    @Override
    public void buildPartC() {
        product.setPratC("PartC");
    }
}
