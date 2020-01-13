package com.telek.gt.factory.imp;

import com.telek.gt.factory.Factory;
import com.telek.gt.product.Button;
import com.telek.gt.product.Text;
import com.telek.gt.product.imp.RedButton;
import com.telek.gt.product.imp.RedText;

public class RedFactory implements Factory {
    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public Text createText() {
        return new RedText();
    }
}
