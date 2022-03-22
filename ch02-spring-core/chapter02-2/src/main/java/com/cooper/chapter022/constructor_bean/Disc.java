package com.cooper.chapter022.constructor_bean;

import lombok.ToString;

@ToString(callSuper = true)
public class Disc extends Product {

    public Disc(String name, double price) {
        super(name, price);
    }

}
