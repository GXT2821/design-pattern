package com.telek.gt.client;

import com.telek.gt.builder.Builder;
import com.telek.gt.builder.imp.ProductABuilder;
import com.telek.gt.director.Director;
import com.telek.gt.product.Product;

public class Client {

    public static void main(String[] args){
        Builder builder = new ProductABuilder();
        Director director = new Director(builder);
        Product construct = director.construct();
        System.out.println(construct.toString());
    }
}
