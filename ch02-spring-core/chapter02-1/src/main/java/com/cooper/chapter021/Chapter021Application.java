package com.cooper.chapter021;

import com.cooper.chapter021.component.SequenceDao;
import com.cooper.chapter021.config.SequenceGenerator;
import com.cooper.chapter021.config.SequenceGeneratorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

//ComponentScan customizing
@ComponentScan(
        includeFilters = {
                @ComponentScan.Filter( // 범위를 지정해서 원하는 빈만 스캔할 수 있음
                        type = FilterType.REGEX,
                        pattern = {
                                "com.cooper.chapter021.component.*Dao",
                                "com.cooper.chapter021.config.SequenceGeneratorConfiguration",
                        }
                ),
        },
        excludeFilters = {
                @ComponentScan.Filter( // 컴포넌트 필터를 통해 제외시킬 수 있음
                        type = FilterType.ANNOTATION,
                        classes = {org.springframework.stereotype.Controller.class}
                )
        }
)
public class Chapter021Application {

    public static void main(String[] args) {

        // 1. Configuration 방식
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
        SequenceGenerator generator = (SequenceGenerator) applicationContext1.getBean("sequenceGenerator");

        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());

        // 2. ComponentScan 방식
        AnnotationConfigApplicationContext applicationContext2
                = new AnnotationConfigApplicationContext("com.cooper.chapter021.component");
        SequenceDao sequenceDao = applicationContext2.getBean(SequenceDao.class);

        System.out.println(sequenceDao.getNextValue("IT"));
        System.out.println(sequenceDao.getNextValue("IT"));
    }

}
