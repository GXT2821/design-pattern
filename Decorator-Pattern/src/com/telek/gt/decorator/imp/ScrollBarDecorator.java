package com.telek.gt.decorator.imp;

import com.telek.gt.Component;
import com.telek.gt.decorator.ComponentDecorator;

public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.scrollBar();
        super.display();

    }

    public void scrollBar(){
        System.out.println("滚动条");
    }
}
