package com.telek.gt.entity.imp;

import com.telek.gt.entity.Product;

public class Phone implements Product {
    @Override
    public void display() {
        System.out.println("This is the Mobile Phone!");
    }
}
