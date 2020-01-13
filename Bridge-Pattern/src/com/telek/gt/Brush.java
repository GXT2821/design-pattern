package com.telek.gt;

public abstract class Brush {

    protected  Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void operation();

}
