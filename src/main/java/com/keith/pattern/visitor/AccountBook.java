package com.keith.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class AccountBook {

    private final List<Bill> billList = new ArrayList<Bill>();
    public void addBill(Bill bill){
        billList.add(bill);
    }
    public void show(Visitor visitor) {
        for (Bill bill : billList) {
            bill.accept(visitor);
        }
    }
    }
