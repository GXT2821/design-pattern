package com.telek.gt.factory.imp;

import com.telek.gt.factory.Factory;
import com.telek.gt.product.Product;
import com.telek.gt.product.imp.Cola;

public class ColaFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Cola();
    }
}
