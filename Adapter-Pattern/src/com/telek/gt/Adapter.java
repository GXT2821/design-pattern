package com.telek.gt;

public class Adapter implements Target {
    private AC220V ac220V;

    public Adapter(AC220V ac220V){
        this.ac220V = ac220V;
    }
    @Override
    public void AC5V(String arg) {
        ac220V.out(arg);
    }
}
