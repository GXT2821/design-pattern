package com.telek.gt.product.imp;

import com.telek.gt.product.Product;

public class Cola implements Product {
    @Override
    public void out() {
        System.out.println("This is a Cola!");
    }
}
