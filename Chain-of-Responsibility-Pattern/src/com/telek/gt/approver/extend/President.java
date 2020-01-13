package com.telek.gt.approver.extend;

import com.telek.gt.approver.Approver;
import com.telek.gt.request.PurchaseRequest;

public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 500000){
            System.out.println("董事长 " + name + " 审批采购单 " + request.getNumber() + " 采购金额 " + request.getAmount() + " 采购目的 " + request.getPurpose());
        }else{
            approver.processRequest(request);
        }
    }
}
