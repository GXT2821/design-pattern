package com.telek.gt;

import com.telek.gt.entity.Product;
import com.telek.gt.entity.ProductFactory;
import com.telek.gt.enumtype.ProductType;

public class Demo {

    public static void main(String[] args){
        Product product = ProductFactory.getProduct(ProductType.COMPUTER);
        product.display();
    }
}
