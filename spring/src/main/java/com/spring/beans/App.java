package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBeans myBean = (MyBeans) context.getBean("myBean");
        System.out.println(myBean);
    }
}
