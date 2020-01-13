package com.telek.gt.factory.imp;

import com.telek.gt.factory.Factory;
import com.telek.gt.product.Button;
import com.telek.gt.product.Text;
import com.telek.gt.product.imp.BlueButton;
import com.telek.gt.product.imp.BlueText;

public class BlueFactory implements Factory {
    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public Text createText() {
        return new BlueText();
    }
}
