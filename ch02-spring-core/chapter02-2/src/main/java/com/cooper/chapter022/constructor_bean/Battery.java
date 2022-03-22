package com.cooper.chapter022.constructor_bean;

import lombok.ToString;

@ToString(callSuper = true)
public class Battery extends Product {

    private boolean rechargeable;

    public Battery(String name, double price) {
        super(name, price);
    }

}
