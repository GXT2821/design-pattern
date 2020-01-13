package com.telek.gt;

import com.telek.gt.approver.Approver;
import com.telek.gt.approver.extend.Director;
import com.telek.gt.approver.extend.President;
import com.telek.gt.approver.extend.VicePresident;
import com.telek.gt.request.PurchaseRequest;

public class Demo {
    public static void main(String[] args){
        Approver a1 = new Director("主任1");
        Approver a2 = new VicePresident("副董事长1");
        Approver a3 = new President("董事长1");
        a1.setApprover(a2);
        a2.setApprover(a3);
        PurchaseRequest request1 = new PurchaseRequest(3000, 1001, "文件夹");
        a1.processRequest(request1);
        PurchaseRequest request2 = new PurchaseRequest(70000, 1002, "书柜");
        a1.processRequest(request2);
        PurchaseRequest request3 = new PurchaseRequest(200000, 1003, "电脑");
        a1.processRequest(request3);

    }
}
