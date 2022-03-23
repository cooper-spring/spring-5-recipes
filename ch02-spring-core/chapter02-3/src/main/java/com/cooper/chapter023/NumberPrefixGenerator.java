package com.cooper.chapter023;

import java.util.Random;

public class NumberPrefixGenerator implements PrefixGenerator {

    private final Random randomGenerator = new Random();

    public String getPrefix() {
        return String.format("%03d", randomGenerator.nextInt(100));
    }

}
