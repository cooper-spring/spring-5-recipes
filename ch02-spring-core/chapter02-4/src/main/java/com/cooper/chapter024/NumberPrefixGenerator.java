package com.cooper.chapter024;

import java.util.Random;

@NumberPrefixAnnotation
public class NumberPrefixGenerator implements PrefixGenerator {

    private final Random randomGenerator = new Random();

    public String getPrefix() {
        return String.format("%03d", randomGenerator.nextInt(100));
    }

}
