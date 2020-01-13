package com.telek.gt;

/**
 * 懒汉式单例模式--延迟加载
 */
public class LazySingleton {

    private volatile static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }

    public LazySingleton getInstance(){
        //1.线程不安全
       /* if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;*/
       //2.双重检查锁定实现线程安全
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
