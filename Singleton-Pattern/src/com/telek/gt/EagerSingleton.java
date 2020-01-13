package com.telek.gt;

/**
 *  饿汉式单例模式
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){

    }

    public EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
