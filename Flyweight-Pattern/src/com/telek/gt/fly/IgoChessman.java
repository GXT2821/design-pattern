package com.telek.gt.fly;

public abstract class IgoChessman {
    public abstract String getColor();

    public void display(){
        System.out.println("颜色:" + this.getColor());
    }

}
