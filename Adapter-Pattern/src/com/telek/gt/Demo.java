package com.telek.gt;

public class Demo {

    public static void main(String[] args){
        AC220V ac220V = new AC220V();
        Target target = new Adapter(ac220V);
        target.AC5V("5V");
    }
}
