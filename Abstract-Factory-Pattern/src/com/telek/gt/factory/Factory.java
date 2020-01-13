package com.telek.gt.factory;

import com.telek.gt.product.Button;
import com.telek.gt.product.Text;

public interface Factory {

    public Button createButton();

    public Text createText();
}
