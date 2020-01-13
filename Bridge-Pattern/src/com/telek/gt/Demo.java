package com.telek.gt;

import com.telek.gt.extend.BigBrush;
import com.telek.gt.imp.RedColor;

public class Demo {

    public static void main(String[] args){
        Brush brush = new BigBrush();
        Color color = new RedColor();
        brush.setColor(color);
        brush.operation();
    }
}
