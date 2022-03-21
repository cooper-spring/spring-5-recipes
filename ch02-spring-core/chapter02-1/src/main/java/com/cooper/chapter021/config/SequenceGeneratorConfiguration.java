package com.cooper.chapter021.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfiguration {

    @Bean
    public SequenceGenerator sequenceGenerator() {
        return new SequenceGenerator("30", "A", "10000");
    }

}
