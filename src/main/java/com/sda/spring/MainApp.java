package com.sda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        AbbaFatima obj = (AbbaFatima) context.getBean("abbaFatima");
        obj.getMessage();
    }
}
