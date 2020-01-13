package com.telek.gt.iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
    private List<Object> list = new ArrayList<>();

    public AbstractObjectList(List object){
        this.list = object;
    }

    public void add(Object object){
        list.add(object);
    }

    public void remove(Object object){
        list.remove(object);
    }

    public List getObjects(){
        return list;
    }

    public abstract AbstractIterator abstractIterator();
}
