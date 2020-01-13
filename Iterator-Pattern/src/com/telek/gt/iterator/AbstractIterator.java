package com.telek.gt.iterator;

public interface AbstractIterator {

    public void next();
    public boolean isLast();
    public void previous();
    public boolean isFrist();
    public Object getNextItem();
    public Object getPrevious();
}
