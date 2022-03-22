package com.cooper.chapter022.constructor_bean;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public abstract class Product {

    private final String name;

    private final double price;

}
