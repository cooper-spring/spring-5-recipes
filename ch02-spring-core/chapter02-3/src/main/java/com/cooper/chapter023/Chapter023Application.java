package com.cooper.chapter023;

import com.cooper.chapter023.config.SequenceConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Chapter023Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(SequenceConfiguration.class);

        SequenceGenerator generator = applicationContext.getBean(SequenceGenerator.class);

        System.out.println(generator.getSequence());
    }

}
