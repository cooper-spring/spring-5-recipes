package com.cooper.chapter024;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Chapter024Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("appContext.xml");
        SequenceGenerator generator = (SequenceGenerator) applicationContext.getBean("sequenceGenerator");

        System.out.println(generator.getSequence());
    }

}
