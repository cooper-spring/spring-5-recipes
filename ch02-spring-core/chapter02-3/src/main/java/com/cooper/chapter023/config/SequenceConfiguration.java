package com.cooper.chapter023.config;

import com.cooper.chapter023.NumberPrefixGenerator;
import com.cooper.chapter023.PrefixGenerator;
import com.cooper.chapter023.SequenceGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PrefixConfiguration.class)
public class SequenceConfiguration {

    @Value("#{datePrefixGenerator}")
    private PrefixGenerator prefixGenerator;

    @Bean
    public SequenceGenerator sequenceGenerator() {
        return new SequenceGenerator(prefixGenerator, "A", 100000);
    }

    @Bean
    public NumberPrefixGenerator numberPrefixGenerator() {
        return new NumberPrefixGenerator();
    }

}
