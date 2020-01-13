package com.telek.gt.product;

public class Product {

    private String partA;
    private String partB;
    private String PratC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPratC() {
        return PratC;
    }

    public void setPratC(String pratC) {
        PratC = pratC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", PratC='" + PratC + '\'' +
                '}';
    }
}
