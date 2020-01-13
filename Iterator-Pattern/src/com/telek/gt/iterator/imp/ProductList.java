package com.telek.gt.iterator.imp;

import com.telek.gt.iterator.AbstractIterator;
import com.telek.gt.iterator.AbstractObjectList;

import java.util.List;

public class ProductList extends AbstractObjectList {
    public ProductList(List object) {
        super(object);
    }

    @Override
    public AbstractIterator abstractIterator() {
        return new ProductIterator(this);
    }
}
