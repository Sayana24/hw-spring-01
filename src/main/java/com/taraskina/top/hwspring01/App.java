package com.taraskina.top.hwspring01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Language day = context.getBean("onItalianBean", Language.class);
        day.printDay();

        Person person = context.getBean("personBean", Person.class);
        person.sayDay();

        context.close();
    }

}
