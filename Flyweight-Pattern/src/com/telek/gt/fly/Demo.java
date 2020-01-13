package com.telek.gt.fly;

import com.telek.gt.fly.factory.IgochessmanFactory;

public class Demo {

    public static void main(String[] args){
        IgochessmanFactory igochessmanFactory = IgochessmanFactory.getInstance();
        IgoChessman w = igochessmanFactory.getIgoChessman("w");
        IgoChessman w2 = igochessmanFactory.getIgoChessman("w");
        IgoChessman w3 = igochessmanFactory.getIgoChessman("w");
        System.out.println(w == w2);
        IgoChessman b = igochessmanFactory.getIgoChessman("b");
        IgoChessman b2 = igochessmanFactory.getIgoChessman("b");
        IgoChessman b3 = igochessmanFactory.getIgoChessman("b");
        System.out.println(b2 == b3);
    }
}
