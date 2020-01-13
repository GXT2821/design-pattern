package com.telek.gt.entity;

import com.telek.gt.entity.imp.Computer;
import com.telek.gt.entity.imp.Phone;
import com.telek.gt.enumtype.ProductType;

public class ProductFactory {

    public static Product getProduct(ProductType type){
        Product product = null;
        if(ProductType.PHONE.equals(type)){
            product = new Phone();
            System.out.println("创建一个Phone对象！");
        }else if(ProductType.COMPUTER.equals(type)){
            product = new Computer();
            System.out.println("创建一个Computer对象！");
        }
        return product;
    }
}
