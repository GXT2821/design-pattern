package com.telek.gt;

/**
 * 静态内部类实现单例模式延迟加载与线程安全
 */
public class Singleton {
    private  Singleton(){

    }

    private static class HolderClass{
        private final  static Singleton instance = new Singleton();
    }

    public Singleton getInstance(){
        return HolderClass.instance;
    }
}
