package com.cooper.chapter023.config;

import com.cooper.chapter023.DatePrefixGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrefixConfiguration {

    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        return new DatePrefixGenerator("yyyyMMdd ");
    }

}
