package com.telek.gt.proxy.imp;

import com.telek.gt.proxy.Subject;

public class RealSubject implements Subject {
    private String name = "aa";
    @Override
    public void visit() {
        System.out.println(name);
    }
}
