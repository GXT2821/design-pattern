package com.telek.gt.iterator.imp;

import com.telek.gt.iterator.AbstractIterator;

import java.util.List;

public class ProductIterator implements AbstractIterator {

    private ProductList productList;
    private List products;
    private int cursor1;
    private int cursor2;

    public ProductIterator(ProductList productList){
        this.productList = productList;
        this.products = productList.getObjects();
        this.cursor1 = 0;
        this.cursor2 = products.size() - 1;
    }

    @Override
    public void next() {
        if(cursor1 < products.size()){
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        if(cursor1 == products.size()){
            return true;
        }
        return false;
    }

    @Override
    public void previous() {
        if(cursor2 > -1){
            cursor2--;
        }
    }

    @Override
    public boolean isFrist() {
        if(cursor2 == -1){
            return true;
        }
        return false;
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPrevious() {
        return products.get(cursor2);
    }
}
