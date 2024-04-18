package com.taraskina.top.hwspring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Language day = context.getBean("onItalianBean", Language.class);
        day.printDay();

        Person person = context.getBean("personBean", Person.class);
        person.sayDay();

        context.close();
    }

}
