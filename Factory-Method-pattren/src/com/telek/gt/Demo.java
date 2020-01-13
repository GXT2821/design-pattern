package com.telek.gt;

import com.telek.gt.factory.Factory;
import com.telek.gt.factory.imp.SpriteFactory;
import com.telek.gt.product.Product;

public class Demo {

    public static void main(String[] args){
        Factory factory = new SpriteFactory();
        Product product = factory.createProduct();
        product.out();
    }
}
