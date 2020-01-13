package com.telek.gt;

import com.telek.gt.component.TextBox;
import com.telek.gt.decorator.imp.BlackBorderDecorator;
import com.telek.gt.decorator.imp.ScrollBarDecorator;

public class Demo {

    public static void main(String[] args){
        Component component = new TextBox();
        Component component1 = new ScrollBarDecorator(component);
        Component component2 = new BlackBorderDecorator(component1);
        component2.display();
    }
}
