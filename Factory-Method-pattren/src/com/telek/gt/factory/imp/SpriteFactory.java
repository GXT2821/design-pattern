package com.telek.gt.factory.imp;

import com.telek.gt.factory.Factory;
import com.telek.gt.product.Product;
import com.telek.gt.product.imp.Sprite;

public class SpriteFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Sprite();
    }
}
