package com.telek.gt.proxy.imp.staticproxy;

import com.telek.gt.proxy.Subject;

public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }
    @Override
    public void visit() {
        subject.visit();
    }
}
