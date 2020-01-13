package com.telek.gt.entity;

import com.telek.gt.entity.imp.Computer;
import com.telek.gt.entity.imp.Phone;

public class ProductFactory {

    public static Product getProduct(String type){
        Product product = null;
        if("A".equals(type)){
            product = new Phone();
            System.out.println("创建一个Phone对象！");
        }else if("B".equals(type)){
            product = new Computer();
            System.out.println("创建一个Computer对象！");
        }
        return product;
    }
}
