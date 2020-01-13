package com.telek.gt.entity.imp;

import com.telek.gt.entity.Product;

public class Computer implements Product {
    @Override
    public void display() {
        System.out.println("This is the Computer!");
    }
}
