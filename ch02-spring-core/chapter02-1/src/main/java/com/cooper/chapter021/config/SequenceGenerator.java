package com.cooper.chapter021.config;

import lombok.RequiredArgsConstructor;

import java.util.concurrent.atomic.AtomicInteger;

@RequiredArgsConstructor
public class SequenceGenerator {

    private final String prefix;

    private final String suffix;

    private final String initial;

    private final AtomicInteger atomicInteger = new AtomicInteger();

    public String getSequence() {
        StringBuilder builder = new StringBuilder();
        return builder.append(prefix)
                .append(initial)
                .append(atomicInteger.getAndIncrement())
                .append(suffix)
                .toString();
    }
}
