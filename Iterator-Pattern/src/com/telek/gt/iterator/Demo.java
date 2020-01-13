package com.telek.gt.iterator;

import com.telek.gt.iterator.imp.ProductIterator;
import com.telek.gt.iterator.imp.ProductList;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");
        AbstractObjectList list = new ProductList(products);
        AbstractIterator iterator = list.abstractIterator();

        System.out.println("正向遍历：");
        while (!iterator.isLast()) {
            System.out.print(iterator.getNextItem() + "，");
            iterator.next();
        }
        System.out.println();


    }
}
