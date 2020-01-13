package com.telek.gt;

import com.telek.gt.entity.Product;
import com.telek.gt.entity.ProductFactory;

public class Demo {

    public static void main(String[] args){
        Product product = ProductFactory.getProduct("B");
        product.display();
    }
}
