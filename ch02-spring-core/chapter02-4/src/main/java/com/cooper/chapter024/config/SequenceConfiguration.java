package com.cooper.chapter024.config;

import com.cooper.chapter024.DatePrefixGenerator;
import com.cooper.chapter024.NumberPrefixGenerator;
import com.cooper.chapter024.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceConfiguration {
    
    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        return new DatePrefixGenerator("yyyyMMdd");
    }

    @Bean
    public NumberPrefixGenerator numberPrefixGenerator() {
        return new NumberPrefixGenerator();
    }

    @Bean
    public SequenceGenerator sequenceGenerator() {
        return new SequenceGenerator("A", 100000);
    }
}