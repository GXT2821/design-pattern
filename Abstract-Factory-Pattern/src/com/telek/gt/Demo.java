package com.telek.gt;

import com.telek.gt.factory.Factory;
import com.telek.gt.factory.imp.BlueFactory;
import com.telek.gt.factory.imp.RedFactory;
import com.telek.gt.product.Button;
import com.telek.gt.product.Text;

public class Demo {

    public static void main(String[] args){
        Factory factory = new RedFactory();
        Button button = factory.createButton();
        Text text = factory.createText();
        Factory blueFactory = new BlueFactory();
        Button button1 = blueFactory.createButton();
        Text text1 = blueFactory.createText();
        button.display();
        button1.display();
        text.display();
        text1.display();
    }
}
