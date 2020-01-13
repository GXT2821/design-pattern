package com.telek.gt.approver;

import com.telek.gt.request.PurchaseRequest;

public abstract class Approver {
    protected String name;

    protected Approver approver;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PurchaseRequest request);
}
