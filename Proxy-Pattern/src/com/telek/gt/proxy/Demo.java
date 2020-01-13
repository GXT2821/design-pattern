package com.telek.gt.proxy;

import com.telek.gt.proxy.imp.dynamicproxy.DynProxy;
import com.telek.gt.proxy.imp.staticproxy.ProxySubject;
import com.telek.gt.proxy.imp.RealSubject;

import java.lang.reflect.Proxy;

public class Demo {

    public static void main(String[] args){
        //静态代理
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();

        //动态代理
        Subject subject = new RealSubject();
        DynProxy dynProxy = new DynProxy(subject);
        Subject subject1 = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), dynProxy);
        subject1.visit();
    }
}
