package com.cooper.chapter023;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {

    //@Qualifier("datePrefixGenerator") - 후보 빈을 명시할 수 있음
    @Resource(name = "datePrefixGenerator") // @Autowired + @Qualifier
    private final PrefixGenerator prefixGenerator;

    private final String suffix;

    private final int initial;

    private final AtomicInteger counter = new AtomicInteger();

    public SequenceGenerator(PrefixGenerator prefixGenerator, String suffix, int initial) {
        this.prefixGenerator = prefixGenerator;
        this.suffix = suffix;
        this.initial = initial;
    }

    public String getSequence() {
        return prefixGenerator.getPrefix() +
                initial +
                counter.getAndIncrement() +
                suffix;
    }

}
