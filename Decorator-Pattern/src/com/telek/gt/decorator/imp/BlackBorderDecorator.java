package com.telek.gt.decorator.imp;

import com.telek.gt.Component;
import com.telek.gt.decorator.ComponentDecorator;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.blackBorder();
        super.display();
    }

    public void blackBorder(){
        System.out.println("黑色边框");
    }
}
