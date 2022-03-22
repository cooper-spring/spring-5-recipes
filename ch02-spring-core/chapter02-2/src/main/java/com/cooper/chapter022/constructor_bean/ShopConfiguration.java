package com.cooper.chapter022.constructor_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfiguration {

    @Bean
    public Product battery() {
        return new Battery("에너자이저", 2.5);
    }

    @Bean
    public Product disc() {
        return new Disc("디스크", 3.0);
    }

}
